package com.czeczot.financer.persistance.database_configuration;

import com.czeczot.financer.mongo.collections.Shop;
import com.czeczot.financer.mongo.configuration.MongoConfiguration;
import com.czeczot.financer.mongo.repositories.ShopRepository;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MongoConfiguration.class})
public class MongoConfigurationTest {

    @Autowired
    private ShopRepository shopRepository;

    @Before
    public void init() {
        shopRepository.save(new Shop("id1","firstShop"));
        shopRepository.save(new Shop("id2","secondShop"));
    }

    @After
    public void clean() {
        shopRepository.delete("id1");
        shopRepository.delete("id2");
    }

    @Test
    public void shopRepositoryTest() {
        List<Shop> shops = shopRepository.findAll();
        assertEquals(2, shops.size());
    }
}

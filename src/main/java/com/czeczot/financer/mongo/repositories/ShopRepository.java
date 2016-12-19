package com.czeczot.financer.mongo.repositories;

import com.czeczot.financer.mongo.collections.Shop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ShopRepository extends MongoRepository<Shop, String> {

    Shop findByName(String name);
}

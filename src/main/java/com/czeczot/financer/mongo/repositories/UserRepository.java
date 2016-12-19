package com.czeczot.financer.mongo.repositories;

import com.czeczot.financer.mongo.collections.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{
}

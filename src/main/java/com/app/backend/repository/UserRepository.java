package com.app.backend.repository;

import com.app.backend.dao.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    public User findByUpi_id(String upi_id);

    public User findByName(String name);
}
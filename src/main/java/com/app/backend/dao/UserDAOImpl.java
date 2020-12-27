package com.app.backend.dao;

import com.app.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private final UserRepository repository;

    public UserDAOImpl(UserRepository repository) {
        this.repository = repository;
    }
    @Override
    public List<User> getUser(){
        return repository.findAll();
    }
    @Override
    public User getUserByName(String name){
        return repository.findByName(name);
    }
    @Override
    public User getUserByUpi_id(String upi_id){
        return repository.findByUpi_id(upi_id);
    }
    @Override
    public User addUser(User user){
        return repository.insert(user);
    }
    @Override
    public void deleteUser(User user){
        repository.delete(user);
    }
}

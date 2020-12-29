package com.app.dao;

import com.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    private final UserRepository repository;
    @Autowired
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
    public User getUserByUpi(String upi){
        return repository.getUserByUpi(upi);
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

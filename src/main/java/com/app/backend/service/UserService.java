package com.app.backend.service;

import com.app.backend.dao.User;
import com.app.backend.dao.UserDAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserDAOImpl userDAO;

    @Autowired
    public UserService(UserDAOImpl userDAO){
        this.userDAO = userDAO;
    }
    public List<User> getUser() {
        return userDAO.getUser();
    }
    public User getUserByName(String name) {
        return userDAO.getUserByName(name);
    }
    public User getUserByUpi_id(String upi_id) {
        return userDAO.getUserByUpi_id(upi_id);
    }
    public User addUser(User user) {
        return userDAO.addUser(user);
    }
    public void removeUser(String upi_id) {
        User user = userDAO.getUserByUpi_id(upi_id);
        userDAO.deleteUser(user);
    }
}

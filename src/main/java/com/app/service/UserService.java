package com.app.service;

import com.app.dao.User;
import com.app.dao.UserDAOImpl;
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
    public User getUserByUpi(String upi) {
        return userDAO.getUserByUpi(upi);
    }
    public User addUser(User user) {
        return userDAO.addUser(user);
    }
//    public void removeUser(String upi) {
//        User user = userDAO.getUserByUpi(upi);
//        userDAO.deleteUser(user);
//    }
}

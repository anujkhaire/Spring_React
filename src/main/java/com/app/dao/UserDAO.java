package com.app.dao;

import java.util.List;

public interface UserDAO {
    public List<User> getUser();
    public User getUserByName(String name);
    public User getUserByUpi(String upi);
    public User addUser(User user);
    public void deleteUser(User user);
}

package com.app.backend.dao;

import java.util.List;

public interface UserDAO {
    public List<User> getUser();
    public User getUserByName(String name);
    public User getUserByUpi_id(String upi_id);
    public User addUser(User user);
    public void deleteUser(User user);
}

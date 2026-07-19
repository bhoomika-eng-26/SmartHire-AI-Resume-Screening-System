package com.smarthire.dao;

import com.smarthire.model.User;

public interface UserDAO {

    boolean registerUser(User user);

    User loginUser(String email, String password);

}
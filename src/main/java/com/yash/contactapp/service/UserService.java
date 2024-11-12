package com.yash.contactapp.service;

import com.yash.contactapp.Exception.UserBlockedException;
import com.yash.contactapp.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserService {

    public static final Integer LOGIN_STATUS_ACTIVE = 1;
    public static final Integer LOGIN_STATUS_BLOCKED=2;

    public static final Integer ROLE_ADMIN=1;
    public static final Integer ROLE_USER=2;

    public void register(User u);

    public User login(String loginName, String password) throws UserBlockedException;

    public List<User> getUserList();

    public void changeLoginStatus(Integer userId, Integer loginStatus);

    public boolean isUsernameExist(String username);
}

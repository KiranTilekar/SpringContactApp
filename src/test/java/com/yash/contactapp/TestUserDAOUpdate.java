package com.yash.contactapp;

import com.yash.contactapp.config.SpringRootConfig;
import com.yash.contactapp.dao.UserDAO;
import com.yash.contactapp.domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestUserDAOUpdate {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringRootConfig.class);
        UserDAO userDAO = ctx.getBean(UserDAO.class);

        User u = new User();
        u.setUserId(4);
        u.setName("Kalyani Tilekar");
        u.setPhone("5678");
        u.setEmail("kalyanitilekar@yash.com");
        u.setAddress("Mumbai");

        u.setRole(1);
        u.setLoginStatus(1);
        userDAO.update(u);
        System.out.println("------------ Done updating data ---------------");
    }
}
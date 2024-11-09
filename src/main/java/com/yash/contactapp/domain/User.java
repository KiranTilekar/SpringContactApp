package com.yash.contactapp.domain;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class User {

    private Integer userId;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String loginName;
    private Integer role;
    private Integer LoginStatus;


    public User() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public Integer getLoginStatus() {
        return LoginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        LoginStatus = loginStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", loginName='" + loginName + '\'' +
                ", role=" + role +
                ", LoginStatus=" + LoginStatus +
                '}';
    }
}

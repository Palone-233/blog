package com.hzp.blog.blog.model;

import java.io.Serializable;

/**
 * @author hzp
 * @date 2019/11/6 12:21
 * @description
 */
public class User implements Serializable {
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", truename='" + truename + '\'' +
                ", birthday='" + birthday + '\'' +
                ", email='" + email + '\'' +
                ", personalBrief='" + personalBrief + '\'' +
                ", recentlyLanded='" + recentlyLanded + '\'' +
                ", avatarlmgUrl='" + avatarlmgUrl + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getGender() {
        return gender;
    }

    public String getTruename() {
        return truename;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPersonalBrief() {
        return personalBrief;
    }

    public String getRecentlyLanded() {
        return recentlyLanded;
    }

    public String getAvatarlmgUrl() {
        return avatarlmgUrl;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPersonalBrief(String personalBrief) {
        this.personalBrief = personalBrief;
    }

    public void setRecentlyLanded(String recentlyLanded) {
        this.recentlyLanded = recentlyLanded;
    }

    public void setAvatarlmgUrl(String avatarlmgUrl) {
        this.avatarlmgUrl = avatarlmgUrl;
    }

    private int id;
    private String phone;
    private String username;
    private String password;
    private String gender;
    private String truename;
    private String birthday;
    private String email;
    private String personalBrief;
    private String recentlyLanded;
    private String avatarlmgUrl;

    public User(String phone, String username, String password, String gender) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
    }

    public User(String phone, String username, String password, String gender, String truename, String birthday, String email, String personalBrief, String recentlyLanded, String avatarlmgUrl) {
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.truename = truename;
        this.birthday = birthday;
        this.email = email;
        this.personalBrief = personalBrief;
        this.recentlyLanded = recentlyLanded;
        this.avatarlmgUrl = avatarlmgUrl;
    }

    public User(int id, String phone, String username, String password, String gender, String truename, String birthday, String email, String personalBrief, String recentlyLanded, String avatarlmgUrl) {
        this.id=id;
        this.phone = phone;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.truename = truename;
        this.birthday = birthday;
        this.email = email;
        this.personalBrief = personalBrief;
        this.recentlyLanded = recentlyLanded;
        this.avatarlmgUrl = avatarlmgUrl;
    }
}

package com.thoughtworks.cathywu.model;

/**
 * Created by lzwu on 10/14/14.
 */
public class User extends KeyItem {
    private String email;
    private int age;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.aeolia.domain;

import java.util.List;

public class VO {
    private List<User> users;

    @Override
    public String toString() {
        return "VO{" +
                "users=" + users +
                '}';
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}

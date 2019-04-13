package com.itheima.domain;

import java.io.Serializable;

/**
 * @author zwhui
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String userpwd;
    private String name;

    public User() {
    }

    public User(Integer id, String username, String userpwd, String name) {
        this.id = id;
        this.username = username;
        this.userpwd = userpwd;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", userpwd='" + userpwd + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

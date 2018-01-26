package com.honeypotato.model.jpa;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Lenovo on 2018/1/25.
 */
@Entity
public class Security {

    @Id
    @GeneratedValue
    private int id;

    private long userId;

    @Column(length = 32)
    private String password;

    @Column(length = 32)
    private String token;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogin;

    private boolean isActive;

    private boolean isSuper;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isSuper() {
        return isSuper;
    }

    public void setSuper(boolean aSuper) {
        isSuper = aSuper;
    }
}

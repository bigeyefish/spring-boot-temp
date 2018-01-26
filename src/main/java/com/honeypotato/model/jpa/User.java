package com.honeypotato.model.jpa;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户实体类
 * Created by sanyihwang on 2018/1/24.
 */
@Entity
public class User {

    @Id
    @GeneratedValue
    @Column(length = 11)
    private int id;

    @Column(nullable = false, unique = true, length = 32, updatable = false)
    private String userName;

    @Column(nullable = false, length = 32)
    private String nickName;

    @Column(columnDefinition = "INT(3)")
    private int age;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    private Family family;

    @Column(columnDefinition = "tinyint(1)")
    private int sex;

    @Column(length = 256)
    private String avatar;

    @Column(length = 32)
    private String mobile;

    @Column(length = 32)
    private String email;

    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    @Column(length = 11)
    private int score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

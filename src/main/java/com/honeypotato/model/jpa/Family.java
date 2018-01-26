package com.honeypotato.model.jpa;

import javax.persistence.*;

/**
 * 家庭实体映射类
 * Created by Lenovo on 2018/1/25.
 */
@Entity
@Table(name = "t_family")
public class Family {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(length = 11)
    private int id;

    @Column(nullable = false, length = 32)
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

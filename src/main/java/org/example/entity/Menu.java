package org.example.entity;

import java.util.Date;

public class Menu {
    private Integer id;
    private String name;

    private Date createdAt;

    public Menu() {
    }

    public Menu(String name) {
        this.name = name;
    }

    public Menu(String name, Date createdAt) {
        this.name = name;
        this.createdAt = createdAt;
    }

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Menu(Integer id, String name, Date createdAt) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}

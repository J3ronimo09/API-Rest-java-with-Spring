package com.J3ronimo09.demo.entities;


public class Department {
    private  Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public Department() {

    }

    public Department(Long id,String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

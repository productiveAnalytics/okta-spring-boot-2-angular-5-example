package com.okta.developer.demo;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    
    public String getName() {return this.name;}
    public void setName(String n) {this.name = n;}
}

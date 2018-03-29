package com.okta.developer.demo;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    
    @NotNull
    private String name;
    
    public Long getId() {return this.id;}
    public void setId(Long _id) {this.id = _id;}
    
    public String getName() {return this.name;}
    public void setName(String n) {this.name = n;}
	
	public String toString(){
		return "Car={\"id\":\""+ this.id + "\", \"name\":\""+ this.name +"\"}";
	}
}

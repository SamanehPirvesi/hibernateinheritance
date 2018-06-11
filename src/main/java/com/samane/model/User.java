package com.samane.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity

//  @Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn
//(name="USER_TYPE",discriminatorType=DiscriminatorType.STRING)
public class User {
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long user_id;
	private String name;
	private String surNmae;
	


	
	public User() {
		
	}
	public User( String name, String surNmae) {
		
		this.name = name;
		this.surNmae = surNmae;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurNmae() {
		return surNmae;
	}
	public void setSurNmae(String surNmae) {
		this.surNmae = surNmae;
	}
	

}

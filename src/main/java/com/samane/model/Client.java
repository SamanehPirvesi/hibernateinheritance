package com.samane.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("CLIENT")
public class Client extends User {
	private String clinetIban;
	

	public Client() {
	
	}

	public Client(String name, String surname, String clinetIban) {
		super(name, surname);
		this.clinetIban = clinetIban;
	}

	public String getClinetIban() {
		return clinetIban;
	}

	public void setClinetIban(String clinetIban) {
		this.clinetIban = clinetIban;
	}

}
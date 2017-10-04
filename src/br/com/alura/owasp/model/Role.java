package br.com.alura.owasp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROLE")
public class Role {
	
	
	@Id
	@Column(name="NAME")
	private String name;
	
	/*
	 * Deprecated
	 */
	public Role() {}
	
	public Role(String role){
		this.name=role;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
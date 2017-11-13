package edu.neu.cs5200.ide.jpa;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Developer
 *
 */
@Entity

public class Developer implements Serializable {

	   
	@Id
	@NamedQuery(name="Developer.findDeveloperById", query="select developer from Developer d where d.name = :name")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String first;
	private String last;
	private String email;
	private static final long serialVersionUID = 1L;

	public Developer() {
		super();
	}   
	
	public Developer(String first String last, String email) {
		this.first = first;
		this.last = last;
		this.email = email;
	}   
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public String getFirst() {
		return this.first;
	}

	public void setFirst(String first) {
		this.first = first;
	}   
	public String getLast() {
		return this.last;
	}

	public void setLast(String last) {
		this.last = last;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
   
}

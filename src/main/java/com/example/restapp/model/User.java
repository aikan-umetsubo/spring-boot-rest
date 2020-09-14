package com.example.restapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private final long id;

	private final String name;
  private final String address;

  protected User() { }

	public User(String name, String address) {
		this.name = name;
    this.address = address;
	}

  @Override
  public String toString() {
    return String.format(
      "User[id=%d, name='%s', address='%s']",
      id, name, address
    );
  }

	public long getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

  public String getAddress() {
    return this.address;
  }
}

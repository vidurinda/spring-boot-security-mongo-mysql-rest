package com.icloud.micro.mongo.model;

import lombok.Data;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Document(collection="role")
@Data
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String description;

	private Boolean enabled;

	private String role;
	
	@DBRef(lazy=true)
	private List<Module> modules;

	@DBRef(lazy=true)
	private List<User> users;

	public Role() {
	}

}
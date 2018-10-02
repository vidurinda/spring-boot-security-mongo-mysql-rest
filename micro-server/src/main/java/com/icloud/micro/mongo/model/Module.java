package com.icloud.micro.mongo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.io.Serializable;
import java.util.List;


/**
 * The persistent class for the module database table.
 * 
 */

@Document(collection="module")
@Data
public class Module implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String faIcon;

	private String module;

	private String route;

	private Integer statusActive;

	private Integer statusRedirect;

	private Integer statusVisibility;

	private User createdBy;

	private User modifiedBy;

	@DBRef
	private Module parent;

	@DBRef(lazy=true)
	private List<Module> modules;

	@DBRef(lazy=true)
	private List<Role> roles;

	public Module() {
	}

}
package com.icloud.micro.mongo.model;



import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user database table.
 * 
 */
@Document(collection="user")
@Data
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean enabled;

	private Boolean expired;

	private String fullName;

	private String imgUrl;

	private String ipAddress;

	private String lastName;

	private Boolean menuCollapse;

	private Boolean locked;

	private String password;

	private String recoveryEmail;

	private String recoveryPhone;

	private Date timestampCreated;

	private Date timestampLastLogin;

	private Date timestampModified;

	private String username;

	@DBRef(lazy=true)
	private List<Role> roles;

	public User() {
	}

}
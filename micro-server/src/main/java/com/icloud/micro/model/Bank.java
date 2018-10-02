package com.icloud.micro.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bank")
@Data
public class Bank {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;
}

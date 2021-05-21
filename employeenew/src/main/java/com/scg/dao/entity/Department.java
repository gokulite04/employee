package com.scg.dao.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "department")
public class Department {
	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;

	@Column(name = "department_name")
	private String departmentName;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name = "department_id")
	// private List<Employee> employees;

	@Embedded
	private Audit audit;
}

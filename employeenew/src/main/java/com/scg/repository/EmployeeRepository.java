package com.scg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.scg.dao.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}

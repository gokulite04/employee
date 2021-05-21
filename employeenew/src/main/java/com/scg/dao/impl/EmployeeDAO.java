package com.scg.dao.impl;

import java.util.List;

import com.scg.vo.EmployeeVO;

public interface EmployeeDAO {
	EmployeeVO addEmployee(final EmployeeVO employeeVO);

	List<EmployeeVO> getEmployees();

	EmployeeVO getEmployeeById(final int id);

	String deleteEmployee(final int id);

	EmployeeVO updateEmployeeById(final EmployeeVO employeeVo);
}

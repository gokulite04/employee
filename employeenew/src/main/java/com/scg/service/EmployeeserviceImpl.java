package com.scg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.dao.impl.EmployeeDAO;
import com.scg.vo.EmployeeVO;

@Service
public class EmployeeserviceImpl implements EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public EmployeeVO addEmployee(final EmployeeVO employeeVO) {

		return employeeDAO.addEmployee(employeeVO);
	}

	@Override
	public List<EmployeeVO> getEmployees() {

		return employeeDAO.getEmployees();
	}

	@Override
	public EmployeeVO getEmployeeById(final int id) {

		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public String deleteEmployee(final int id) {

		return employeeDAO.deleteEmployee(id);
	}

	@Override
	public EmployeeVO updateEmployeeById(final EmployeeVO employeeVo) {

		return employeeDAO.updateEmployeeById(employeeVo);
	}

}

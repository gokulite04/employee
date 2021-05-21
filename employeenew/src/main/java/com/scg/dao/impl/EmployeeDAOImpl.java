package com.scg.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.scg.dao.entity.Employee;
import com.scg.mapper.EmployeeMapper;
import com.scg.repository.EmployeeRepository;
import com.scg.vo.EmployeeVO;

@Component
@ComponentScan(basePackages = "com.scg.mapper")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public EmployeeVO addEmployee(final EmployeeVO employeeVO) {

		final Employee employee = employeeMapper.toEntity(employeeVO);

		return employeeMapper.toVO((employeeRepository.save(employee)));
	}

	@Override
	public List<EmployeeVO> getEmployees() {

		return employeeMapper.toVOList(employeeRepository.findAll());
	}

	@Override
	public EmployeeVO getEmployeeById(final int id) {

		return employeeMapper.toVO(employeeRepository.findById(id).orElse(null));
	}

	@Override
	public String deleteEmployee(final int id) {
		employeeRepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}

	@Override
	public EmployeeVO updateEmployeeById(final EmployeeVO employeeVO) {
		Employee employee = employeeMapper.toEntity(employeeVO);
		final Employee existingEmployee = employeeRepository.findById(employee.getId()).orElse(null);
		existingEmployee.setName(employee.getName());
		existingEmployee.setAge(employee.getAge());
		existingEmployee.setSalary(employee.getSalary());
		employee = employeeRepository.save(existingEmployee);
		return employeeMapper.toVO(employee);

	}

}

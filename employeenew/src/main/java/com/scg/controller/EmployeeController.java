package com.scg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.service.EmployeeService;
import com.scg.vo.EmployeeVO;

@RestController
@RequestMapping("employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public EmployeeVO saveEmployee(@RequestBody final EmployeeVO employeeVo) {
		return employeeService.addEmployee(employeeVo);

	}

	@GetMapping
	public List<EmployeeVO> getEmployees() {
		return employeeService.getEmployees();

	}

	@GetMapping("/id/{id}")
	public EmployeeVO getEmployeeById(@PathVariable final int id) {
		return employeeService.getEmployeeById(id);

	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable final int id) {
		return employeeService.deleteEmployee(id);

	}

	@PutMapping
	public EmployeeVO updateEmployeeById(@RequestBody final EmployeeVO employeeVo) {
		return employeeService.updateEmployeeById(employeeVo);
	}

}

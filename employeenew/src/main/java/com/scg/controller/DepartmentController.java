package com.scg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.service.DepartmentService;
import com.scg.vo.DepartmentVO;

@RestController
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping
	public DepartmentVO saveDepartment(@RequestBody final DepartmentVO departmentVo) {

		return departmentService.saveDepartment(departmentVo);
	}

	@GetMapping
	public List<DepartmentVO> getDepartment() {
		return departmentService.getDepartment();
	}

	@GetMapping("/id/{id}")
	public DepartmentVO getDepartmentById(@PathVariable final int id) {
		return departmentService.getDepartmentById(id);
	}

	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable final int id) {
		return departmentService.deleteDepartment(id);

	}

}

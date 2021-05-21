package com.scg.service;

import java.util.List;

import com.scg.vo.DepartmentVO;

public interface DepartmentService {
	DepartmentVO saveDepartment(final DepartmentVO departmentVO);

	List<DepartmentVO> getDepartment();

	DepartmentVO getDepartmentById(final int id);

	String deleteDepartment(final int id);
}

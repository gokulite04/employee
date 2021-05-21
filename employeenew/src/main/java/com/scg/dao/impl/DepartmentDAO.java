package com.scg.dao.impl;

import java.util.List;

import com.scg.vo.DepartmentVO;

public interface DepartmentDAO {
	DepartmentVO saveDepartment(final DepartmentVO departmentVO);

	List<DepartmentVO> getDepartment();

	DepartmentVO getDepartmentById(final int id);

	String deleteDepartment(final int id);

//	DepartmentVO updateDepartmentById(final DepartmentVO departmentVO);
//
//	DepartmentVO findByName(String name);

}

package com.scg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scg.dao.impl.DepartmentDAO;
import com.scg.vo.DepartmentVO;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	DepartmentDAO departmentDAO;

	@Override
	public DepartmentVO saveDepartment(final DepartmentVO departmentVO) {

		return departmentDAO.saveDepartment(departmentVO);

	}

	@Override
	public List<DepartmentVO> getDepartment() {

		return departmentDAO.getDepartment();
	}

	@Override
	public DepartmentVO getDepartmentById(final int id) {

		return departmentDAO.getDepartmentById(id);
	}

	@Override
	public String deleteDepartment(final int id) {

		return departmentDAO.deleteDepartment(id);
	}

}

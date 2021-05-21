package com.scg.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scg.dao.entity.Department;
import com.scg.mapper.DepartmentMapper;
import com.scg.repository.DepartmentRepository;
import com.scg.vo.DepartmentVO;

//@ComponentScan(basePackages = "com.scg.mapper")
@Component
public class DepartmentDAOImpl implements DepartmentDAO {

	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	DepartmentRepository departmentRepository;

	@Override
	public DepartmentVO saveDepartment(final DepartmentVO departmentVO) {
		final Department department = departmentMapper.toEntity(departmentVO);
		return departmentMapper.toVO(departmentRepository.save(department));

	}

	@Override
	public List<DepartmentVO> getDepartment() {
		return departmentMapper.toVOList(departmentRepository.findAll());

	}

	@Override
	public DepartmentVO getDepartmentById(final int id) {

		return departmentMapper.toVO(departmentRepository.findById(id).orElse(null));

	}

	@Override
	public String deleteDepartment(final int id) {
		departmentRepository.deleteById(id);
		return "Employee id : " + id + " Removed";
	}

}

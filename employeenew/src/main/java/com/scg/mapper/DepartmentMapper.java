package com.scg.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.dao.entity.Department;
import com.scg.vo.DepartmentVO;

@Mapper(componentModel = "spring", uses = EmployeeMapper.class)
public interface DepartmentMapper {
	DepartmentVO toVO(Department department);

	Department toEntity(DepartmentVO departmentVo);

	List<DepartmentVO> toVOList(List<Department> departmentList);

	List<Department> toEntityList(List<DepartmentVO> departmentVoList);

}

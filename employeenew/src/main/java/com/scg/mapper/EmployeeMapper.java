package com.scg.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.scg.dao.entity.Employee;
import com.scg.vo.EmployeeVO;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	EmployeeVO toVO(Employee employee);

	Employee toEntity(EmployeeVO employeeVo);

	List<EmployeeVO> toVOList(List<Employee> employeeList);

	List<Employee> toEntityList(List<EmployeeVO> employeeVoList);
}

package com.raven.mvcwebapp.dao;

import java.util.List;

import com.raven.mvcwebapp.entity.EmployeeEntity;

public interface IEmployeeDao {
	public List<EmployeeEntity> getEmployeeEntities();

	public EmployeeEntity getEmployee(int empId);

	public void saveEmployee(EmployeeEntity employeeEntity);
}

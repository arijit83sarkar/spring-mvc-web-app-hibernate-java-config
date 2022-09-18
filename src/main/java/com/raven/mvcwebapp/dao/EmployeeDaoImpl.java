package com.raven.mvcwebapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raven.mvcwebapp.entity.EmployeeEntity;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<EmployeeEntity> getEmployeeEntities() {
		Session session = sessionFactory.getCurrentSession();
//		Query<EmployeeEntity> query = session.createQuery("from Employee", EmployeeEntity.class);
		List<EmployeeEntity> employeeEntities = session.createQuery("from EmployeeEntity", EmployeeEntity.class).list();
		return employeeEntities;
	}

}

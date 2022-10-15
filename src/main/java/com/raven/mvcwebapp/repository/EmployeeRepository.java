package com.raven.mvcwebapp.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.raven.mvcwebapp.entity.EmployeeEntity;

@Repository
public class EmployeeRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<EmployeeEntity> getEmployeeEntities() {
        List<EmployeeEntity> employeeEntities = null;

        try {
            Session session = sessionFactory.getCurrentSession();

            // use entity class name - EmployeeEntity - with from
            employeeEntities = session.createQuery("from EmployeeEntity", EmployeeEntity.class).list();
        } catch (HibernateException exception) {
            exception.printStackTrace();
        }

        return employeeEntities;
    }

    @Transactional
    public EmployeeEntity getEmployee(int empId) {
        EmployeeEntity employeeEntity = null;

        try {
            Session session = sessionFactory.getCurrentSession();
            employeeEntity = session.get(EmployeeEntity.class, empId);
        } catch (HibernateException exception) {
            exception.printStackTrace();
        }
        return employeeEntity;
    }

    @Transactional
    public void saveEmployee(EmployeeEntity employeeEntity) {
        try {
            Session session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(employeeEntity);
        } catch (HibernateException exception) {
            exception.printStackTrace();
        }
    }

    @Transactional
    public void deleteEmployee(int empId) {
        try {
            Session session = sessionFactory.getCurrentSession();
            Query query = session.createQuery("delete from EmployeeEntity where empId=:empid");
            query.setParameter("empid", empId);
            query.executeUpdate();
        } catch (HibernateException exception) {
            exception.printStackTrace();
        }
    }

}

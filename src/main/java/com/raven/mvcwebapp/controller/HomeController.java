package com.raven.mvcwebapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.raven.mvcwebapp.dao.IEmployeeDao;
import com.raven.mvcwebapp.entity.EmployeeEntity;

@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private IEmployeeDao employeeDao;

	@RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
	public String showHome(Model model) {
		List<EmployeeEntity> employeeEntities = employeeDao.getEmployeeEntities();
		model.addAttribute("employees", employeeEntities);
		return "home";
	}

//	@RequestMapping(value = "/list", method = RequestMethod.GET)
//	public String listEmployees(Model model) {
//		List<EmployeeEntity> employeeEntities = employeeDao.getEmployeeEntities();
//		model.addAttribute("employees", employeeEntities);
//		return "home";
//	}
}

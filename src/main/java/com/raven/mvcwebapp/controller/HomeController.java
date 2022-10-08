package com.raven.mvcwebapp.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping(value = "/showNewEmployeeForm", method = RequestMethod.GET)
	public String showNewEmployeeForm(Model model) {
		EmployeeEntity employeeEntity = new EmployeeEntity();
		model.addAttribute("employee", employeeEntity);
		model.addAttribute("countries", getCountries());

		return "newEmployeeForm";
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") EmployeeEntity employeeEntity) {
		employeeDao.saveEmployee(employeeEntity);
		return "redirect:/home";
	}

	@RequestMapping(value = "/showEmployeeUpdateForm", method = RequestMethod.GET)
	public String showEmployeeUpdateForm(@RequestParam("empId") int empId, Model model) {
		EmployeeEntity employeeEntity = employeeDao.getEmployee(empId);
		model.addAttribute("employee", employeeEntity);
		model.addAttribute("countries", getCountries());

		return "newEmployeeForm";
	}

	private Map<String, String> getCountries() {
		Map<String, String> mapCountries = new LinkedHashMap<>();
		mapCountries.put("Canada", "Canada");
		mapCountries.put("Brazil", "Brazil");
		mapCountries.put("France", "France");
		mapCountries.put("Germany", "Germany");
		mapCountries.put("India", "India");
		mapCountries.put("Japan", "Japan");

		return mapCountries;
	}
}

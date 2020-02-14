package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.poc.model.Employee;
import com.poc.service.EmployeeService;

@Controller
@RequestMapping("employee")
public class AddEmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView employee() {
		ModelAndView model = new ModelAndView("employee");
		model.addObject("list", employeeService.getAllEmployee());
		return model;
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView EmployeeRegister(
			@ModelAttribute("Employee") Employee employee) {
		ModelAndView model = new ModelAndView("employee");
		if (employee != null) {
			employeeService.addEmployee(employee);
			model.addObject("warning", "Employee Registration Success");

		} else {
			model.addObject("danger", "Something Going Bad");

		}
		return new ModelAndView("redirect:/employee");
	}
}
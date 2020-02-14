package com.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.poc.model.Employee;
import com.poc.service.EmployeeService;

@Controller
@RequestMapping("searchemployee")
public class SearchEmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView sarchEmployee() {
		ModelAndView model = new ModelAndView("searchemployee");
			model.addObject("list", employeeService.getAllEmployee());
		return model;
	}

	@RequestMapping(params = "lessthan", method = RequestMethod.POST)
	public ModelAndView searchEmployee(
			@ModelAttribute("Employee") Employee employee,
			@RequestParam("lessthan") String param2) 
	{
		ModelAndView model = new ModelAndView("searchemployee");
		List<Employee> allEmployeesLessThanEnteredSalary = employeeService.getAllEmployeesLessThanEnteredSalary(employee.getEmployee_Salary());
		model.addObject("list",allEmployeesLessThanEnteredSalary);
		
		model.setViewName("searchemployee");
		return model;
		//return new ModelAndView("redirect:/searchemployee");
	}

	@RequestMapping(params = "greaterthan", method = RequestMethod.POST)
	public ModelAndView searchEmployee1(
			@ModelAttribute("Employee") Employee employee,
			@RequestParam("greaterthan") String param2) 
	{
		ModelAndView model = new ModelAndView("searchemployee");
		List<Employee> allEmployeesGreaterThanEnteredSalary = employeeService.getAllEmployeesGreaterThanEnteredSalary(employee.getEmployee_Salary());
		model.addObject("list",allEmployeesGreaterThanEnteredSalary);
		
		model.setViewName("searchemployee");
		return model;
		//return new ModelAndView("redirect:/searchemployee");
	}

}

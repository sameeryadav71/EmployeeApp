package com.poc.serviceimpl;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.model.Employee;
import com.poc.repository.EmployeeRepository;
import com.poc.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EntityManager entityManager;

	@Override
	public String addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		List<Employee> presentEmployees = getAllEmployee();
		if (presentEmployees.contains(employee)) {
			return "Employee Already Exists!!";
		}
		employeeRepository.save(employee);
		return "Employee added";
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.deleteById(id);
	}

	@Override
	public Optional<Employee> getEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> findById = employeeRepository.findById(id);
		return findById;
	}

	@Override
	public List<Employee> getAllEmployeesLessThanEnteredSalary(Double d) {
		// TODO Auto-generated method stub
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> q = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> c = q.from(Employee.class);
		q.select(c).where(criteriaBuilder.lt(c.get("employee_Salary"), d));
		TypedQuery<Employee> query = entityManager.createQuery(q);
		List<Employee> results = query.getResultList();
		System.out.println(results);
		return results;
	}

	@Override
	public List<Employee> getAllEmployeesGreaterThanEnteredSalary(Double d) {
		// TODO Auto-generated method stub
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Employee> q = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> c = q.from(Employee.class);
		q.select(c).where(criteriaBuilder.gt(c.get("employee_Salary"), d));
		TypedQuery<Employee> query = entityManager.createQuery(q);
		List<Employee> results = query.getResultList();
		System.out.println(results);
		return results;
	}

}

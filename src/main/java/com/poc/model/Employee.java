package com.poc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employee_Id;
	private String employee_Name;
	private Double employee_Salary;
	private String employee_Email;
	public Integer getEmployee_Id() {
		return employee_Id;
	}
	public void setEmployee_Id(Integer employee_Id) {
		this.employee_Id = employee_Id;
	}
	public String getEmployee_Name() {
		return employee_Name;
	}
	public void setEmployee_Name(String employee_Name) {
		this.employee_Name = employee_Name;
	}
	public Double getEmployee_Salary() {
		return employee_Salary;
	}
	public void setEmployee_Salary(Double employee_Salary) {
		this.employee_Salary = employee_Salary;
	}
	public String getEmployee_Email() {
		return employee_Email;
	}
	public void setEmployee_Email(String employee_Email) {
		this.employee_Email = employee_Email;
	}
	@Override
	public String toString() {
		return "Employee [employee_Id=" + employee_Id + ", employee_Name="
				+ employee_Name + ", employee_Salary=" + employee_Salary
				+ ", employee_Email=" + employee_Email + "]";
	}
}

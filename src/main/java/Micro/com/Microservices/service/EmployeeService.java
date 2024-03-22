package Micro.com.Microservices.service;

import org.springframework.beans.factory.annotation.Autowired;

import Micro.com.Microservices.entity.Employee;
import Micro.com.Microservices.repository.EmployeeRepo;

public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;


	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.getById(id);
	}


	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeRepo.save(employee);
	}

	

}

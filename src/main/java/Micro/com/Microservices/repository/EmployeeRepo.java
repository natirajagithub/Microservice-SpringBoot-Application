package Micro.com.Microservices.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import Micro.com.Microservices.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Optional<Employee> findById(int id);
	
	

}

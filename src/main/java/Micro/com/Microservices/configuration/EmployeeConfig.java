package Micro.com.Microservices.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Micro.com.Microservices.service.EmployeeService;

@Configuration
public class EmployeeConfig {

	@Bean
	public EmployeeService employeeBean() {
		return new EmployeeService();
	}
}

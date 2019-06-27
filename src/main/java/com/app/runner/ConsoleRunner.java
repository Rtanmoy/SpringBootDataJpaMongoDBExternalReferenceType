package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.document.Address;
import com.app.document.Employee;
import com.app.repo.EmployeeRepository;
@Component
public class ConsoleRunner implements CommandLineRunner {
  @Autowired
  private EmployeeRepository repo;
	@Override
	public void run(String... args) throws Exception {
		repo.deleteAll();
		repo.save(new Employee(11,"Tomy",new Address("5-7T","S R Nagar")));
	}

}

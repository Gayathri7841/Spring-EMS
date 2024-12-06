package com.example.Spring_EMS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Spring_EMS.Model.Employee;
import com.example.Spring_EMS.Repository.EmployeeRepository;
@Service
public class EmployeeServiceImplementation implements EmployeeService {
	private EmployeeRepository employeerepository;
public EmployeeServiceImplementation(EmployeeRepository employeerepository) {
		super();
		this.employeerepository = employeerepository;
	}



	@Override
	public Employee save(Employee emp) {
		
		return employeerepository.save(emp);
	}

	
	public List<Employee> getAll() {
		
		return employeerepository.findAll();
	}



	@Override
	public Employee findById(long sid) {
		
		Optional<Employee> result = employeerepository.findById(sid);
	    
	    // Return the employee if found, or handle the case when not found
	    return result.orElse(null);
	}



	@Override
	public void delete(long sid) {
		 employeerepository.deleteById(sid);
		
	}



	

	

}

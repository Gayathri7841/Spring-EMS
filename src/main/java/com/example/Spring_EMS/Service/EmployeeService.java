package com.example.Spring_EMS.Service;

import java.util.List;

import com.example.Spring_EMS.Model.Employee;

public interface EmployeeService {
Employee save(Employee emp);
List<Employee> getAll();
Employee findById(long theid);
void delete(long sid);

}

package com.example.Spring_EMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Spring_EMS.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

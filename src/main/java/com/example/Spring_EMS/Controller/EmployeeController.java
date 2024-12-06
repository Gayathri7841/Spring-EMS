package com.example.Spring_EMS.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Spring_EMS.Model.Employee;
import com.example.Spring_EMS.Service.EmployeeService;


@Controller
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService empser;

@GetMapping("/list")
public String ListEmployees(Model themodel) {
	List<Employee> theEmployee=empser.getAll();
	themodel.addAttribute("employees",theEmployee);
	return "employee-list";
	
	
}
@GetMapping("/showForm")
public String ShowForm(Model themodel) {
	Employee emp=new Employee();
	themodel.addAttribute("employee" ,emp);
	return"showForm";
	
}
@GetMapping("/save")
public String showSaveForm(Model model) {
    Employee employee = new Employee();
    model.addAttribute("employee", employee);
    return "showForm";  // This is the view where the form is rendered
}
@PostMapping("/save")
public String save(@ModelAttribute("employee") Employee emp) {
    empser.save(emp);
    return "redirect:/employee/list";  // Redirect to the employee list after saving
}
@GetMapping("/showFormForUpdate")
public String showFormForUpdate(@RequestParam("sid") long theid,Model themodel) {
	Employee emp=empser.findById(theid);
	themodel.addAttribute("employee",emp);
	return "showForm";
}
@GetMapping("/delete")
public String delete(@RequestParam("sid") long theid,Model themodel) {
	empser.delete(theid);
	return "redirect:/employee/list";
}
@GetMapping("/showLoginPage")
public String Login() {
	return "LoginPage";
}
}					

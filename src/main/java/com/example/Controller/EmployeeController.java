package com.example.Controller;

import com.example.Entity.Employee;
import com.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(method = RequestMethod.GET)
  public Collection<Employee> getAllEmployees(){
    return employeeService.getAllEmployees();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Employee getStudentByID(@PathVariable("id") int id){
    return employeeService.getEmployeeByID(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteStudentByID(@PathVariable("id") int id){
    employeeService.removeEmployeeByID(id);
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void updateEmployee(@RequestBody Employee employee){
    employeeService.updateEmployee(employee);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void insertEmployee(@RequestBody Employee employee){
    employeeService.insertStudenttoDatabase(employee);
  }
}

package com.example.Service;

import com.example.DAO.EmployeeDao;
import com.example.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */

@Service
public class EmployeeService {
  @Autowired
  @Qualifier("employeeData")

  private EmployeeDao employeeDao;

  public Collection<Employee> getAllEmployees(){
    return this.employeeDao.getAllEmployees();
  }

  public Employee getEmployeeByID(int id){return this.employeeDao.getEmployeeByID(id);}

  public void insertStudenttoDatabase(Employee employee){this.employeeDao.insertEmployeetoDatabase(employee);}

  public void updateEmployee(Employee employee) {
    this.employeeDao.updateEmployee(employee);
  }

  public void removeEmployeeByID(int id) {
    this.employeeDao.removeEmployeeByID(id);
  }
}

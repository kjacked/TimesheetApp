package com.example.DAO;

import com.example.Entity.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */

@Repository
@Qualifier("employeeData")
public class EmployeeDao implements EmployeeInterfaceDao {

  @Override
  public Collection<Employee> getAllEmployees() {
    return new ArrayList<Employee>() {
      {
        add(new Employee(1, "Mario", 40.5, "job"));
      }
    };
  }

  @Override
  public Employee getEmployeeByID(int id) {
    return null;
  }

  @Override
  public void updateEmployee(Employee employee) {
  }

  @Override
  public void removeEmployeeByID(int id) {
  }

  @Override
  public void insertEmployeetoDatabase(Employee employee) {
  }
}


package com.example.DAO;

import com.example.Entity.Employee;

import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */
public interface EmployeeInterfaceDao {

    Collection<Employee> getAllEmployees();

    Employee getEmployeeByID(int id);

    void updateEmployee(Employee employee);

    void removeEmployeeByID(int id);

    void insertEmployeetoDatabase(Employee employee);

  }

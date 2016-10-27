package com.example.Entity;

/**
 * Created by willieshuler on 10/27/16.
 */
public class Employee {

  private int id;
  private String name;
  private double hoursWorked;
  private String password;

  public Employee(){}

  public Employee(int id, String name, double hoursWorked, String password){
    this.id = id;
    this.name = name;
    this.hoursWorked = hoursWorked;
    this.password = password;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getPayRate() {
    return hoursWorked;
  }

  public void setPayRate(double payRate) {
    this.hoursWorked = payRate;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}

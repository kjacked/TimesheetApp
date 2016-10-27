package com.example.Entity;

/**
 * Created by willieshuler on 10/27/16.
 */
public class Timesheet {

  private int date;
  private String clockIn;
  private String clockOut;
  private double hoursWorked;

  public Timesheet() {}


  public Timesheet(int date, String clockIn, String clockOut, double hoursWorked) {
    this.date = date;
    this.clockIn = clockIn;
    this.clockOut = clockOut;
    this.hoursWorked = hoursWorked;
  }

  public int getDate() {
    return date;
  }

  public void setDate(int date) {
    this.date = date;
  }

  public String getClockIn() {
    return clockIn;
  }

  public void setClockIn(String clockIn) {
    this.clockIn = clockIn;
  }

  public String getClockOut() {
    return clockOut;
  }

  public void setClockOut(String clockOut) {
    this.clockOut = clockOut;
  }

  public double getHoursWorked() {
    return hoursWorked;
  }

  public void setHoursWorked(double hoursWorked) {
    this.hoursWorked = hoursWorked;
  }
}

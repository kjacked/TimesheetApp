package com.example.DAO;

import com.example.Entity.Timesheet;

import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */
public interface TimesheetInterfaceDAO {

  Collection<Timesheet> getAllTimesheets();

  Timesheet getTimesheetByID(int id);

  void updateTimesheet(Timesheet timesheet);

  void insertTimesheettoDatabase(Timesheet timesheet);

  void removeTimesheetByID(int id);
}

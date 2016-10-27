package com.example.Service;

import com.example.DAO.TimesheetDao;
import com.example.Entity.Employee;
import com.example.Entity.Timesheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */
@Service
public class TimesheetService {

  @Autowired
  @Qualifier("employeeData")
  private TimesheetDao timesheetDao;

  public Collection<Timesheet> getAllTimesheets(){
    return this.timesheetDao.getAllTimesheets();
  }

  public Timesheet getTimesheetByID(int id){return this.timesheetDao.getTimesheetByID(id);}

  public void insertTimesheettoDatabase(Timesheet timesheet){this.timesheetDao.insertTimesheettoDatabase(timesheet);}

  public void updateTimesheet(Timesheet timesheet) {
    this.timesheetDao.updateTimesheet(timesheet);
  }

  public void removeTimesheetByID(int id) {
    this.timesheetDao.removeTimesheetByID(id);
  }
}


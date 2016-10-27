package com.example.DAO;

import com.example.Entity.Employee;
import com.example.Entity.Timesheet;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */

@Repository
@Qualifier("employeeData")
public class TimesheetDao implements TimesheetInterfaceDAO {

  @Override
  public Collection<Timesheet> getAllTimesheets() {
    return new ArrayList<Timesheet>() {
      {
        add(new Timesheet(102316, "9:00pm", "11:00pm", 2.0));
      }
    };
  }

  @Override
  public Timesheet getTimesheetByID(int id) {
    return null;
  }

  @Override
  public void updateTimesheet(Timesheet timesheet) {}

  @Override
  public void insertTimesheettoDatabase(Timesheet timesheet) {}

  @Override
  public void removeTimesheetByID(int id) {
  }
}

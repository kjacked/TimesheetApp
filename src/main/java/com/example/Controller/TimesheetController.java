package com.example.Controller;

import com.example.Entity.Timesheet;
import com.example.Service.TimesheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by willieshuler on 10/27/16.
 */

@CrossOrigin("http://localhost:9000")
@RestController
@RequestMapping("/timesheets")
public class TimesheetController {

    @Autowired
    private TimesheetService timesheetService;

    @RequestMapping(value = "/timesheet ", method = RequestMethod.GET)
    public Collection<Timesheet> getAllTimesheets(){
      return timesheetService.getAllTimesheets();
    }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Timesheet getTimesheetByID(@PathVariable("id") int id){
    return timesheetService.getTimesheetByID(id);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public void deleteTimesheetByID(@PathVariable("id") int id){
    timesheetService.removeTimesheetByID(id);
  }

  @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void updateTimesheet(@RequestBody Timesheet timesheet){
    timesheetService.updateTimesheet(timesheet);
  }

  @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
  public void insertTimesheet(@RequestBody Timesheet timesheet){
    timesheetService.insertTimesheettoDatabase(timesheet);
  }
}

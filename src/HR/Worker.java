/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dtthue
 */
public class Worker extends Human{
    private double weekSalary;
    private double workHourPerDay;
   
    public void setWeekSalary(double weekSalary) {
        this.weekSalary = weekSalary;
    }

    public void setWorkHourPerDay(double workHourPerDay) {
        this.workHourPerDay = workHourPerDay;
    }

    public double getWeekSalary() {
        return weekSalary;
    }

    public double getWorkHourPerDay() {
        return workHourPerDay;
    }
    

    public Worker(String lastname, String firstname, double weekSalary, double workHourPerDay) {
        super(lastname, firstname);
        this.weekSalary = weekSalary;
        this.workHourPerDay = workHourPerDay;
    }
    public double MoneyPerHour(){
        return this.weekSalary*7*this.workHourPerDay;
    }
    public String showInfor(){
        return "Last name:" + this.getLastname()+"\n"+"First name: " + this.getFirstname() +"\n" + "Week Salary:" + this.weekSalary +
                "Work hour per day: " + this.workHourPerDay + "\n";
    }
}

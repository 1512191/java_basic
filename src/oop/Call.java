/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author dtthue
 */
public class Call {
    private Date date;
    private String time;
     private String dialed_phone;

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDialed_phone(String dialed_phone) {
        this.dialed_phone = dialed_phone;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    private int duration;
    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDialed_phone() {
        return dialed_phone;
    }

    public int getDuration() {
        return duration;
    }
   public Call(Date date, String time, int duration, String dialed_phone){
       this.date = date; 
       this.time = time;
       this.duration = duration;
       this.dialed_phone = dialed_phone;
   }
   public String showInfor(){
       return "Date: " + this.date +"\n" + "Time: "+ this.time + "\n" + "Duration: " +
               this.duration + "\n" + "Phone number:" +this.dialed_phone + "\n";
   }
    
}

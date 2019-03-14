/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author dtthue
 */
public class GSMCallHistoryTest {

   public static final long CURRENT_TIME_MILLIS = System.currentTimeMillis();
    
    public void  addCall(){
         
    Display display = new Display(2, 4);
    Battery_type type = null;
    Battery battery = new Battery("BT01", 5, 2, type.LI_ION);
   
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/mm/YYYY");
    DateTimeFormatter time = DateTimeFormatter.ofPattern("hh:mm:ss");
    Date date = new Date();
    GSM g = new  GSM("GSM_001", "Sam sung", "A", 1200000, battery, display);
    
    Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
       
    Call call2 = new Call(date, sdf.format(cal.getTime()), 50, "12345678");
    Call call3 = new Call(date, sdf.format(cal.getTime()), 70, "12345678");
    Call call4 = new Call(date, sdf.format(cal.getTime()), 20, "12345678");
    g.add(call2);
    g.add(call3);
    g.add(call4);
    g.display_call();
//    System.out.println("Enter number duration to delete:");
//     Scanner sc = new Scanner(System.in);
//    System.out.println(sc.nextInt());
//    g.deleteCall(sc.nextInt());
    System.out.println("Total price: " + g.total_price(0.37) );
    g.removeLongCall();
    g.display_call();
   System.out.println("Total price: " + g.total_price(0.37) );
     System.out.println("Clear all");
     g.removeAllCall();
    }
    
    
}

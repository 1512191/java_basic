/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dtthue
 */
public class HR_Management {
     public static void main(String[] args) {
         List<Student> students = new ArrayList<Student>();
         Scanner sc = new Scanner(System.in);
         for(int i = 0; i<10; i++){
              System.out.println("First name:");
             String firstname = sc.nextLine();
             System.out.println("Last name:");
             String lastname = sc.nextLine();
             System.out.println("Grade: ");
             double grade = sc.nextDouble();
            students.add(new Student(lastname, firstname, grade));
             
    
         }
         
         for (int i = 0; i < students.size(); i++){
              System.out.println(students.get(i).showInfor());
         }
         
         
     }
}

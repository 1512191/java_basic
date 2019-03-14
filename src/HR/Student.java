/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HR;

/**
 *
 * @author dtthue
 */
public class Student extends Human{
private double grade;
    public Student(String lastname, String firstname, double grade) {
        super(lastname, firstname);
        this.grade = grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }
    public String showInfor(){
        return "Last name:" + this.getLastname()+"\n"+"First name: " + this.getFirstname() +"\n" + "Grade:" + this.grade;
    }
}

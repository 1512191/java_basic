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
public abstract class Human {
    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    private String firstname;
    public Human(String lastname, String firstname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

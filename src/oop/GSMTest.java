/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author dtthue
 */
public class GSMTest {

    public static void main(String[] args) {
        GSM[] gsm = new GSM[3];
        Display display = new Display(2, 4);
        Battery_type type = null;
        Battery battery = new Battery("BT01", 5, 2, type.LI_ION);
        gsm[0] = new GSM("GSM_001", "Sam sung", "A", 1200000, battery, display);
        gsm[1] = new GSM("GSM_002", "Sam sung", "A", 1200000, battery, display);
        gsm[2] = new GSM("GSM_003", "Sam sung", "A", 1200000, battery, display);
        for (int i = 0; i < gsm.length; i++) {
            System.out.println(gsm[i].toString());

        }

        System.out.println(GSM.getIphone4S());
       GSMCallHistoryTest history = new GSMCallHistoryTest();
       history.addCall();
        
        // TODO code application logic here
    }

}

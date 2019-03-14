/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dtthue
 */
public class GSM {
        
    private String model;
	private String manufacturer;
	private String owner = null;
	private double price=0;
	private Battery battery ;
	private Display display;
	private static GSM Iphone4S=new GSM("IP_001", "Apple", "Steve Jobs", 2000000, new Battery("BT002", 365,300, Battery_type.NI_CD), new Display(24, 3));
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
	
	public GSM(String model, String manufacturer, String owner, double price , Battery b, Display d) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.owner = owner;
		this.price = price;
		this.battery = b;
		this.display = d;
	}
	public String toString() {
		return "Model: " + this.model + "\n" + "Manufacturer: " + this.manufacturer + "\n"+
				"Owner: "  + this.owner + "\n" + "Price: " + this.price + "\n" + 
				"Battery: " + this.battery.showInfor() + "Display: " + this.display.showDisplay();
	}

	public static GSM getIphone4S() {
		return Iphone4S;
	}

	public static void setIphone4S(GSM iphone4s) {
		Iphone4S = iphone4s;
	}
        public List<Call> call_history = new ArrayList<Call>();
        public void add(Call call){
            call_history.add(call);
        }
        public void delete(int i){
            if( i >= 0 && i < call_history.size()){
                    call_history.remove(i);
        }}
        public void deleteCall(int duration){
            boolean flag = false;
           if(call_history.size()>0){
               for(int i = 0; i <call_history.size();i++){
                if(call_history.get(i).getDuration() == duration){
                    flag = true;
                    call_history.remove(i);
                    i --;// 2 call has the same duration
                }
            
            }
           }
            
            if(flag == false){
                System.out.println("No call to delete");
            }
        }
        public double total_price(double price){
            double total = 0;
            for(int i=0; i<call_history.size();i++){
                total = total + price * call_history.get(i).getDuration();
            }
            return total;
        }
        public void display_call(){
            if(call_history.size() > 0){
                for(int i =0; i < call_history.size(); i++){
                    System.out.println(call_history.get(i).showInfor());
                }
            }else{
                 System.out.println("No call");
            }
        }
        public void removeLongCall(){
            if(call_history.size() > 0){
                int max = call_history.get(0).getDuration();
                int index = 0;
                for(int i=1; i<call_history.size(); i++){
                    if(call_history.get(i).getDuration()> max){
                        max = call_history.get(i).getDuration();
                        index = i;
                    }
                }
                call_history.remove(index);}
            else{
                 System.out.println("No call");
            }
        }
        public void removeAllCall(){
            if(call_history.size()>0){
                call_history.clear();
                 System.out.println("Delete all successfully!");
            }else{
                 System.out.println("No call");
            }
        }
}

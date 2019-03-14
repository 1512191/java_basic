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
public class Battery {
    private String model;
	private int hour_idle;
	private int hour_talk;
	private Battery_type type;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getHour_idle() {
		return hour_idle;
	}
	public void setHour_idle(int hour_idle) {
		this.hour_idle = hour_idle;
	}
	public int getHour_talk() {
		return hour_talk;
	}
	public void setHour_talk(int hour_talk) {
		this.hour_talk = hour_talk;
	}
	public Battery(String model, int hour_idle, int hour_talk, Battery_type type) {
		this.hour_idle = hour_idle;
		this.hour_talk = hour_talk;
		this.model = model;
		this.type = type;
	}
	public String showInfor() {
		return "Model battery: " + this.model + "Hour idle: " + this.hour_idle +"\n" +
				"Hour talk: " + this.hour_talk + "\n" + "Type: " + this.type + "\n";
				
	}
}

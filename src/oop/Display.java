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
public class Display {
    private double size;
	private int num_color;
	public double getSize() {
		return size;
	}
	public void setSize(double size) {
		this.size = size;
	}
	public int getNum_color() {
		return num_color;
	}
	public void setNum_color(int num_color) {
		this.num_color = num_color;
	}
	public Display(double size, int num_color) {
		this.size = size;
		this.num_color = num_color;
	}
	public String showDisplay() {
		return "Size: " + this.size + "\n" + "Number of colors: " + this.num_color + "\n";
	}
}

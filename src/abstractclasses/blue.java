package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class blue extends predohran {
	public double znach() {
		double value = 60;
		return value;
	}
	public String colorname() {
	String colorname = "Синий";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(0, 0, 255);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/blue.jpg"));
	return icon1;
	}
}
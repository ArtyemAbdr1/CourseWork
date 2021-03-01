package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class blink extends predohran {
	public double znach() {
		double value = 25;
		return value;
	}
	public String colorname() {
	String colorname = "прозрачный";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(176, 196, 222);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/blink.jpg"));
	return icon1;
	}
}

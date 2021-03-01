package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class whiteblue extends predohran {
	public double znach() {
		double value = 15;
		return value;
	}
	public String colorname() {
	String colorname = "голубой";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(30, 144, 255);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/whiteblue.jpg"));
	return icon1;
	}
}
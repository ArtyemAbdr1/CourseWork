package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class black extends predohran {
	public double znach() {
		double value = 70;
		return value;
	}
	public String colorname() {
	String colorname = "Черный";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(0, 0, 0);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/black.jpg"));
	return icon1;
	}
}
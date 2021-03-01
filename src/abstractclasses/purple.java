package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class purple extends predohran {
	public double znach() {
		double value = 40;
		return value;
	}
	public String colorname() {
	String colorname = "Фиолетовый";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(128, 0, 128);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/purple.jpg"));
	return icon1;
	}
}
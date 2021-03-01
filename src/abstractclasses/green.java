package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class green extends predohran {
	public double znach() {
		double value = 30;
		return value;
	}
	public String colorname() {
	String colorname = "Зеленый";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(0, 128, 0);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/green.jpg"));
	return icon1;
	}
}
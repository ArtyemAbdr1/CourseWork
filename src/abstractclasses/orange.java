package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class orange extends predohran{

	public double znach() {
		double value = 5;
		return value;
	}
	public String colorname() {
	String colorname = "оранжевый";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(255, 165, 0);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/orange.jpg"));
	return icon1;
	}
	

}

package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class yellow extends predohran {
	public double znach() {
		double value = 20;
		return value;
	}
	public String colorname() {
	String colorname = "жёлтый";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(255, 255, 0);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/yellow.jpg"));
	return icon1;
	}
}

package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class red extends predohran{

	public double znach() {
		double value = 10;
		return value;
	}
	public String colorname() {
	String colorname = "�������";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(255, 0, 0);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/red.jpg"));
	return icon1;
	}
	

}
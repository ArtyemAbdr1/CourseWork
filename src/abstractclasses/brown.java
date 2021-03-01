package abstractclasses;

import java.awt.Color;

import javax.swing.ImageIcon;

public class brown extends predohran{
	@Override
	public double znach() {
		double value = 7.5;
		return value;
	}
	public String colorname() {
	String colorname = "коричневый";
	return colorname;
	}
	public Object color() {
		Color color = new java.awt.Color(139, 69, 19);
		return color;
	}
	
	public Object imageicon() {
		ImageIcon icon1 = new ImageIcon(getClass().getClassLoader().getResource("img/brown.jpg"));
	return icon1;
	}
	

}

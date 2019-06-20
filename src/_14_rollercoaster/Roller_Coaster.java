package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Roller_Coaster {


public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?(in inches)");
	Integer.parseInt(height);
	int tall = Integer.parseInt(height);
	if(tall > 48) {
		JOptionPane.showMessageDialog(null, "You are tall enough to go on the rollercoaster.");
	}else {
		JOptionPane.showMessageDialog(null, "You need to grow taller to be able to ride on this rollercoaster.");
	}
		
	}
}
	



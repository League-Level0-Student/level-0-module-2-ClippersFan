package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Numbers {
	public static void main(String [] args) {
		Random ran = new Random();
		int r = ran.nextInt(9);
		int y = ran.nextInt(29);
		int z = ran.nextInt(56);
		int a = ran.nextInt(21);
		int t = ran.nextInt(35);
		JOptionPane.showMessageDialog(null, "Here are the lottery numbers for the month.");
		String lucky = "";
		lucky = lucky + r;
		JOptionPane.showMessageDialog(null, lucky);
		String non = "";
		non = non + y;
		JOptionPane.showMessageDialog(null, non);
		String ze = "";
		ze = ze + z;
		JOptionPane.showMessageDialog(null, ze);
		String why = "";
		why = why + a;
		JOptionPane.showMessageDialog(null,why);
		String who = "";
		who = who + t;
		JOptionPane.showMessageDialog(null, who);
		
		
	}

}

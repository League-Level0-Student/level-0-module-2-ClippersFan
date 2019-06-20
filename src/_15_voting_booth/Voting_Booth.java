package _15_voting_booth;
import javax.swing.JOptionPane;
public class Voting_Booth {

	public static void main(String[] args) {
		String old = JOptionPane.showInputDialog("How old are you?");
		Integer.parseInt(old);
		int age = Integer.parseInt(old);
		if(age > 18) {
			JOptionPane.showInputDialog("Who do you think the next president should be?");
			
		}else {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think.");
		}
	}
}


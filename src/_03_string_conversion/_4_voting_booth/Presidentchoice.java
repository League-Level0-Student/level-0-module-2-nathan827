package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class Presidentchoice {
	
public static void main(String[] args) {
	

	String age = JOptionPane.showInputDialog("How old are you?");
	
	int Age = Integer.parseInt(age);
	
	if(Age > 18) {
		String president = JOptionPane.showInputDialog("Who should the next president be?");
	}
	else {
		JOptionPane.showMessageDialog(null,"Nobody care what you think");
	}
	}
}

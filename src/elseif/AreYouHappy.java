package elseif;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String  A = JOptionPane.showInputDialog("Are you Happy?");
	if (A .equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
	}
	if (A .equals("No")) {
		String A1 = JOptionPane.showInputDialog("Do you want to be happy?");
if (A1 .equals("Yes")) {
	JOptionPane.showMessageDialog(null, "Change something..");
}
		if (A1 .equals("No")) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever your doing.");
				

	
	}
		
	
	}
}
}



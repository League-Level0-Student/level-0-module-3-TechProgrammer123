package elseif;

import javax.swing.JOptionPane;

public class Horoscopes {
public static void main(String[] args) {
	String Horoscope = JOptionPane.showInputDialog("What is your star sign");
	if (Horoscope .equals ("Leo")) {
		JOptionPane.showMessageDialog(null, "When your feelings are confusing today and at odds with your head, find the lessons in this.\n" + 
				"\n" + 
				"You are going to find your emotions and your heart very confusing today, your inner feelings might be telling you things at odds with what your head says and what you know is rational. This internal conflict can be frustrating, but there are lessons to be learned here so pay attention and pick through it all to find your way forward.");
	}


}
}

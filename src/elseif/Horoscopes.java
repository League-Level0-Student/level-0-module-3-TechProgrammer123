package elseif;

import javax.swing.JOptionPane;

public class Horoscopes {
public static void main(String[] args) {
	String Horoscope = JOptionPane.showInputDialog("What is your star sign");
	if (Horoscope.equals ("Leo")) {
		JOptionPane.showMessageDialog(null, "As things in your work life start to unfold today, you are perfectly placed to learn and gain insights.");
	}
		if(Horoscope.equals ("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Use your creativity today and expand on it by learning new things or continuing on your journey.");
		}
			if(Horoscope.equals ("Gemini")) {
				JOptionPane.showMessageDialog(null, "When you feel rushed to get tasks done today you must find calm and slow down or you'll make mistakes.");
		}
			if (Horoscope.equals("Cancer")) {
				JOptionPane.showMessageDialog(null, "As The Moon enters your house today, you need to stop procrastinating and get organized.");
			}
			else {
				JOptionPane.showMessageDialog(null, "That's not a star sign!");
			}
	}


}


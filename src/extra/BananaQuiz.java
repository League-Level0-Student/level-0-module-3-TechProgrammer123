//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0
package extra;

import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String YN = JOptionPane.showInputDialog("Do you like bananas");
		//2. if they say no, 
			//tell them they are crazy 
			//and end quiz
		if (YN .equals("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
			System.exit(0);
		}
		else if(YN .equals("Yes")) {
			String Hobby = JOptionPane.showInputDialog("What is your favorite hobby");
		JOptionPane.showMessageDialog(null, "Your "+Hobby+" is much better with bananas");
			}
	else {
		JOptionPane.showMessageDialog(null, "You are bananas");
	}
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"

		//4. OPTIONAL: if they say something other than “yes�? or “no�?
		//	show a pop up that says “You are bananas!�?
	
	}}



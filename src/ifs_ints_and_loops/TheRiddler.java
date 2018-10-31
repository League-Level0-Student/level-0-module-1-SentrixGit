package ifs_ints_and_loops;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer = JOptionPane.showInputDialog("What can travel around the world while staying in a corner?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.equalsIgnoreCase("stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect");
			score--;
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		
		// 6. Add some more riddles
		String answer1 = JOptionPane.showInputDialog("You can drop me from the tallest building and I'll be fine, but if you drop me in water I die. What am I?");
		if (answer1.equalsIgnoreCase("paper")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Incorrect");
			score--;
		}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}


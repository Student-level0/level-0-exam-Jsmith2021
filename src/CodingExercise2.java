

/* Level 0 Exam: Coding  Exercise #2 */
import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/


public class CodingExercise2 {
	public static void main(String[] args) {

String age=JOptionPane.showInputDialog("How old are you?");
JOptionPane.showMessageDialog(null, "You were born in 2017-"+ age);
if(age.equals("31")){
	JOptionPane.showMessageDialog(null, "You are too old to play this game.");
}
else{
	JOptionPane.showMessageDialog(null, "If you were born in 1987 or earlier you can't play the game but if you were born in 1989 or later you can play.");
}
}
}

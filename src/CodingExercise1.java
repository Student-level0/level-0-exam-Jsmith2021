import java.awt.Color;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

/* Level 0 Exam: Coding  Exercise #1 */
public class CodingExercise1 {

    public static void main(String[] args) {
   	 // 3. ask the user what color they would like the Robot to draw
String color=JOptionPane.showInputDialog("What color would you like the robot to draw?");
   	 // 4. use an if/else statement to set the pen color that the user requested (minimum of 2 colors)
Robot jessica=new Robot();
if(color.equals("red")){
	jessica.setPenColor(500, 0, 0);
}
if(color.equals("yellow")){
	jessica.setPenColor(250,250,0);
}
if(color.equals("blue")){
	jessica.setPenColor(0,0,500);
}
   	 // 2. set the pen width to 10

jessica.setPenWidth(10);
   	 // 1. make the Robot draw a shape
    	
    	jessica.penDown();
    	jessica.move(50);
    	jessica.turn(90);
    	jessica.move(50);
    	jessica.turn(90);
    	jessica.move(50);
    	jessica.turn(90);
    	jessica.move(50);
    	jessica.turn(90);
    }

}

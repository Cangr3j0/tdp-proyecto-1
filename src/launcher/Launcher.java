package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Student estudiante=new Student(105000,"Arroyo","Luciano","lucho14staff@gmail.com","https://github.com/Cangr3j0/","/images/lucho.png");
            	SimplePresentationScreen screen=new SimplePresentationScreen(estudiante);
            	screen.setVisible(true);
            }
        });
    }
}
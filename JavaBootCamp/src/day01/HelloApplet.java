package day01;

import java.awt.Font ;
import java.awt.Graphics ;
import javax.swing.JApplet ;

public class HelloApplet extends JApplet{
	public void init(){
		System.out.println("init");
	}
	public void paint(Graphics g) {
		g.setFont(new Font("Helvetica", Font.BOLD, 18));
		g.drawString("Here I am!", 25, 25) ;
		System.out.println("paint");
	}
	public void stop(){
		System.out.println("stop");
	}
}
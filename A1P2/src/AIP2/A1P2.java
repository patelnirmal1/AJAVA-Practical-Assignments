package AIP2;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class A1P2 extends Applet {
	
	

	public void paint(Graphics g){
		
		setSize(500,500);
		
		g.setColor(Color.blue);
		g.fillRect(0,0,100, 50);
		
		g.setColor(Color.red);
		g.fillRect(110, 0, 50, 50);
		
		g.setColor(Color.magenta);
		g.fillOval(170, 0, 50,50);
		
//		g.drawPolygon(new int[] {10, 20, 30}, new int[] {100, 20, 100}, 3);
	}
}

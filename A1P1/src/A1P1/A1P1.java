package A1P1;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class A1P1 extends Applet {
	int x = 0 , y=100;
	
	public void paint(Graphics g)
	{
		setSize(800,200);
		Font font = new Font("Times New Roman",Font.BOLD,100);
		g.setFont(font);
		g.setColor(Color.magenta);
		g.drawString("Patel Nirmal", x, y);
		
		try{Thread.sleep(100);}catch(Exception ex){}
		x=x+10;
		if(x>this.getWidth()){
			x=0;
		}
		repaint();
	}
	
}
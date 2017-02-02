package LineMove;



import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Custom_canvas extends Canvas {
	
	private int x1,x2;

	public Custom_canvas(int x1,int x2) {
		this.x1=x1;
		this.x2=x2;
		setSize(100, 100);
		setBackground(Color.orange);
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		g.drawLine(x1, 50, x2, 80);
	
	}
	
	public void updateCoordinates(int x1,int x2)
	{
		this.x1=x1;
		this.x2=x2;
		repaint();
	}

}




package LineMove;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class LineMove extends JApplet implements ActionListener {

	JButton btnRight, btnLeft;
	int x1=30,x2=30;
	Custom_canvas customCanvas;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		Panel panel1 = new Panel();
		customCanvas = new	Custom_canvas(x1, x2);
		panel1.add(customCanvas);
		add(panel1, BorderLayout.NORTH);
		btnLeft = new JButton("Move Left");
		btnRight = new JButton("Move Right");
		Panel panel2 = new Panel();
		panel2.add(btnLeft);
		panel2.add(btnRight);
		add(panel2, BorderLayout.SOUTH);
		btnLeft.addActionListener(this);
		btnRight.addActionListener(this);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource() == btnLeft) {
			customCanvas.updateCoordinates(x1-=10, x2-=10);
		} else if (arg0.getSource() == btnRight) {
			customCanvas.updateCoordinates(x1+=10, x2+=10);
		}
		
	}



}

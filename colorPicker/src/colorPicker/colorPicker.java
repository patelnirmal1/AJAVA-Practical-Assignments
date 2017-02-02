package colorPicker;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;

public class colorPicker extends JFrame implements ActionListener{

	JButton b;
	Canvas cc;
	
	colorPicker(){
		setLayout(new FlowLayout());
		b = new JButton("Choose Color");
		add(b);
		b.addActionListener(this);
		 
		cc = new Canvas();
		cc.setSize(50, 50);
		cc.setBackground(Color.black);
		add(cc);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Color initialcolor=Color.RED;    
		Color color=JColorChooser.showDialog(this,"Select a color",initialcolor);    
		cc.setBackground(color);
	}
	
	public static void main(String[]args){
		colorPicker ch = new colorPicker();
		ch.setSize(300, 300);
		ch.setVisible(true);
	}
	
}
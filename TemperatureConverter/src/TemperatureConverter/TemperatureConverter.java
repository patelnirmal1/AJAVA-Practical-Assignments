package TemperatureConverter;

import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TemperatureConverter extends JApplet implements ActionListener {

	JLabel cel,far;
	JTextField cc,ff;
	JButton c2f,f2c;
	
	public void init(){
		setSize(300,300);
		GridLayout gl = new GridLayout(2,3);
		setLayout(gl);
		
		
		cel = new JLabel("Celcius");
		far = new JLabel("Fahrenheit");
		cc = new JTextField();
		ff = new JTextField();
		c2f = new JButton("Convert C to F");
		f2c = new JButton("Convert F to C");
		c2f.addActionListener(this);
		f2c.addActionListener(this);
		add(cel);
		add(cc);
		add(c2f);
		add(far);
		add(ff);
		add(f2c);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(c2f)){
			float c,ansc;
			String c1 = cc.getText().toString();
			c = Float.parseFloat(c1);
			ansc = 9 * (c / 5) + 32;
			c1 = String.valueOf(ansc);
			ff.setText(c1);
		}
		else if(e.getSource().equals(f2c)){
			float f,ansf;
			String f1 = ff.getText().toString();
			f = Float.parseFloat(f1);
			ansf = (f- 32) * 5 / 9;
			f1 = String.valueOf(ansf);
			cc.setText(f1);
		}
	}

}

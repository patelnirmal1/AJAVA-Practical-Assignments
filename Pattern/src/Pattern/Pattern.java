package Pattern;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pattern extends JApplet implements ActionListener{

	JButton b[]=new JButton[9];
	JButton clr,b9,enter;
	TextField t ;
	JPanel p1,p2;
	
	public void init(){
		t = new TextField("");
		p1 = new JPanel();
		p1.setLayout(new BorderLayout());
		p1.add(t,BorderLayout.NORTH);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(4,3));
		
		for(int i=0;i<9;i++)
		{
			b[i]=new JButton(""+i);
		}
		clr = new JButton("clear");
		b9 = new JButton("9");
		enter = new JButton("Enter");
		for(int i=0;i<9;i++)
		{
			p2.add(b[i]);
		}
		p2.add(clr);
		p2.add(b9);
		p2.add(enter);
		p1.add(p2, BorderLayout.CENTER);
		add(p1);
		
		for(int i=0;i<9;i++)
		{
			b[i].addActionListener(this);
		}
		clr.addActionListener(this);
		b9.addActionListener(this);
		enter.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		t.setEchoChar('*');
		String str = t.getText().trim();
		for(int i=0,num=0;i<9;i++,num++){
			
			if(e.getSource().equals(b[i])){
				t.setText(str+num);	
			}
		}
		if(e.getSource().equals(clr)){
			t.setText("");
		}
		else if(e.getSource().equals(b9)){
			t.setText(str+"0");
		}
		else if (e.getSource() == enter) {
			if (str.contentEquals("7017")) {
				t.setEchoChar((char) 0);
				t.setText("OPEN");
			}

			else {
				t.setEchoChar((char) 0);
				t.setText("WRONG");
			}
		}
	}
	
}



/*package Pattern;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;

public class Pattern extends JApplet implements ActionListener {

	Panel p1, p2, p3;
	TextField text;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, clr, b0, enter;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();

		setSize(200, 130);
		setLayout(new FlowLayout());
		text = new TextField("");
		text.setPreferredSize(new Dimension(170, 20));

		p1 = new Panel();
		setLayout(new BorderLayout());
		p1.add(text, BorderLayout.NORTH);

		p2 = new Panel();
		p2.setLayout(new GridLayout(4, 3));

		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
		clr = new Button("CLR");
		b0 = new Button("0");
		enter = new Button("ENTER");

		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(clr);
		p2.add(b0);
		p2.add(enter);

		p1.add(p2, BorderLayout.CENTER);
		add(p1);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		clr.addActionListener(this);
		b0.addActionListener(this);
		enter.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		text.setEchoChar('*');
		String str = text.getText().trim();

		if (e.getSource() == b1) {
			text.setText(str + "1");
		}

		else if (e.getSource() == b2) {
			text.setText(str + "2");
		}

		else if (e.getSource() == b3) {
			text.setText(str + "3");
		}

		else if (e.getSource() == b4) {
			text.setText(str + "4");
		}

		else if (e.getSource() == b5) {
			text.setText(str + "5");
		}

		else if (e.getSource() == b6) {
			text.setText(str + "6");
		}

		else if (e.getSource() == b7) {
			text.setText(str + "7");
		}

		else if (e.getSource() == b8) {
			text.setText(str + "8");
		}

		else if (e.getSource() == b9) {
			text.setText(str + "9");
		}

		else if (e.getSource() == clr) {
			text.setText("");
		}

		else if (e.getSource() == b0) {
			text.setText(str + "0");
		}

		else if (e.getSource() == enter) {
			if (str.contentEquals("117")) {
				text.setEchoChar((char) 0);
				text.setText("OPEN");
			}

			else {
				text.setEchoChar((char) 0);
				text.setText("WRONG");
			}
		}
	}
}
*/
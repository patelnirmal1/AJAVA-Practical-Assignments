package MobileCall;

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

public class MobileCall extends JApplet implements ActionListener{

	JButton b[]=new JButton[9];
	JButton clr,b9,call;
	JTextField t ;
	JPanel p1,p2;
	
	public void init(){
		t = new JTextField("");
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
		call = new JButton("call");
		for(int i=0;i<9;i++)
		{
			p2.add(b[i]);
		}
		p2.add(clr);
		p2.add(b9);
		p2.add(call);
		p1.add(p2, BorderLayout.CENTER);
		add(p1);
		
		for(int i=0;i<9;i++)
		{
			b[i].addActionListener(this);
		}
		clr.addActionListener(this);
		b9.addActionListener(this);
		call.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
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
		if(e.getSource().equals(call)){
			if(t.getText().equals("")){
				t.setText("Wrong Number");
			}
			else if(call.getLabel().equals("call")){
				call.setLabel("HANG UP");
			}
			else{
				call.setLabel("CALL");
				t.setText(" ");
			}
		}
	}
	
}


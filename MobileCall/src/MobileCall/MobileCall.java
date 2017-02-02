package MobileCall;
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

public class MobileCall extends JApplet implements ActionListener {

	Panel p1, p2;
	TextField text;
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, clr, b0, call;

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();

		setSize(200, 130);
		/*setLayout(new FlowLayout());*/
		text = new TextField("");

		p1 = new Panel();
		p1.setLayout(new BorderLayout());
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
		call = new Button("CALL");

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
		p2.add(call);

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
		call.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

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

		else if (e.getSource() == call) {
			if (call.getLabel().equals("CALL")) {
				call.setLabel("HangUp");
			} else {
				call.setLabel("CALL");
				text.setText(" ");
			}

		}
	}
}

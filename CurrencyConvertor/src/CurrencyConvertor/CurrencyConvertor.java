package CurrencyConvertor;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CurrencyConvertor extends Applet implements ActionListener {
	
	Label dollar,euro,rs;
	TextField dollarM,euroM,rsM;
	Button convert;
	
	public void init(){
		GridLayout gl = new GridLayout(4,2 );
		setLayout(gl);
		
		dollar = new Label("Dollar");
		euro = new Label("Euro");
		rs = new Label("RS");
		dollarM = new TextField();
		euroM = new TextField();
		rsM = new TextField();
		convert = new Button("Conert");
		add(rs);
		add(rsM);
		add(dollar);
		add(dollarM);
		add(euro);
		add(euroM);
		setLayout(getLayout());
		add(convert);
		rsM.addActionListener(this);
		dollarM.addActionListener(this);
		euroM.addActionListener(this);
		convert.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//RS Conversion
		String a1 = rsM.getText();
		Double a2 = Double.parseDouble(a1);
		Double a3 = a2*60;
		String a4 = Double.toString(a3);
		dollarM.setText(a4);
		
		Double a5 = a2 *90;
		String a6 = Double.toString(a5);
		euroM.setText(a6);
		//RS Conversion Completed
		
		/*String b1 = dollarM.getText();
		Double b2 = Double.parseDouble(b1);
		Double b3 = b2/60;
		String b4 = Double.toString(b3);
		rsM.setText(b4);*/
	}
	
}

package A1P3;

import java.applet.Applet;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.TextField;


public class A1P3 extends Applet{
	
	int i;
	TextField t;
	Button b[] = new Button[10];
	Button add,sub,mul,div,clear,EQ;
		
	public void init(){
		GridLayout gl = new GridLayout(4, 5);
		setLayout(gl);
		t=new TextField(10);
		for (i=0;i<10;i++){
			b[i]= new Button(""+i);
		}
		add = new Button("Add");
		sub = new Button("Sub");
		mul = new Button("Mul");
		div = new Button("Div");
		clear = new Button("Clear");
		EQ = new Button("EQ");
		
		add(t);
		for(i=0;i<10;i++){
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(clear);
		add(EQ);
	}
}
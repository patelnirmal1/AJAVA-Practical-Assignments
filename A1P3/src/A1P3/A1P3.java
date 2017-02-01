package A1P3;
import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class A1P3 extends Applet implements ActionListener{


	TextField text;
	int flag=0;
	String t,add,sub,mul,div;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b_add,b_sub,b_mul,b_div,b_clr,b_e;
	
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		setSize(170,130);
		setLayout(new BorderLayout());
		Panel p1=new Panel();
	    text = new TextField(20);
		p1.add(text);
		add(p1,BorderLayout.NORTH);
		
		Panel p2 = new Panel();
		Panel p3=new Panel();
		b0= new Button("0");
		b1= new Button("1");
		b2= new Button("2");
		b3= new Button("3");
		b4= new Button("4");
		b5= new Button("5");
		b6= new Button("6");
		b7= new Button("7");
		b8= new Button("8");
		b9= new Button("9");
		b_add= new Button("+");
		b_sub= new Button("-");
		b_mul= new Button("*");
		b_div= new Button("/");
		b_clr= new Button("CLR");
		b_e=new Button("=");
		
	//	p2.setSize(300,300);
		p2.setLayout(new GridLayout(4,4));
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b0);
		p2.add(b_add);
		p2.add(b_sub);
		p2.add(b_mul);
		p2.add(b_div);
		p2.add(b_e);
		p2.add(b_clr);
		
		p3.add(p2);
		add(p3,BorderLayout.CENTER);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b_add.addActionListener(this);
		b_sub.addActionListener(this);
		b_mul.addActionListener(this);
		b_div.addActionListener(this);
		b_clr.addActionListener(this);
		b_e.addActionListener(this);
		
	}

	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		if(b0.hasFocus()){
			t=text.getText();
			text.setText(t+"0");
		}
		
		else if(b1.hasFocus()){
			t=text.getText();
			text.setText(t+"1");
		}
		
		else if(b2.hasFocus()){
			t=text.getText();
			text.setText(t+"2");
		}
		else if(b3.hasFocus()){
			t=text.getText();
			text.setText(t+"3");
		}
		else if(b4.hasFocus()){
			t=text.getText();
			text.setText(t+"4");
		}
		else if(b5.hasFocus()){
			t=text.getText();
			text.setText(t+"5");
		}
		else if(b6.hasFocus()){
			t=text.getText();
			text.setText(t+"6");
		}
		else if(b7.hasFocus()){
			t=text.getText();
			text.setText(t+"7");
		}
		else if(b8.hasFocus()){
			t=text.getText();
			text.setText(t+"8");
		}
		else if(b9.hasFocus()){
			t=text.getText();
			text.setText(t+"9");
		}
		else if(b_add.hasFocus()){
			if(text.getText()!=""){		
			add=text.getText();
			text.setText("");
			flag=1;
			}
		}
		
		else if(b_sub.hasFocus()){
			if(text.getText()!=""){
				sub=text.getText();
				text.setText("");
				flag=2;
				};	
		}
		else if(b_mul.hasFocus()){
			if(text.getText()!=""){
				mul=text.getText();
				text.setText("");
				flag=3;
				}	
		}
		else if(b_div.hasFocus()){
			if(text.getText()!=""){			
				div=text.getText();
				text.setText("");
				flag=4;
				}
		}
		else if(b_e.hasFocus()){
			
			int add1=0,sub1=0,mul1=0,div1=0;
			String adds,subs,muls,divs;
			int t1=Integer.parseInt(text.getText());
		
			if(flag==1){
			add1=Integer.parseInt(add)+t1;
			adds=String.valueOf(add1);
			text.setText(adds);
			flag=0;
			}
			
			else if(flag==2){
			sub1=Integer.parseInt(sub)-t1;
			subs=String.valueOf(sub1);
			text.setText(subs);
			flag=0;
			}
			
			else if(flag==3){
			mul1=Integer.parseInt(mul)*t1;
			muls=String.valueOf(mul1);
			text.setText(muls);
			flag=0;
			}
			
			else if(flag==4){
				if(t1==0){
				text.setText("");
				}
				else{
			div1=Integer.parseInt(div)/t1;
			divs=String.valueOf(div1);
			text.setText(divs);
			flag=0;
				}
			}
}
		if(b_clr.hasFocus()){
			text.setText("");
		}				
		
	}
	
}
/*package A1P3;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
 

 
public class A1P3 extends Applet
implements ActionListener
{
	String msg=" ";
	int v1,v2,result;
	TextField t1;
	Button b[]=new Button[10];
	Button add,sub,mul,div,clear,mod,EQ;
	char OP;
	public void init()
	{
		t1=new TextField(10);
		GridLayout gl=new GridLayout(4,5);
		setLayout(gl);
		for(int i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		add=new Button("add");
		sub=new Button("sub");
		mul=new Button("mul");
		div=new Button("div");
		mod=new Button("mod");
		clear=new Button("clear");
		EQ=new Button("EQ");
		t1.addActionListener(this);
		add(t1);
		for(int i=0;i<10;i++)
		{
			add(b[i]);
		}
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(mod);
		add(clear);
		add(EQ);
		for(int i=0;i<10;i++)
		{
			b[i].addActionListener(this);
		}
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		mod.addActionListener(this);
		clear.addActionListener(this);
		EQ.addActionListener(this);
	}
 
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		char ch=str.charAt(0);
		if ( Character.isDigit(ch))
		t1.setText(t1.getText()+str);
		else
		if(str.equals("add"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='+';
			t1.setText("");
		}
		else if(str.equals("sub"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='-';
			t1.setText("");
		}
		else if(str.equals("mul"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='*';
			t1.setText("");
		}
		else if(str.equals("div"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='/';
			t1.setText("");
		}
		else if(str.equals("mod"))
		{
			v1=Integer.parseInt(t1.getText());
			OP='%';
			t1.setText("");
		}
		if(str.equals("EQ"))
		{
			v2=Integer.parseInt(t1.getText());
			if(OP=='+')
				result=v1+v2;
			else if(OP=='-')
				result=v1-v2;
			else if(OP=='*')
				result=v1*v2;
			else if(OP=='/')
				result=v1/v2;
			else if(OP=='%')
				result=v1%v2;
			t1.setText(""+result);
		}	
		if(str.equals("clear"))
		{
			t1.setText("");
		}
	}
}*/

package A1P4;
import java.awt.*;
import java.applet.*;
import java.applet.*;
import java.awt.*;
import java.util.*;

public class A1P4 extends Applet implements Runnable {

	Thread t ;
	public void start(){
		t=new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		while(true)
		{
			repaint();
			try{t.sleep(1000);}catch(Exception e){}
		}
	} 
	
	public void paint(Graphics g){
		Calendar cal = new GregorianCalendar();
		String hour = String.valueOf(cal.get(Calendar.HOUR));
		String minute = String.valueOf(cal.get(Calendar.MINUTE));
		String second = String.valueOf(cal.get(Calendar.SECOND));
		g.drawString(hour + ":" + minute + ":" + second, 20, 30);
	}
   
}
package thread;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JLabel;

public class Thread_me implements Runnable {

	private JLabel iming ;
	private SimpleDateFormat formater;
	private Calendar cal;
	
	
	public Thread_me(JLabel iming) {
		
		this.iming = iming ;
	}
	
	
	
	
	@Override
	public void run() {
		SimpleDateFormat formater = new SimpleDateFormat("HH:mm");
		Calendar cal = Calendar.getInstance();
		try {
			cal.setTime(formater.parse("00:00"));
		}catch(Exception ex) { ex.printStackTrace();}
		while(true) {
			try {
				Thread.sleep(1000);
				cal.add(Calendar.MINUTE, 1);
				this.iming.setText(formater.format(cal.getTime()));		
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
}
}
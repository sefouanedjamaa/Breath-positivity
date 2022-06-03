package ihm;

import javax.sound.sampled.Clip;
import javax.swing.*;    
//import thread.Thread_meditation;

public class ProgressBar extends JFrame{    
	JProgressBar jb;    
	int i=0,num=0;    
	
	
	public ProgressBar(){  
		
		jb=new JProgressBar(0,100);    
		jb.setBounds(40,40,160,30);         
		jb.setValue(0);    
		jb.setStringPainted(true);    
		add(jb);    
		setSize(250,150);    
		setLayout(null);
		this.setLocationRelativeTo(null);

	}   
	
	
	public JProgressBar getProgressBar(){
		  return this.jb;
		}
	
	
	public void iterate(){    
		while(i<=100){  
			jb.setValue(i);    
			i=i+1;  
			try{Thread.sleep(1050);}catch(Exception e){}    
		}   
	}


	public static void main(String[] args) {    
		ProgressBar m=new ProgressBar();    
		m.setVisible(true);    
		m.iterate();    
	}  
}    
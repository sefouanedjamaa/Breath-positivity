package ihm;

import javax.swing.*;
import java.awt.event.*;  
import java.io.*;  

public class Story implements ActionListener{
    
    private JButton b;
    private JTextArea area;
    
    
    public Story() {
        JFrame f= new JFrame();  
        area=new JTextArea();  
        area.setBounds(50,50,300,200);  
        b=new JButton("Valider");  
        b.setBounds(100,300,120,30);  
        b.addActionListener(this);  
        f.add(area);f.add(b);  
        f.setSize(450,450);  
        f.setLayout(null);  
        f.setVisible(true);  
        
    }

    public void actionPerformed(ActionEvent e){
    try{  
        String text=area.getText(); 
        BufferedWriter writer = new BufferedWriter(new FileWriter("story.txt", true));
        writer.append('\n');
        writer.append(text);
        writer.close();
        }catch(Exception ex){
            System.out.println("error");
        }   
    }

	public void setVisible(boolean c) {
		
		
	}  

    
}
package ihm;

import java.awt.BorderLayout;

import javax.swing.border.Border;

import java.util.Scanner;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Vector;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import thread.Thread_me;
import thread.Thread_meditation;
import ihm.ProgressBar;


public class Interface extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8156840737257422666L;
	private static final Color preserveBackgroundColor = null;
	private JLabel title;
	private JButton btn_timing;
	private JLabel timing;
	private JButton btn_sos;
	private JButton btn_citation;
	private JButton btn_story;
	private JButton btn_meditation;

	private Clip clip;
	private JButton btn_youAre;
	private Vector <String> citations ;
	private Vector <String> you_are ;
	private Vector <String> meditate ;



	public Interface(String titre) {

		super(titre);
		this.init();
		this.build();
		Thread_me timer = new Thread_me(timing);
		Thread time = new Thread(timer);
		time.start();
		this.lectureSounds();
		this.lectureMeditation();
	}

	public void init(){



		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(900,400);
		this.setVisible(true);
		this.setDefaultLookAndFeelDecorated(true);
		this.setLocationRelativeTo(null);

		




		citations = new Vector<String>();
		citations.add("citation1.txt");
		citations.add("citation2.txt");
		citations.add("citation3.txt");
		citations.add("citation4.txt");
		citations.add("citation5.txt");
		citations.add("citation6.txt");
		citations.add("citation7.txt");
		citations.add("citation8.txt");
		citations.add("citation9.txt");




		you_are = new Vector<String>();

		meditate = new Vector<String>() ;










		this.title = new JLabel("☮️☮️  Welcome to PeaceLand  ☮️☮️ ",JLabel.CENTER);
		title.setOpaque(true);
		Color c5=new Color(107, 222, 243);
		title.setBackground(c5);
		title.setForeground(Color.black);
		title.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 28));





		this.btn_timing = new JButton(" 😊 ❤️ You are calme and feeling much better ❤️ 😊 ");
		btn_timing.setOpaque(true);
		Color c9=new Color(107, 222, 243);
		btn_timing.setBackground(c9);
		btn_timing.setForeground(Color.black);
		btn_timing.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 20));
		btn_timing.addActionListener(this);		






	}


	private JPanel getBlankPanel() {
		JPanel p = new JPanel();
		p.setOpaque(true);
		p.setBackground(Color.WHITE);
		return p;
	}




	public void build (){
		JPanel main_panel = new JPanel();
		main_panel.setLayout(new BorderLayout());
		main_panel.add(title , BorderLayout.PAGE_START);
		main_panel.add(btn_timing,BorderLayout.PAGE_END);
		JPanel btn_panel = new JPanel(new GridLayout(0,5));

		////////////////////////////////////






		btn_story = new JButton("😌Share your story😌");
		btn_story.setOpaque(true);
		Color c1=new Color(147,112,219);
		btn_story.setBackground(c1);
		btn_story.setForeground(Color.black);
		btn_story.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 12));
		btn_story.addActionListener(this);



		///////////////////////////////////////////////////////



		btn_youAre = new JButton("😍 You are ...😍");
		btn_youAre.setOpaque(true);
		Color c2=new Color(147,112,219);
		btn_youAre.setBackground(c2);
		btn_youAre.setForeground(Color.black);
		btn_youAre.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 15));
		btn_youAre.addActionListener(this);




		///////////////////////////////////////////////////


		btn_meditation = new JButton("✨ let's meditate ✨");
		btn_meditation.setOpaque(true);
		Color c3=new Color(147,112,219);
		btn_meditation.setBackground(c3);
		btn_meditation.setForeground(Color.black);
		btn_meditation.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 13));
		btn_meditation.addActionListener(this);


		
		/////////////////////////



		btn_citation = new JButton("♎ Today's Saying ♎");
		btn_citation.setOpaque(true);
		Color c4=new Color(107, 222, 243);
		btn_citation.setBackground(c4);
		btn_citation.setForeground(Color.black);
		btn_citation.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 12));
		btn_citation.addActionListener(this);







		btn_sos = new JButton("🆘 SOS Contact 🆘");
		btn_sos.setOpaque(true);
		Color c5=new Color(107, 222, 243);
		btn_sos.setBackground(c5);
		btn_sos.setForeground(Color.black);
		btn_sos.setFont(new Font("Papyrus", Font.BOLD|Font.ITALIC, 15));
		btn_sos.addActionListener(this);



		this.timing = new JLabel("chrono");
		btn_panel.add(getBlankPanel());
		btn_panel.add(getBlankPanel());


		btn_panel.add(btn_youAre, BorderLayout.SOUTH);
		btn_panel.add(getBlankPanel());

		btn_panel.add(getBlankPanel());

		btn_panel.add(getBlankPanel());

		btn_panel.add(btn_citation, BorderLayout.EAST);
		btn_panel.add(getBlankPanel());

		btn_panel.add(btn_sos, BorderLayout.CENTER);
		btn_panel.add(getBlankPanel());
		//btn_panel.add(getBlankPanel());
		btn_panel.add(btn_story, BorderLayout.PAGE_END);

		btn_panel.add(getBlankPanel());
		btn_panel.add(getBlankPanel());
		btn_panel.add(getBlankPanel());
		//btn_panel.add(getBlankPanel());
		btn_panel.add(btn_meditation, BorderLayout.WEST);

		// btn_panel.add(btn6);


		main_panel.add(btn_panel,BorderLayout.CENTER );
		this.getContentPane().add(main_panel);



	}

	private void setBorder(Border createEmptyBorder) {
		// TODO Auto-generated method stub

	}

	private void lectureSounds() {
		try {
			File fichier = new File("sounds.txt");
			Scanner myReader = new Scanner(fichier);
			String ligne;

			while(myReader.hasNextLine()){
				ligne=myReader.nextLine();
				you_are.add(ligne);
			}


			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	private void lectureMeditation() {
		try {
			File fichier = new File("meditation.txt");
			Scanner myReader = new Scanner(fichier);
			String ligne;

			while(myReader.hasNextLine()){
				ligne=myReader.nextLine();
				meditate.add(ligne);
			}


			myReader.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}


	public boolean bouttonAppuye() {
		
		return true;
		
	}





	@Override
	public void actionPerformed(ActionEvent arg0) {


		//charger le fichier 
		// generer un nombre aleatoire
		// lire le fichier à ligne du nombre ameatoire 
		//jouer le son dans le chemin et la ligne 



		if (arg0.getSource() == this.btn_youAre) {

			Random random = new Random();
			int nb_aleatoire = random.nextInt(you_are.size()); 
			String mon_fichier_audio = you_are.get(nb_aleatoire);

			try {
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(mon_fichier_audio));
				audioStream = AudioSystem.getAudioInputStream(new File(mon_fichier_audio));		


				this.clip = AudioSystem.getClip();
				clip.open(audioStream);
				clip.start();
			} catch (LineUnavailableException e1) {

				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			}

		}




		////////////////////////////////////////////////////////
		if (arg0.getSource() == this.btn_meditation) {

			Random random = new Random();
			int nb_aleatoire = random.nextInt(meditate.size()); 
			String mon_fichier_audio = meditate.get(nb_aleatoire);

			try {
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(mon_fichier_audio));
				audioStream = AudioSystem.getAudioInputStream(new File(mon_fichier_audio));	
				

				this.clip = AudioSystem.getClip();
				clip.open(audioStream);
				clip.start();
				//ProgressExemple barre_progression = new ProgressExemple(clip);

				ProgressBar ma_barre = new ProgressBar();
				ma_barre.setVisible(true);
				Thread_meditation th = new Thread_meditation(ma_barre,clip);
				Thread mon_thread = new Thread(th);
				mon_thread.start();

			} catch (LineUnavailableException e1) {

				e1.printStackTrace();
			} catch (UnsupportedAudioFileException e1) {

				e1.printStackTrace();
			} catch (IOException e1) {

				e1.printStackTrace();
			}

		}







		if (arg0.getSource() == this.btn_citation) {

			Random random = new Random();
			int nb_aleatoire = random.nextInt(citations.size()); 
			String mon_fichier = citations.get(nb_aleatoire);
			try {
				String content = new String(Files.readAllBytes(Paths.get("citation/"+mon_fichier)));
				JOptionPane.showMessageDialog(null,content,"Today's Proverb",JOptionPane.INFORMATION_MESSAGE,null);
			}catch(Exception exc) {
				exc.printStackTrace();
			}
		}



		// TODO Auto-generated method stub
		//thread
		if (arg0.getSource() == this.btn_timing) {
			JOptionPane.showMessageDialog(null, " it took you  "+ timing.getText()+" minutes  this time, Good Job you have progressed !!"); 


		}

		////image sos
		if (arg0.getSource() == this.btn_sos) {
			PageSos contact = new PageSos(new ImageIcon("sos.png").getImage());
			JFrame sos = new JFrame();
			sos.getContentPane().add(contact);
			sos.pack();
			sos.setVisible(true);
			sos.setLocationRelativeTo(null);

		}


		//share your story
		if (arg0.getSource() == this.btn_story) {

			Story st = new Story();

		}







	}

}

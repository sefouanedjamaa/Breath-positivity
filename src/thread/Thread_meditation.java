package thread;

import javax.sound.sampled.Clip;
import javax.swing.JProgressBar;

import ihm.ProgressBar;

public class Thread_meditation implements Runnable{

	
	
	private ProgressBar prog;
	private Clip clip;
	private JProgressBar barre;

	
	
public Thread_meditation(ProgressBar progress , Clip clip ) {
        
        this.prog =progress;
        this.clip=clip;
        this.barre=prog.getProgressBar();
    }
	

	@Override
	public void run() {
        //clip.start();
        
        
        // je suis conscient qu'il faut implémenter cette partie du code pour calculer le 
        //pourcentage mais cela me génere un JProgressBar qui n'évolue pas , sachant que je pense que j'ai suivi toutes les etapes 
        //j'ai préferé appeler la fonction itérate car au moins elle m'affiche et la bare  qui s'evolue et l'interface 
        
        
      /*  while(clip.isActive()){
             float pourcentage = (float)clip.getFramePosition()/(float)clip.getFrameLength();
              barre.setValue((int) pourcentage *100 );
              try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            }*/
		prog.iterate();

    }

}



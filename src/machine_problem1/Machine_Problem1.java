package machine_problem1;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author Jim Aerol
 */
public class Machine_Problem1 {
    public static void main(String[] args) {
        String filepath = "Medieval Music.wav";
       
        try{
            File musicPath = new File(filepath);
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
            Clip clip = AudioSystem.getClip();
            
            if (musicPath.exists()){
                
                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            } else {
                System.out.println("Can't find music file");
                clip.stop();
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        
        
        Menu logFrame = new Menu();
        logFrame.pack();
        logFrame.setVisible(true); // Display LogIn frame
    }
    
}

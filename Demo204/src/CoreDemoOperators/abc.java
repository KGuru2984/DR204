package CoreDemoOperators;

import javax.sound.sampled.*;
import java.io.*;

public class abc {
    public static void main(String[] args) {
        try {
            File file = new File("file_example_WAV_1MG.wav"); // Replace with your file name
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(
                    new BufferedInputStream(new FileInputStream(file))
            );

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            // Wait for the clip to finish playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}



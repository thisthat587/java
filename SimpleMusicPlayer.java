import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleMusicPlayer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath ="C:\\Users\\Piyush Singh\\Downloads\\Marham (Pehle Bhi Main) [128 Kbps]-(SongsPk.com.se).wav"
;        try {
            // Open an audio input stream.
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Start playing
            clip.start();
            System.out.println("Playback started.");

            String response = "";
            while (!response.equals("Q")) {
                System.out.println("P = play, S = stop, R = reset, Q = quit");
                System.out.print("Enter your choice: ");

                response = scanner.nextLine().toUpperCase();
                switch (response) {
                    case "P": 
                        if (!clip.isRunning()) {
                            clip.start();
                        }
                        break;
                    case "S": clip.stop(); break;
                    case "R": clip.setMicrosecondPosition(0); break;
                    case "Q": clip.close(); break;
                }
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            System.err.println("Error playing audio file.");
            ex.printStackTrace();
        }
    }
}


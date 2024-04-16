package threadsinjava;

import java.util.ArrayList;

public class Thread2 extends Thread {

    public void run() {
        FilePlayer file = new FilePlayer();

        ArrayList<String> soundsThread2 = new ArrayList<String>();
        soundsThread2.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\re.wav");
        soundsThread2.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\fa.wav");
        soundsThread2.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\la.wav");
        soundsThread2.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\do-octave.wav");

        // Play Twinkle Twinkle Little Star
        for (int i = 0; i < 3; i++) {
            // Second line of the song
            for (String sound : soundsThread2) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Playing sound: " + sound);
                file.play(sound);
            }
        }
    }
}

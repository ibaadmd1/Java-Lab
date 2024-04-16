package threadsinjava;

import java.util.ArrayList;

public class Thread1 extends Thread {

    public void run() {
        FilePlayer file = new FilePlayer();

        ArrayList<String> soundsThread1 = new ArrayList<String>();
        soundsThread1.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\do.wav");
        soundsThread1.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\mi.wav");
        soundsThread1.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\sol.wav");
        soundsThread1.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\si.wav");
        soundsThread1.add("C:\\Users\\Ibaad Mohammed\\OneDrive\\Documents\\NetBeansProjects\\ThreadsInJava\\Multithreading  Resources\\Sounds\\do-octave.wav");

        // Play Twinkle Twinkle Little Star
        for (int i = 0; i < 3; i++) {
            // First line of the song
            for (String sound : soundsThread1) {
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

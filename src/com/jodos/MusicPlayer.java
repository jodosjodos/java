package com.jodos;

import javax.sound.sampled.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        try {
            String songUrl = String.valueOf(JOptionPane.showInputDialog("Enter url of song you want "));

            File file = new File(songUrl);
            Scanner scanner = new Scanner(System.in);


            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";
            while (!response.equals("Q")) {
                System.out.println(" P = play , S = Stop , R = reset , Q = quit");
                System.out.print("Enter your choice :");
                response = scanner.next().toUpperCase();
                switch (response) {
                    case ("P"):
                        System.out.println("enjoy music 🎧🎧");
                        clip.start();
                        break;
                    case ("S"):
                        clip.stop();
                        break;
                    case ("R"):
                        System.out.println("you restarted music 🎧");
                        clip.setMicrosecondPosition(0);
                        break;
                    case ("Q"):
                        clip.close();
                        System.out.println("tx for listening to music 🥳");
                        break;
                    default:
                        System.out.println("Not a  valid response");
                }

            }


        } catch (UnsupportedAudioFileException e){
            System.out.println("You have entere unsupported file");
        }
    }
}

package com.jodos;

import javax.swing.*;
import java.awt.*;

public class PrograssBar {


    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 150);


    PrograssBar() {


        bar.setValue(0);
        bar.setFont(new Font("Mo Vli", Font.TYPE1_FONT, 24));
        bar.setForeground(Color.blue);
        bar.setBackground(Color.BLACK);
        bar.setBounds(10, 10, 420, 50);
        bar.setStringPainted(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.add(bar);
        frame.setVisible(true);

        fill();

    }

    public void fill() {
        int counter = 150;
        while (counter >= 0) {
            bar.setValue(counter);
            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
            counter -= 1;


        }

        bar.setString("done! :");
    }
}

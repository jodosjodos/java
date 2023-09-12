package com.jodos;

import javax.swing.*;
import java.awt.*;

public class FirstFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("My bio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        frame.setSize(420, 420);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("viking.jpeg");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(23, 150, 134));
        frame.getGraphics();
    }
}

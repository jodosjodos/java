package com.jodos;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FirstLabel {
    public static void main(String[] args) {

//        create image icon
        ImageIcon originalImageIcon = new ImageIcon("Viking.jpeg");
        int newWidth = 400;
        int newHeight = 400;

        Image originalImage = originalImageIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        ImageIcon resizedImageIcon = new ImageIcon(resizedImage);


//        border
        Border border = BorderFactory.createLineBorder(Color.gray, 3);

// creating label
        JLabel label = new JLabel();
        label.setText("Welcome to Viking label ");
        label.setIcon(resizedImageIcon);
        label.setSize(30, 30);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(79, 89, 58));
        label.setFont(new Font("MV Boli", Font.ITALIC, 20));
        label.setIconTextGap(30);
        label.setBackground(new Color(0, 0, 0));
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();


    }
}

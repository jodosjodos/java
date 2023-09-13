package com.jodos;

import javax.swing.*;
import java.awt.*;

public class NewWindow {
    JFrame frame = new JFrame();
    JLabel label = new JLabel("welcome to new window");
    NewWindow(){

        label.setBounds(0,5,10,15);
        label.setFont(new Font(null,Font.ITALIC,25));

 frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }
}

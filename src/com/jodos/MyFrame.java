package com.jodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {

    String[] animals = {"dog", "cat", "bird"};
    JComboBox comboBox = new JComboBox(animals);


    MyFrame() {
        comboBox.addActionListener(this);

        this.add(comboBox);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();
        this.setSize(500,500);
        this.setVisible(true);
        System.out.println(comboBox.getActionListeners());

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox){
            System.out.println(comboBox.getSelectedItem());
//            System.out.println(comboBox.);
        }

    }

}


package com.jodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseColor extends JFrame implements ActionListener {

    JButton button;
    JLabel label;

    ChooseColor() {

        button = new JButton("pick a color");
        label = new JLabel();

        button.addActionListener(this);

        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("This is some text : D");
        label.setFont(new Font("Mo Vli", Font.ITALIC, 100));


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "pick a color", Color.black);

            label.setForeground(color);
        }
    }
}

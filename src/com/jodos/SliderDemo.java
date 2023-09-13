package com.jodos;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.util.Scanner;

public class SliderDemo implements ChangeListener {
    JFrame frame = new JFrame("Slider Demo");
    JPanel panel = new JPanel();
    JLabel label  = new JLabel();
    JSlider slider = new JSlider(0,100,40);
    SliderDemo(){






        //        slider
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(5);
        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        slider.setFont( new Font("MV Boli",Font.ITALIC,15));
        label.setFont( new Font("MV Boli",Font.ITALIC,25));
        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);

        label.setText("°C = " + slider.getValue());

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }

    @Override
    public void stateChanged(ChangeEvent e) {
        // Get the value of the slider.
        int value = slider.getValue();

        // Update the label.
        label.setText("°C = " + value);
    }
}

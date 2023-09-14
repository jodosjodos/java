package com.jodos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("file");
    JMenu editMenu = new JMenu("edit");
    JMenu helpMenu = new JMenu("help");

    JMenuItem loadItem = new JMenuItem("load");
    JMenuItem saveItem = new JMenuItem("save");
    JMenuItem exitItem = new JMenuItem("exit");


    MyFrame() {
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        this.setJMenuBar(menuBar);
        this.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("loading..........");
        } else if (e.getSource() == saveItem) {
            System.out.println("you have saved file");
        } else if (e.getSource() == saveItem) {
       System.exit(0);
        }
    }

}


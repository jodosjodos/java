package com.jodos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name :");
        int age = Integer.parseInt( JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "hello " + name + " you are " + age + " years old");
        JOptionPane.showInputDialog(null,"mee");
    }
}
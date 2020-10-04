package com.company;

import javax.swing.*;
import java.awt.*;

public class GUIJava {

    //Constructor
    public GUIJava(){

        JFrame frame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Click!");
        JLabel jLabel = new JLabel("Number of clicks");
        jPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        jPanel.setLayout(new GridLayout(0,1));
        jPanel.add(jButton);
        jPanel.add(jLabel);

       frame.add(jPanel,BorderLayout.CENTER);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("GUI Application");
       frame.pack();
       frame.setVisible(true);


    }

    public static void main(String[] args) {

        new GUIJava();

    }
}

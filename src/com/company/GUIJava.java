package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIJava implements ActionListener {
    int count = 0;
    JLabel jLabel;
    //Constructor
    public GUIJava(){

        JFrame frame = new JFrame();
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Click!");
        jLabel = new JLabel("Number of clicks:  ");
        jPanel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        jPanel.setLayout(new GridLayout(0,1));
        jPanel.add(jButton);
        jPanel.add(jLabel);
        jButton.addActionListener(this::actionPerformed);

       frame.add(jPanel,BorderLayout.CENTER);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setTitle("GUI Application");
       frame.pack();
       frame.setVisible(true);


    }

    public static void main(String[] args) {

        new GUIJava();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        jLabel.setText("Number of clicks" +count);
    }
}

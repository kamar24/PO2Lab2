/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_gui;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author student
 */
public class Dydaktyka15 {
    
    public static void main(String[] args){
        JFrame frame= new JFrame("NANAN");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane= frame.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        
        GridBagConstraints gbc= new GridBagConstraints();
        for(int i=0;i<3;i++){
            gbc.gridx=i;
            gbc.gridy=i;
            contentPane.add(new JButton("Button("+i+")"), gbc);
        }
        for(int y=3;y<6;y++){
            for (int x=3; x<6;x++){
                
                gbc.gridx =x;
                gbc.gridy=y;
                
            
            contentPane.add(new JButton("Button ("+ x+ ","+y+")"),gbc);
            
        }
    }
    frame.pack();
    frame.setVisible(true);
}}

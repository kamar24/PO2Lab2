/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labgui;


import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Container;


/**
 *
 * @author student
 */
public class Dydaktyka13 {
    
    public static void main(String[] args){
        JFrame frame= new JFrame("BorderLayout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container= frame.getContentPane();
        
        container.add(new JButton("Góra"), BorderLayout.NORTH);
        container.add(new JButton("Dół"), BorderLayout.SOUTH);
        container.add(new JButton("Prawo"), BorderLayout.EAST);
        container.add(new JButton("Lewo"), BorderLayout.WEST);
        container.add(new JButton("Środek"), BorderLayout.CENTER);
   
    frame.pack();
    frame.setVisible(true);
    }
    
}

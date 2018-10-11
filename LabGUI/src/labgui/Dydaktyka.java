/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labgui;

import javax.swing.*;
import java.awt.BorderLayout;

/**
 *
 * @author student
 */
public class Dydaktyka {
    
    public static void main(String[] args){
        JFrame frame= new JFrame("JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton northButton = new JButton("Północ");
        JButton southButton = new JButton("Południe");
        JButton eastButton = new JButton("Wschód");
        JButton westButton = new JButton("Zachód");
        
        buttonPanel.add(northButton, BorderLayout.NORTH);
        buttonPanel.add(southButton, BorderLayout.SOUTH);
        buttonPanel.add(eastButton, BorderLayout.EAST);
        buttonPanel.add(westButton, BorderLayout.WEST);
        
        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    
    }
}

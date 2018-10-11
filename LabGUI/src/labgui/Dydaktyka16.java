/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labgui;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author student
 */
public class Dydaktyka16 {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane= frame.getContentPane();
        contentPane.setLayout(null);
        
        JButton b1= new JButton("Klik 1");
        JButton b2= new JButton("Klik 2");
        
        contentPane.add(b1);
        contentPane.add(b2);
        
        b1.setBounds(10,10,100,50);
        b2.setBounds(120,10,150,40);
        
        frame.setBounds(0,0,350,100);
        frame.setVisible(true);
    }
    
}

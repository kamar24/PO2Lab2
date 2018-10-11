/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labgui;

import java.awt.*;
import javax.swing.*;
/**
 *
 * @author student
 */
public class Dydaktyka14 {
    
    public static void main(String[] args){
        
        JFrame frame = new JFrame("LAJTOŁT");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container contentPane= frame.getContentPane();
        contentPane.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        
        for (int i=1;i<=10;i++){
            contentPane.add(new JButton("Button: "+i));
            
        }
        
        frame.pack();
        frame.setVisible(true);
    
    }
    
}

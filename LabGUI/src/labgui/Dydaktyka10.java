/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labgui;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;
/**
 *
 * @author student
 */
public class Dydaktyka10 extends JPanel{
    
    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        int width= (int) getWidth() /8;
        int height= (int) getHeight() /8;
        int x = 0;
        int y = 0;
        
       g.setColor(Color.black);
       for (int i=0; i<4; i++){
           g.drawRect(x,y,width,height);
           x+= width; y+= height;
           g.fillOval(x,y,width,height);
           x += width; y+=height;
       
       }
    }
    
    public static void main(String[] args){
        JFrame frame= new JFrame("Ranczo");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Dydaktyka10());
        frame.setSize(300,200);
        frame.setVisible(true);
        
        frame.pack();
        frame.setVisible(true);
    }
}

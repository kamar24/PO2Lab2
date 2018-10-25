/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiSwing;

/**
 *
 * @author Lukasz
 */


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Formatkazad10 {
     private JPanel panelmain2;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JButton buttonPanel1Button;
    private JButton buttonPanel2Button;
    private JButton buttonPanel3Button;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;

    public Formatkazad10()
    {

        JFrame frame2 = new JFrame("App");
        frame2.setContentPane(panelmain2);
        frame2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame2.pack();
        frame2.setSize(600,400);
        frame2.setVisible(true);

        //Menu Bar
        JMenuBar mb2 = new JMenuBar();
        frame2.setJMenuBar(mb2);
        JMenu file2 = new JMenu(" Zadanie 10");
        mb2.add(file2);
        JRadioButtonMenuItem panel1b = new JRadioButtonMenuItem("Panel 1");
        JRadioButtonMenuItem panel2b = new JRadioButtonMenuItem("Panel 2");
        JRadioButtonMenuItem panel3b = new JRadioButtonMenuItem("Panel 3");
        file2.add(panel1b);
        file2.add(panel2b);
        file2.add(panel3b);
        mb2.setVisible(true);

        //Radio Button Group
        ButtonGroup b1 = new ButtonGroup();
        b1.add(panel1b);
        b1.add(panel2b);
        b1.add(panel3b);


        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);

        panel1b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(true);
                panel2.setVisible(false);
                panel3.setVisible(false);
            }
        });
        panel2b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(true);
                panel3.setVisible(false);
            }
        });
        panel3b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel1.setVisible(false);
                panel2.setVisible(false);
                panel3.setVisible(true);
            }
        });


    }
}
    


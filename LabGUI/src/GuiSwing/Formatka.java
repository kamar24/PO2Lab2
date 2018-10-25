import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class Formatka {

    private JTabbedPane zad7;
    //Zadanie 1-4
    private JPanel zad14;
    private JTextField zad14textField;
    private JButton zad14add;
    private JButton zad14delbyidbutton;
    private JButton zad14selecteddelbutton;
    private JButton zad14addbyidbutton;
    private JButton zad14delallbutton;
    private JTextField zad14addtextField;
    private JTextField zad14deltextField;
    private JList<String> zad14list;
    private JLabel zad14label;
    private DefaultListModel<String> model;

    //Zadanie 5
    private JPanel zad5;
    private JPanel panelMain;
    private JTextField zad5textField;
    private JButton zad5addbutton;
    private JComboBox<String> comboBox1;
    private JButton zad5addidbutton;
    private JTextField zad5addField;
    private JButton zad5clearbutton;
    private JButton zad5delselectbutton;
    private JButton zad5delbyidbutton;
    private JTextField zad5delField;
    private JLabel zad5Label;

    //Zadanie 6
    private JPanel zad6;
    private JSlider zad6redslider;
    private JSlider zad6greenslider;
    private JSlider zad6blueslider;
    private JLabel zad6redlabel;
    private JLabel zad6greenlabel;
    private JLabel zad6bluelabel;
    private JPanel zad8Panel1;
    private JPanel zad8Panel2;
    private JPanel zad8Panel3;

    //Zadanie 9
    private JPanel zad8;
    private JButton button1;
    private JTextField textField1;
    private JButton button2;
    private JTextField textField2;
    private JButton button3;
    private JTextField textField3;
    private JCheckBox zad8panel1CheckBox;
    private JCheckBox zad8panel2CheckBox;
    private JCheckBox zad8panel3CheckBox;

    //Zadanie 9
    private JPanel zad9;
    private JRadioButton zad9radioButton1;
    private JRadioButton zad9radioButton2;
    private JRadioButton zad9radioButton3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JPanel zad9panel1;
    private JPanel zad9panel2;
    private JPanel zad9panel3;
    private JPanel zad10;
    private JButton button7;
    private JPanel zad10Panel1;

    public Formatka()
    {

        JFrame frame = new JFrame("App");
        frame.setContentPane(panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600,400);
        frame.setVisible(true);


        //Zadanie 1-4
        model = new DefaultListModel<>();
        zad14list.setModel(model);

        zad14add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zad14textField.getText()!=null)
                {
                    model.addElement(zad14textField.getText());
                    zad14textField.setText(null);
                }
            }
        });
        zad14addbyidbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = Integer.parseInt(zad14addtextField.getText());
                model.add(pos-1,zad14textField.getText());
            }
        });
        zad14delallbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.removeAllElements();
            }
        });
        zad14selecteddelbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectid = zad14list.getSelectedIndex();
                model.remove(selectid);
            }
        });
        zad14delbyidbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int pos = Integer.parseInt(zad14deltextField.getText());
                model.removeElementAt(pos-1);
            }
        });
        zad14list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String label = String.valueOf(zad14list.getSelectedValue());
                zad14label.setText(label);
            }
        });


        //Zadanie 5
        zad5addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.addItem(zad5textField.getText());
                zad5textField.setText("");
            }
        });
        zad5addidbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(zad5addField.getText());
                comboBox1.insertItemAt(zad5textField.getText(),id-1);
                zad5textField.setText("");
                zad5addField.setText("");
            }
        });
        zad5clearbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox1.removeAllItems();
            }
        });

        zad5delselectbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = comboBox1.getSelectedIndex();
                comboBox1.removeItemAt(id);

            }
        });
        zad5delbyidbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(zad5delField.getText());
                comboBox1.removeItemAt(id-1);
                zad5delField.setText("");
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                zad5Label.setText(String.valueOf(comboBox1.getSelectedItem()));
            }
        });

        //Zadanie 6
        zad6redslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                zad6redlabel.setText(String.valueOf(zad6redslider.getValue()));
                zad6.setBackground(new Color(zad6redslider.getValue(),zad6greenslider.getValue(),zad6blueslider.getValue()));

            }
        });
        zad6greenslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                zad6greenlabel.setText(String.valueOf(zad6greenslider.getValue()));
                zad6.setBackground(new Color(zad6redslider.getValue(),zad6greenslider.getValue(),zad6blueslider.getValue()));
            }
        });
        zad6blueslider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                zad6bluelabel.setText(String.valueOf(zad6blueslider.getValue()));
                zad6.setBackground(new Color(zad6redslider.getValue(),zad6greenslider.getValue(),zad6blueslider.getValue()));
            }
        });

        //Zadanie 8
        zad8panel1CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zad8panel1CheckBox.isSelected()) zad8Panel1.setVisible(true);
                else zad8Panel1.setVisible(false);
            }
        });
        zad8panel2CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zad8panel2CheckBox.isSelected()) zad8Panel2.setVisible(true);
                else zad8Panel2.setVisible(false);
            }
        });
        zad8panel3CheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (zad8panel3CheckBox.isSelected()) zad8Panel3.setVisible(true);
                else zad8Panel3.setVisible(false);
            }
        });

        //Zadanie 9

        zad9panel1.setVisible(false);
        zad9panel2.setVisible(false);
        zad9panel3.setVisible(false);
        zad9radioButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zad9radioButton1.isSelected())
                {
                    zad9panel1.setVisible(true);
                    zad9panel2.setVisible(false);
                    zad9panel3.setVisible(false);
                }

            }
        });
        zad9radioButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zad9radioButton2.isSelected())
                {
                    zad9panel1.setVisible(false);
                    zad9panel2.setVisible(true);
                    zad9panel3.setVisible(false);
                }

            }
        });

        zad9radioButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(zad9radioButton3.isSelected())
                {
                    zad9panel1.setVisible(false);
                    zad9panel2.setVisible(false);
                    zad9panel3.setVisible(true);
                }

            }
        });


        zad10.addComponentListener(new ComponentAdapter() {
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Formatkazad10();
            }
        });
    }

    public static void main(String[] args) {
        new Formatka();




    }


}
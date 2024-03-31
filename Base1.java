package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Base1 extends JFrame {
    private Container c;
    private JLabel imgL,L1,L2,L3,caption;
    private JTextField tf;
    private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,cal,clr;
    private JTextArea ta;
    private ImageIcon img;
    
    private String input,output="";
    private int dec=-1;
    
    Base1()
    {
        c=this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);
        
        img=new ImageIcon("binary.jpg");
        imgL=new JLabel(img);
        imgL.setBounds(95,10,img.getIconWidth(),img.getIconHeight());
        c.add(imgL);
        
        caption=new JLabel();
        caption.setText("Base Converter");
        caption.setBounds(150,200,100,40);
        c.add(caption);
        
        L1=new JLabel();
        L1.setText("Enter Number:");
        L1.setBounds(45,250,100,40);
        c.add(L1);
        
        tf=new JTextField();
        tf.setBounds(150,250,150,40);
        c.add(tf);
        
        L2=new JLabel();
        L2.setText("From Base");
        L2.setBounds(45,300,100,40);
        c.add(L2);
        
        btn1=new JButton();
        btn1.setText("Dec");
        btn1.setBounds(150,300,70,40);
        c.add(btn1);
        
        btn2=new JButton();
        btn2.setText("Bin");
        btn2.setBounds(230,300,70,40);
        c.add(btn2);
        
        btn3=new JButton();
        btn3.setText("Oct");
        btn3.setBounds(310,300,70,40);
        c.add(btn3);
        
        btn4=new JButton();
        btn4.setText("Hex");
        btn4.setBounds(390,300,70,40);
        c.add(btn4);
        
        L3=new JLabel();
        L3.setText("To Base");
        L3.setBounds(45,350,100,40);
        c.add(L3);
        
        btn5=new JButton();
        btn5.setText("Dec");
        btn5.setBounds(150,350,70,40);
        c.add(btn5);
        
        btn6=new JButton();
        btn6.setText("Bin");
        btn6.setBounds(230,350,70,40);
        c.add(btn6);
        
        btn7=new JButton();
        btn7.setText("Oct");
        btn7.setBounds(310,350,70,40);
        c.add(btn7);
        
        btn8=new JButton();
        btn8.setText("Hex");
        btn8.setBounds(390,350,70,40);
        c.add(btn8);
        
        cal=new JButton();
        cal.setText("Convert");
        cal.setBounds(150,400,150,40);
        c.add(cal);
        clr=new JButton();
        clr.setText("Clear");
        clr.setBounds(310,400,150,40);
        c.add(clr);
        
        ta=new JTextArea();
        ta.setBounds(150,450,310,100);
        c.add(ta);
        
        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input=tf.getText();
                if(input.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please, Enter a number first.");
                }
                else
                {
                    dec=Integer.parseInt(input);
                }
                
            }
        });
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input=tf.getText();
                if(input.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please, Enter a number first.");
                }
                else
                {
                    dec=Integer.parseInt(input,2);
                }
            }
        });
        btn3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input=tf.getText();
                if(input.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please, Enter a number first.");
                }
                else
                {
                    dec=Integer.parseInt(input,8);
                }
            }
        });
        btn4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                input=tf.getText();
                if(input.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Please, Enter a number first.");
                }
                else
                {
                    dec=Integer.parseInt(input,16);
                }
            }
        });
        
        
        btn5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dec==-1) JOptionPane.showMessageDialog(null, "Please, select From Base.");
                else
                {
                    output=Integer.toString(dec);
                    ta.setText("Decimal Representation:");
                }
            }
        });
        btn6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dec==-1) JOptionPane.showMessageDialog(null, "Please, select From Base.");
                else
                {
                    output=Integer.toBinaryString(dec);
                    ta.setText("Binary Representation:");
                }
            }
        });
        btn7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dec==-1) JOptionPane.showMessageDialog(null, "Please, select From Base.");
                else
                {
                    output=Integer.toOctalString(dec);
                    ta.setText("Octal Representation:");
                }
            }
        });
        btn8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(dec==-1) JOptionPane.showMessageDialog(null, "Please, select From Base.");
                else
                {
                    output=Integer.toHexString(dec);
                    ta.setText("Hexidacimal Representation:");
                }
            }
        });
        
        
        clr.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                ta.setText("");
            }
        });
        cal.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(output.isEmpty()) JOptionPane.showMessageDialog(null, "Incomplete Command");
                else ta.append(output);
            }
        });
    }
    public static void main(String[] args) {
        Base1 fr=new Base1();
        fr.setVisible(true);  
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        fr.setBounds(300,20,500,600);
        fr.setTitle("Base Converter");
    }
}

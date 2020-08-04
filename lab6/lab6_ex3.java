import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.io.*;
import java.io.IOException;

public class lab6_ex3 extends JPanel {
    private JButton bto_login;
    private JLabel cakeorder;
    private JLabel line;
    private JLabel cakemenu;
    private JLabel jcomp5;
    private JLabel jcomp6;
    private JLabel item1;
    private JLabel item2;
    private JLabel item3;
    private JLabel price;
    private JLabel price1;
    private JLabel price2;
    private JLabel price3;
    private JLabel detail;
    private JLabel line_1;
    private JLabel topping;
    private JLabel topp1;
    private JLabel topp2;
    private JLabel jcomp19;
    private JLabel line_2;
    private JLabel total;
    
   
    public lab6_ex3() {
        //construct components
        bto_login = new JButton ("OK");
        cakeorder = new JLabel ("Cake Order");
        line = new JLabel ("-------------------------------------------");
        cakemenu = new JLabel ("Cake Menu");
        jcomp5 = new JLabel ("-------------------------------------------");
        jcomp6 = new JLabel ("Black forest Cake with available toppings:");
        item1 = new JLabel ("[1] Chocolate");
        item2 = new JLabel ("[2] Cherries");
        item3 = new JLabel ("[3] whipped Cream");
        price = new JLabel ("Price:");
        price1 = new JLabel ("[1] Small : RM 45");
        price2 = new JLabel ("[2] Medium : RM 65");
        price3 = new JLabel ("[3] Big : RM 80");
        detail = new JLabel ("Order detail:");
        line_1 = new JLabel ("------------------------------------------------------------");
        topping = new JLabel ("Toppings:");
        topp1 = new JLabel ("[1] Chocolate");
        topp2 = new JLabel ("[2] Cherries");
        jcomp19 = new JLabel ("size:     medium");
        line_2 = new JLabel ("-------------------------------------------------------------");
        total = new JLabel ("Total Price : RM 85");

        //adjust size and set layout
        setPreferredSize (new Dimension (664, 360));
        setLayout (null);

        //add components
        add (bto_login);
        add (cakeorder);
        add (line);
        add (cakemenu);
        add (jcomp5);
        add (jcomp6);
        add (item1);
        add (item2);
        add (item3);
        add (price);
        add (price1);
        add (price2);
        add (price3);
        add (detail);
        add (line_1);
        add (topping);
        add (topp1);
        add (topp2);
        add (jcomp19);
        add (line_2);
        add (total);

        //set component bounds (only needed by Absolute Positioning)
        bto_login.setBounds (525, 305, 100, 20);
        cakeorder.setBounds (260, 0, 100, 25);
        line.setBounds (210, 20, 190, 25);
        cakemenu.setBounds (260, 40, 100, 25);
        jcomp5.setBounds (210, 45, 220, 30);
        jcomp6.setBounds (185, 65, 260, 30);
        item1.setBounds (205, 90, 100, 25);
        item2.setBounds (205, 110, 100, 25);
        item3.setBounds (205, 130, 120, 25);
        price.setBounds (180, 145, 100, 25);
        price1.setBounds (205, 165, 100, 25);
        price2.setBounds (205, 180, 115, 25);
        price3.setBounds (205, 195, 100, 25);
        detail.setBounds (175, 215, 100, 25);
        line_1.setBounds (175, 220, 275, 30);
        topping.setBounds (175, 235, 100, 25);
        topp1.setBounds (245, 235, 100, 25);
        topp2.setBounds (245, 255, 100, 25);
        jcomp19.setBounds (175, 275, 100, 25);
        line_2.setBounds (175, 285, 260, 20);
        total.setBounds (175, 300, 165, 20);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Cake Order");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new lab6_ex3());
        frame.pack();
        frame.setVisible (true);
    }
}
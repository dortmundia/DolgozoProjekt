package com.company;

import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.NumberFormat;
import java.util.Map;
import java.util.TreeMap;

public class Dolgozok extends  JFrame  implements ActionListener {



    Feladatok f;

    JPanel panel;
    JButton btnF2,btnF3, btnF4, btnF5,btnF6,btnF7,btnF8;
    JLabel labelF3, labelF4, labelF5, labelF6A,labelF6B,labelF7;
    JTextField bevitel;

    Container container; //https://www.tutorialspoint.com/how-can-we-make-jtextfield-accept-only-numbers-in-java




    public Dolgozok()
    {
        init();
        liseners();
        f= new Feladatok();
    }

    private void liseners() {

    }

    private void init() {
        container = getContentPane();

        this.setTitle("Dolgozok");
        this.setSize(1200,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel= (JPanel)(this.getContentPane());
        this.setLayout(null);


        btnF2= new JButton("Beolvasás");
        btnF2.setBounds(40,40, 130,30);

        btnF3= new JButton("Feladat 3 ");
        btnF3.setBounds(40,90, 130,30);

        btnF4= new JButton("Feladat 4");
        btnF4.setBounds(40,140, 130,30);

        btnF5= new JButton("Feladat 5");
        btnF5.setBounds(40,190, 130,30);

        btnF6= new JButton("Feladat 6");
        btnF6.setBounds(40,240, 130,30);

        btnF7= new JButton("Feladat 7");
        btnF7.setBounds(40,340, 130,30);

        btnF8= new JButton("Feladat 8");
        btnF8.setBounds(40,390, 130,30);




        labelF3= new JLabel();
        labelF3.setBounds(180,90,350,25);


        labelF4= new JLabel();
        labelF4.setBounds(180,140,350,25);


        labelF5 = new JLabel();
        labelF5.setBounds(180,190,750,25);


        btnF3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelF3.setText("3. feladat: Dolgozók száma: "+f.F3());
            }
        });


        btnF4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelF4.setText("4. feladat: 25 év alattiak összfizetése: "+f.F4()+" Ft");
            }
        });


        btnF5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelF5.setText("5. feladat: A legnagyobb fizetésű dolgozó adatai: "+f.F5());
            }
        });


        labelF6A = new JLabel();
        labelF6A.setBounds(180,240,750,25);
        labelF6A.setText("6. feladat: Kérem adjon meg egy összeget:");

        labelF6B = new JLabel();
        labelF6B.setBounds(180,290,750,25);

        bevitel= new JTextField();
        bevitel.setBounds(450,240,130,30);

        btnF6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelF6B.setText(f.F6( Integer.parseInt(bevitel.getText()) ));
            }
        });


        bevitel.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent ke) {
                String value = bevitel.getText();
                int l = value.length();
                if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9') {
                    bevitel.setEditable(true);
                } else {
                    bevitel.setEditable(true);
                    JOptionPane.showMessageDialog(null,"“Nem számot adott meg, kérem számot adjon meg!");
                    bevitel.setText("");
                }
            }
        });



        labelF7 = new JLabel();
        labelF7.setBounds(180,340,1000,25);


        btnF7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelF7.setText(f.F7());
            }
        });

        btnF8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (f.F8())
                {JOptionPane.showMessageDialog(null,"Kész a diakok.txt");}
                else{JOptionPane.showMessageDialog(null,"Nem sikerült elkésziteni a diakok.txt-t!");}
            }
        });

        // panel.add(btnF2);
        panel.add(bevitel);
        panel.add(btnF3);
        panel.add(btnF4);
        panel.add(btnF5);
        panel.add(btnF6);
        panel.add(btnF7);
        panel.add(btnF8);
        panel.add(labelF3);
        panel.add(labelF4);
        panel.add(labelF5);
        panel.add(labelF6A);
        panel.add(labelF6B);
        panel.add(labelF7);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

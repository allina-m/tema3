
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyFrame
        extends JFrame
        implements ActionListener {

    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel age;
    private JTextField tage;
    private JLabel lName;
    private JTextField tlName;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton other;
    private ButtonGroup gengp;
    private JLabel add;

    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JLabel refactor;

    public MyFrame() {
        setTitle("Registration Form");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("First Name");
        name.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        name.setSize(100, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(200, 100);
        c.add(tname);

        age = new JLabel("Age");
        age.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        age.setSize(100, 20);
        age.setLocation(100, 200);
        c.add(age);

        tage = new JTextField();
        tage.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tage.setSize(150, 20);
        tage.setLocation(200, 200);
        c.add(tage);

        lName = new JLabel("Last Name");
        lName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        lName.setSize(100, 20);
        lName.setLocation(100, 150);
        c.add(lName);

        tlName = new JTextField();
        tlName.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tlName.setSize(190, 20);
        tlName.setLocation(200, 150);
        c.add(tlName);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        gender.setSize(100, 20);
        gender.setLocation(100, 250);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(200, 250);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(275, 250);
        c.add(female);

        other = new JRadioButton("Other");
        other.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        other.setSelected(false);
        other.setSize(85, 20);
        other.setLocation(365, 250);
        c.add(other);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);
        gengp.add(other);

        add = new JLabel("Address");
        add.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add.setSize(100, 20);
        add.setLocation(100, 350);
        c.add(add);

        tadd = new JTextArea();
        tadd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        tadd.setSize(200, 75);
        tadd.setLocation(200, 350);
        tadd.setLineWrap(true);
        c.add(tadd);

        term = new JCheckBox("Maried?");
        term.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(150, 300);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        sub.setSize(100, 20);
        sub.setLocation(150, 450);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Reset");
        reset.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        reset.setSize(100, 20);
        reset.setLocation(270, 450);
        reset.addActionListener(this);
        c.add(reset);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sub) {

            String data1;
            String data2;
            if (male.isSelected()) {
                data1 = "Gender : Male"
                        + "\n";
            } else if (female.isSelected()) {
                data1 = "Gender : Female"
                        + "\n";
            } else
                data1 = "Gender : Other"
                        + "\n";
            if (term.isSelected()) {
                data2 = "Maried: yes";
            } else
                data2 = "Maried: no";
            c.removeAll();
            c.revalidate();
            c.repaint();

            refactor = new JLabel("First Name: "+tname.getText());
            refactor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            refactor.setSize(500, 20);
            refactor.setLocation(100, 100);
            c.add(refactor);

            refactor = new JLabel("Last Name: "+tlName.getText());
            refactor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            refactor.setSize(500, 20);
            refactor.setLocation(100, 150);
            c.add(refactor);

            refactor = new JLabel("Age: "+tage.getText());
            refactor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            refactor.setSize(500, 20);
            refactor.setLocation(100, 200);
            c.add(refactor);

            refactor = new JLabel(data1);
            refactor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            refactor.setSize(500, 20);
            refactor.setLocation(100, 250);
            c.add(refactor);

            refactor = new JLabel(data2);
            refactor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            refactor.setSize(500, 20);
            refactor.setLocation(100, 300);
            c.add(refactor);

            refactor = new JLabel("Address: "+tadd.getText());
            refactor.setFont(new Font("Times New Roman", Font.PLAIN, 20));
            refactor.setSize(1500, 20);
            refactor.setLocation(100, 350);
            c.add(refactor);

        } else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
            tadd.setText(def);
            tlName.setText(def);
            term.setSelected(false);
            tage.setText(def);
        }
    }
}

class Registration {

    public static void main(String[] args) throws Exception {
        MyFrame f = new MyFrame();
    }
}

package com.HeadFirst.Chapter2;

import javax.swing.JButton;
import javax.swing.JFrame;

public class test extends JFrame{
    private static final long serialVersionUID = -6918033826886164234L;


    public test() {
        super();
        this.getContentPane().add(new JButton("测试"));
        this.setBounds(100, 100, 100, 100);
    }


    public static void main(String[] args) {
        new test().setVisible(true);
    }
}
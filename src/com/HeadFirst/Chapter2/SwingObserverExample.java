package com.HeadFirst.Chapter2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {
    //一个小小的Swing实现的栗子，JavaBeans 和 Swing中都实现了观察者模式
    //建立一个JFrame 然后放一个按钮

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go(){
        frame = new JFrame();
        JButton button = new JButton("Should I do it?");

        button.addActionListener(new AngelListener());//两个倾听者，一个天使，一个恶魔
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        // 在这里设置frame属性
    }


    class AngelListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Don't do it, you might regret it!");
        }

    }

    class DevilListener implements  ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Come on, Do it!");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class EjJTabbedPane extends JFrame {
    
    JPanel panel1, panel2, panel12, panel22;
    JLabel primera, segunda;
    JButton boton12;
    JTabbedPane tabbedPane;
    
    public EjJTabbedPane() {
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel12 = new JPanel();
        panel22 = new JPanel();
        boton12 = new JButton("Boton12");
                
        primera = new JLabel("Primera");
        segunda = new JLabel("Segunda");
        tabbedPane = new JTabbedPane();
        
        panel1.add(panel12);
        panel1.setBackground(Color.red);
        panel12.setBackground(null);
        panel12.setLayout(new BorderLayout(15, 15));
        
        panel12.add(primera, BorderLayout.NORTH);//aqui podrias meter otro panel con cosas
        panel12.add(boton12, BorderLayout.CENTER);
        panel2.add(segunda);
        
        tabbedPane.add("Primer panel", panel1);
        tabbedPane.add("Segundo panel", panel2);
        
        add(tabbedPane);
        setSize(400, 400);
    }
    
    
    
}
 
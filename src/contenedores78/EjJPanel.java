/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Gamero
 */
public class EjJPanel extends JFrame {
    
    JLabel etiquetaN, etiquetaCI, etiquetaCD;
    JButton boton1, boton2, botonV;
    JPanel panelN, panelC, panelS, panelCI, panelCD, panelDV;
    
    public EjJPanel() {
        Container cpane = getContentPane();
        
        panelN = new JPanel();
        panelC = new JPanel();
        panelCI = new JPanel();
        panelCI.setBackground(Color.red);
        panelCD = new JPanel();
        panelCD.setBackground(Color.green);
        panelS = new JPanel();
        panelDV = new JPanel();
        botonV = new JButton("Boton");
        boton1 = new JButton("Mostrar verde");
        boton2 = new JButton("Ocultar verde");
        etiquetaN = new JLabel("Ej JPanel");
        etiquetaCI = new JLabel("Panel rojo");
        etiquetaCD = new JLabel("Panel Verde");
        
        
        panelN.add(etiquetaN);
        
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        
        panelC.add(Box.createHorizontalStrut(30));
        panelC.add(panelCI);
        panelC.add(Box.createHorizontalStrut(40));
        panelC.add(panelCD);
        panelC.add(Box.createHorizontalStrut(30));
        panelCI.add(etiquetaCI);
        panelCD.add(etiquetaCD);
        
        
        panelS.setLayout(new BoxLayout(panelS, BoxLayout.Y_AXIS));
        panelS.add(Box.createHorizontalStrut(20));
        panelS.add(Box.createVerticalStrut(5));
        panelS.add(boton1);
        panelS.add(Box.createVerticalStrut(5));
        panelS.add(boton2);
        panelS.add(Box.createVerticalStrut(5));
        
        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCD.setVisible(true);
            }
        });
        
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelCD.setVisible(false);
            }
        });
        
        cpane.add(panelN, BorderLayout.NORTH);
        cpane.add(panelC, BorderLayout.CENTER);
        cpane.add(panelS, BorderLayout.SOUTH);
        
        pack();
        setSize(400, 300);
        
    }
    
}

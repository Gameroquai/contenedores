/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
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
    JButton boton1, boton2;
    JPanel panelN, panelC, panelS, panelCI, panelCD;
    
    public EjJPanel() {
        Container cpane = getContentPane();
        
        panelN = new JPanel();
        panelC = new JPanel();
        panelCI = new JPanel();
        panelCI.setBackground(Color.red);
        panelCD = new JPanel();
        panelCD.setBackground(Color.green);
        panelS = new JPanel();
        boton1 = new JButton("Mostrar verde");
        boton2 = new JButton("Ocultar verde");
        etiquetaN = new JLabel("tu vieja");
        etiquetaCI = new JLabel("Panel rojo");
        etiquetaCD = new JLabel("Panel Verde");
        
        
        panelN.add(etiquetaN);
        
        panelC.setLayout(new BoxLayout(panelC, BoxLayout.X_AXIS));
        
        panelC.add(panelCI);
        panelC.add(panelCD);
        panelCI.add(etiquetaCI);
        panelCD.add(etiquetaCD);
        
        panelS.setLayout(new BoxLayout(panelS, BoxLayout.Y_AXIS));
        panelS.add(boton1);
        panelS.add(boton2);
        
        
        cpane.add(panelN, BorderLayout.NORTH);
        cpane.add(panelC, BorderLayout.CENTER);
        cpane.add(panelS, BorderLayout.SOUTH);
        
        pack();
        setSize(400, 300);
        
    }
    
}

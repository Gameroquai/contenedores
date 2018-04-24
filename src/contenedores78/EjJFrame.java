/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Gamero
 */
public class EjJFrame extends JFrame{
    
    JLabel etiqueta;
    JTextArea texto;

    public EjJFrame(){
        
        Container cpane = getContentPane();
        etiqueta = new JLabel("Contenedor JFrame");
        texto = new JTextArea("Ejemplo de JFrame tacatá", 10, 30);
        
        JPanel panelN, panelC;
        
        panelN = new JPanel();
        etiqueta = new JLabel("Contenedor JFrame");
        panelN.add(etiqueta);
        panelC = new JPanel();
        texto = new JTextArea("Ejemplo de JFrame tacatá", 8, 30);
        panelC.add(texto);
        
        cpane.add(panelN, BorderLayout.NORTH);
        cpane.add(panelC, BorderLayout.CENTER);
        
        pack();
        
        setTitle("Morcillitas");
        setSize(400, 250);
        
        
        setLocationRelativeTo(null);
    }
    
    
    
    
}

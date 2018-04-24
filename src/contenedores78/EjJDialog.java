/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.HeadlessException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;



public class EjJDialog extends JDialog {
    
    JLabel etiqueta;
    JTextArea texto;
    
    public EjJDialog(JFrame ventanaPrincipal, boolean modal){
        
        super(ventanaPrincipal, modal);
        Container cpane = getContentPane();
        etiqueta = new JLabel("Contenedor JDialog");
        texto = new JTextArea("Ejemplo de JDialog tacatá", 10, 30);
        
        JPanel panelN, panelC;
        
        panelN = new JPanel();
        etiqueta = new JLabel("Contenedor JDialog");
        panelN.add(etiqueta);
        panelC = new JPanel();
        texto = new JTextArea("Ejemplo de JDialog tacatá", 8, 30);
        panelC.add(texto);
        
        cpane.add(panelN, BorderLayout.NORTH);
        cpane.add(panelC, BorderLayout.CENTER);
        
        pack();
        
        setTitle("Morcillitas");
        setSize(400, 250);
        
        
        setLocationRelativeTo(null);
    }
    
}

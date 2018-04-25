/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;



public class EjJScrollPane extends JFrame {
    
    JLabel etiqueta;
    JTextArea texto;

    public EjJScrollPane() {
        
        etiqueta = new JLabel("Ejemplo Scroll");
        texto = new JTextArea("Hola pedazo de cabron\nComo estas?\nCompra pan bimbo y espero que te rompas las piernas\n..\n..\n..");
        JPanel panel = new JPanel(new BorderLayout());
        JScrollPane panelS = new JScrollPane(texto, 
                                JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
                                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        panel.add(etiqueta, BorderLayout.NORTH);
        panel.add(panelS, BorderLayout.CENTER);
        add(panel, BorderLayout.CENTER);
        
        pack();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

/**
 *
 * @author Gamero
 */
public class EjJSplitPane extends JFrame {

    public EjJSplitPane(String title, boolean continuo, int orientacion, boolean flechas) {
        JLabel etiqueta1 = new JLabel("panel 1");
        JLabel etiqueta2 = new JLabel("panel 2");
        
        JSplitPane panelSp = new JSplitPane(orientacion, continuo, etiqueta1, etiqueta2);
        panelSp.setOneTouchExpandable(flechas);
        
        add(panelSp, BorderLayout.CENTER);
    }

        
}

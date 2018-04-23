/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contenedores78;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout.Constraints;

/**
 *
 * @author Gamero
 */
public class Contenedores78 extends JFrame implements ActionListener{

    JButton frame;
    
    public static void main(String[] args) {
        Contenedores78 miVentana = new Contenedores78("Probando contenedores");
        miVentana.setBounds(300, 300, 800, 300);
        miVentana.setVisible(true);
        miVentana.setDefaultCloseOperation(EXIT_ON_CLOSE);//como la clase hereda JFrame no hace falta poner JFrame.EXIT...
    }

    public Contenedores78(String title) throws HeadlessException {
        super(title);
        
        Container cpane = this.getContentPane();
        
        JPanel norte = new JPanel();
        JPanel centro = new JPanel(new GridLayout(2,3,30,30));
        JPanel sur = new JPanel();
        
        //panel norte-----------------------------------------------------------
        cpane.add(norte, BorderLayout.NORTH);
        
        JLabel etiqueta = new JLabel("     CONTENEDORES JAVA SWING     ");
        norte.add(etiqueta);
        etiqueta.setFont(new Font("Calibri", Font.ITALIC, 30));
        etiqueta.setBorder(BorderFactory.createLoweredBevelBorder());
        
        //panel centro----------------------------------------------------------
        
        cpane.add(centro, BorderLayout.CENTER);
        //Constraints coord = new Constraints();
        
        
        frame = new JButton(" Ejemplo JFrame ");//lo hemos hecho global para poder hacer el boton==frame
        frame.setName("frame");
        frame.addActionListener(this);
        JButton dialog = new JButton(" Ejemplo JDialog ");
        JButton panel = new JButton(" Ejemplo JPanel ");
        JButton scrollP = new JButton(" Ejemplo JScrollPane ");
        JButton splitP = new JButton(" Ejemplo JSplitPane ");
        JButton tabbedP = new JButton(" Ejemplo JTabbedPane ");
        
                
        centro.add(frame);
        centro.add(dialog);
        centro.add(panel);
        centro.add(scrollP);
        centro.add(splitP);
        centro.add(tabbedP);
        
                
        //panel sur-------------------------------------------------------------
        
        cpane.add(sur, BorderLayout.SOUTH);
        
        JButton desktop = new JButton(" Ejemplo JDeskTopPane ");
        JButton toolBar = new JButton(" Ejemplo JToolBar ");
        
        sur.add(desktop);
        sur.add(toolBar);
    }//Constructor--------------------------------------------------------------

    @Override
    public void actionPerformed(ActionEvent e) {
        String textoB = e.getActionCommand();//Estos 2 lo que hacen es devolver el texto del boton o el objeto del boton
        JButton boton = (JButton)e.getSource();
        System.out.println(frame.getText());
        
        /*if(boton==frame){
            
        }*/
        
        switch(boton.getName()){
            case "frame":
                EjJFrame ventana = new EjJFrame();
                ventana.setVisible(true);
                break;
            
        }
    }
    
    
}

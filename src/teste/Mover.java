/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javafx.scene.layout.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author fernandaerika
 */
public class Mover extends JFrame implements MouseMotionListener {

    ImageIcon img_busca = new ImageIcon("/Z/fernandaerika/NetBeansProjects/CimageoProject/src/cimageoProject/img/adicionar1.png");
    JButton button = new JButton(img_busca);

    JPanel painel = new JPanel();
    
   
    
    public Mover() {
        
        setSize(200, 200);
        setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.RIGHT));

        

        painel.setPreferredSize(new Dimension(60, 60));
        painel.setLayout(new BorderLayout());
        button.setPreferredSize(new Dimension(40,40));
        button.setToolTipText("Adicionar manualmente");
//        painel.setBackground(Color.red);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER));
        painel.add(button);
        add(painel);
        button.addActionListener(
               new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                 System.out.println("asdfasdfdsfsdfsdfsdf");
            }
            }); 
        button.addMouseMotionListener(this);

    }

    public static void main(String args[]) {
        new Mover();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (e.getModifiersEx()== MouseEvent.BUTTON1_DOWN_MASK) {
            painel.setLocation(e.getPoint());
            painel.repaint();
            
            

        }
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

}


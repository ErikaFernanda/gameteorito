/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author fernandaerika
 */
public class img extends JPanel implements MouseMotionListener {

    
    
    ImageIcon img_busca = new ImageIcon("/Z/fernandaerika/NetBeansProjects/CimageoProject/src/cimageoProject/img/adicionar1.png");
        JButton l = new JButton(img_busca);
        
       JPanel painel = new JPanel();
      
        

    public img() {
        painel.setSize(450,450);
        l.setSize(22,22);
        l.setToolTipText("Adicionar manualmente");
        painel.setBackground(Color.red);
        painel.add(l);
        add(painel);
        l.addActionListener(
                new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e
                    ) {
                        System.out.println("asdfasdfdsfsdfsdfsdf");
                        

                    }
                }
        );
        addMouseMotionListener(this);
    }

  
    
    public void mouseDragged(MouseEvent e) {
        if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
            painel.setLocation(e.getPoint());
            painel.repaint();

        }
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }

}

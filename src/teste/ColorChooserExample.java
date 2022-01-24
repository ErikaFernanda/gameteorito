package teste;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class ColorChooserExample extends JFrame {

    JButton b;
    Container c;

    ColorChooserExample() {
        c = getContentPane();
        c.setLayout(new FlowLayout());
        b = new JButton("color");
        c.add(b);
        b.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                Color initialcolor = Color.RED;
                Color color = JColorChooser.showDialog(null, "Select a color", initialcolor);
                c.setBackground(color);
                System.out.println(color.getRGB());

            }
        });
        
    }

    public static void main(String[] args) {
        ColorChooserExample ch = new ColorChooserExample();
        ch.setSize(400, 400);
        ch.setVisible(true);
        ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

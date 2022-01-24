package teste;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Jogo extends JFrame {

    JLabel a = new JLabel(new ImageIcon(getClass().getResource("film.png")));
    JLabel b = new JLabel(new ImageIcon(getClass().getResource("menu.png")));
    JLabel c = new JLabel(new ImageIcon(getClass().getResource("busca.png")));

    public Jogo() {
        editar();
        new Movimento().start();
    }

    public void editar() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setLayout(null);
        a.setBounds(0, 0, 200, 00);
        b.setBounds(0, 100, 200, 100);
        c.setBounds(0, 200, 200, 100);
        add(a);
        add(b);
        add(c);
    }

    public class Movimento extends Thread {

        public void run() {
            while (true) {
                
                try {
                    sleep(30);
                } catch (Exception erro) {

                }
                if(a.getX()<350){
                    a.setBounds(a.getX()+3,0,200,100);
                }else{
                    a.setBounds(0, 0, 200, 00);
                }
                
                if(b.getX()<350){
                     b.setBounds(b.getX()+2,100,200,100);
                }
                else{
                    b.setBounds(0, 100, 200, 100);
                }
                if(c.getX()<350){
                    c.setBounds(c.getX()+5,200,200,100);
                }
                else{
                    c.setBounds(0, 200, 200, 100);
                }
              
                
                
            }
        }
    }

    public static void main(String[] args) {
        new Jogo();
    }
}

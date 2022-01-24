/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author fernandaerika
 */
public class Janela extends JFrame {

    int x = 0;
    int y = 0;

    int x1 = 0;
    int x2 = 0;
    int y1 = 0;

    int ptn = 0;

    int velocidade = 10;
    Random gerador = new Random();

    ImageIcon nave = new ImageIcon(getClass().getResource("astro.png"));
    ImageIcon fundo = new ImageIcon(getClass().getResource("fundo2.jpg"));
    ImageIcon met = new ImageIcon(getClass().getResource("meteoro.png"));

    JLabel Nave = new JLabel(nave);
    JLabel Fundo = new JLabel(fundo);
    JLabel Meteoro = new JLabel(met);
    JLabel Pontos = new JLabel();

    // JLabel Fundo2 = new JLabel(fundo);
    public Janela() {
        new Movimento().start();
    }

    public void Control() {
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 37) {
                    x = x - 10;

                }

                if (e.getKeyCode() == 39) {
                    x = x + 10;

                }

                if (e.getKeyCode() == 38) {
                    y = y - 10;

                }

                if (e.getKeyCode() == 40) {
                    y = y + 10;

                }
                Nave.setBounds(x, y, 200, 300);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public void sorteio() {

        y1 = gerador.nextInt((120 - (-130)) + 1) + (-130);
        System.out.println(y1 + " Novo sorteio y ");
        x2 = gerador.nextInt((120 - (-130)) + 1) + (-130);
        System.out.println(y1 + " Novo sorteio x");

    }

    public class Movimento extends Thread {

        public void run() {

            sorteio();
            while (true) {

                x1 = x1 - 1;
                y1 = y1 + 1;
                x2 = x2 - 1;

                Pontos.setText(ptn + " Pontos");
                try {

                    sleep(velocidade);

                } catch (Exception erro) {

                }
                if (Fundo.getX() == Fundo.getX()) {
                    Fundo.setBounds(x1, 0, 900, 500);
                    Meteoro.setBounds(x2, y1, 200, 300);
                    if (x1 < -400) {
                        x1 = 0;
                        ptn = ptn + 18;
                        Fundo.setBounds(x1, 0, 900, 500);
                        sorteio();

                    }
                }

            }
        }
    }

    public void painel() {
        Fundo.setBounds(0, 100, 900, 500);
        Nave.setBounds(0, 100, 200, 300);
        Pontos.setBounds(300, -120, 200, 300);
        Pontos.setForeground(Color.white);

        add(Pontos);
        add(Nave);
        add(Meteoro);
        add(Fundo);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 500);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.painel();
        janela.Control();

    }

}

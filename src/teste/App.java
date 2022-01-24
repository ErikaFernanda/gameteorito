package teste;

import java.awt.*;
import java.awt.event.*;

public class App extends Frame implements WindowListener {

    TextArea log = new TextArea("", 5, 20, TextArea.SCROLLBARS_VERTICAL_ONLY);

    public static void main(String[] args) {
        App myWindow = new App("Window event log");
        myWindow.setSize(200, 150);
        myWindow.setVisible(true);
    }

    public App(String title) {
        super(title);
        setLayout(new BorderLayout());
        addWindowListener(this);
        log.setEditable(false);
        add(log);
    }

    public void windowOpened(WindowEvent e) {
        log.append("Opened" + " ");
    }

    public void windowActivated(WindowEvent e) {
        log.append("Activated" + " ");
    }

    public void windowIconified(WindowEvent e) {
        log.append("Iconified" + " ");
    }

    public void windowDeiconified(WindowEvent e) {
        log.append("Deiconified" + " ");
    }

    public void windowDeactivated(WindowEvent e) {
        log.append("Deactivated" + " ");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Closing");
        dispose();
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Closed");
        System.exit(0);
    }
}

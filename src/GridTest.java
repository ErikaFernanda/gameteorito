import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class GridTest extends JFrame{

   

    public GridTest(){
        setSize(640,480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        
        getContentPane().addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e){
                Component c = (Component) e.getSource();
//                System.out.println("X : "+c.getWidth() + "| Y :"+c.getHeight());
                
            }
        });
    }
    
    public static void main  (String[] args){
        new GridTest();
        
    }

   

    
}
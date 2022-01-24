package teste;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.stage.Stage;

import java.time.LocalDate;
import javafx.embed.swing.JFXPanel;
import javax.swing.JFrame;

public class PickerDemo extends Application {

    @Override
    public void start(Stage stage) {
        DatePicker datePicker = new DatePicker(LocalDate.now());

        stage.setScene(new Scene(datePicker));
        stage.show();

    }

    public static void main(String[] args) {
//        launch(args);
        JFrame jf = new JFrame();
        DatePicker datePicker = new DatePicker(LocalDate.now());
         JFXPanel fxPanel = new JFXPanel();
         fxPanel.setScene(new Scene(datePicker));
        jf.add(fxPanel);
        jf.setVisible(true);

    }
}

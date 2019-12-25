import java.applet.Applet;
import java.awt.*;

public class Main extends Applet {
    public static void main(String[] args) {
        Reader med = new Reader("Оформление книги в электронной библиотеке", Color.BLUE);
        med.setVisible(true);
        med.setResizable(false);
        med.setLocationRelativeTo(null);
    }
}

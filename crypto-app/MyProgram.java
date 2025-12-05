
    import javax.swing.JFrame;
    import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
import javax.swing.JPanel;

    public class MyProgram{
        public static void main(String[] args) {
            JFrame frame = new JFrame("My First Swing GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 300); 
            frame.setVisible(true); 

            JPanel panel = new JPanel();
            frame.add(panel);
        }
    }



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GUI {
    JFrame frame;

    public GUI() {
        frame = new JFrame("Gestione Magazzino");
        JPanel panel = new JPanel();
        JButton showCustomer = new JButton("Registro Clienti");
        
        JButton showSupplier = new JButton("Registro Fornitore");
       
        
        
        
        frame.add(panel);

        panel.add(showCustomer);
        panel.add(showSupplier);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
    }



    private void display() {
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.display();
    }
}

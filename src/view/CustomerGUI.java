package src.view;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CustomerGUI {
    JFrame frame;
    JPanel panel;
    JButton addCustomer;
    JButton removeCustomer;
    JButton showCustomer;
    JButton showAllCustomer;
    JButton back;

    public CustomerGUI() {
        frame = new JFrame("Registro Clienti");
        panel = new JPanel();
        addCustomer = new JButton("Aggiungi Cliente");
        addCustomer.addActionListener(e -> {
            new AddCustomerGUI();
        });
        removeCustomer = new JButton("Rimuovi Cliente");
        showCustomer = new JButton("Mostra Cliente");
        showAllCustomer = new JButton("Mostra Tutti i Clienti");
        showAllCustomer.addActionListener(e -> {
            new ShowAllCustomerGUI();
        });
        back = new JButton("Indietro");
        back.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        panel.add(addCustomer);
        panel.add(removeCustomer);
        panel.add(showCustomer);
        panel.add(showAllCustomer);
        panel.add(back);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

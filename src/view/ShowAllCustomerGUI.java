package src.view;
import javax.swing.*;

import src.obj.Customer;

import java.awt.*;

public class ShowAllCustomerGUI {
    JFrame frame;
    JPanel panel;
    JButton back;
    JTextArea textArea;
    JScrollPane scrollPane;

    public ShowAllCustomerGUI() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) dimension.getWidth();
        int y = (int) dimension.getHeight();


        frame = new JFrame("Mostra tutti i clienti");
        panel = new JPanel();
        back = new JButton("Indietro");
        back.addActionListener(e -> {
            frame.dispose();
        });
        textArea = new JTextArea();
        textArea.setSize(x/2, y/2);
        scrollPane = new JScrollPane(textArea);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setText(Customer.showAllCustomer());

        frame.add(panel);
        panel.add(scrollPane);
        panel.add(back);

        
        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x, y);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

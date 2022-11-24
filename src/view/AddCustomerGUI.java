package src.view;
import javax.swing.*;

import src.obj.Customer;



public class AddCustomerGUI {
    JFrame frame;
    JPanel panel;
    JLabel name;
    JLabel surname;
    JLabel address;
    JLabel city;
    JLabel province;
    JLabel cap;
    JLabel phone;
    JLabel email;
    JTextField nameField;
    JTextField surnameField;
    JTextField addressField;
    JTextField cityField;
    JTextField provinceField;
    JTextField capField;
    JTextField phoneField;
    JTextField emailField;
    JButton add;
    JButton back;

    public AddCustomerGUI() {
        frame = new JFrame("Aggiungi Cliente");
        panel = new JPanel();
        name = new JLabel("Nome");
        surname = new JLabel("Cognome");
        address = new JLabel("Indirizzo");
        city = new JLabel("Città");
        province = new JLabel("Provincia");
        cap = new JLabel("CAP");
        phone = new JLabel("Telefono");
        email = new JLabel("Email");
        nameField = new JTextField(20);
        surnameField = new JTextField(20);
        addressField = new JTextField(20);
        cityField = new JTextField(20);
        provinceField = new JTextField(20);
        capField = new JTextField(20);
        phoneField = new JTextField(20);
        emailField = new JTextField(20);
        add = new JButton("Aggiungi");
        add.addActionListener(e -> {
            Customer customer = new Customer(nameField.getText(), surnameField.getText(), addressField.getText(),
                    cityField.getText(), provinceField.getText(), capField.getText());
            Customer.addCustomer(customer);
            frame.dispose();
        });
        back = new JButton("Indietro");
        back.addActionListener(e -> {
            frame.dispose();
        });

        frame.add(panel);
        panel.add(name);
        panel.add(nameField);
        panel.add(surname);
        panel.add(surnameField);
        panel.add(address);
        panel.add(addressField);
        panel.add(city);
        panel.add(cityField);
        panel.add(province);
        panel.add(provinceField);
        panel.add(cap);
        panel.add(capField);
        panel.add(phone);
        panel.add(phoneField);
        panel.add(email);
        panel.add(emailField);
        panel.add(add);
        panel.add(back);

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

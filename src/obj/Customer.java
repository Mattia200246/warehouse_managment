package src.obj;
import java.util.ArrayList;

import src.Controller;

public class Customer extends Person{
    final String email;
    //lista di customer
    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public Customer(String name, String surname, String fiscalCode, String phone, String email, String address){
        super(name, surname, fiscalCode, phone, address);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }



    @Override
    public String toString() {
        return 
                name + '\t' +
                surname + '\t' + 
                fiscalCode + '\t' +
                phone + '\t' +
                email + '\t' +
                address + '\n';
    }

    public static void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public static String showAllCustomer() {
        return Controller.showAllCustomer();
    }
    
}

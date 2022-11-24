package src;
import src.obj.Customer;

public class Controller {
    //aggiungi cliente
    public void addCustomer(String name, String surname, String fiscalCode, String phone, String email, String address) {
        Customer customer = new Customer(name, surname, fiscalCode, phone, email, address);
        Customer.addCustomer(customer);
    }

    //stampa tutti i clienti in forma tabellare
    public static String showAllCustomer() {
        String result = "";
        for (Customer customer : Customer.customers) {
            result += customer.toString() + " ";
        }
        return result;
    }
    
}

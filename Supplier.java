/*
 * Rapresent a supplier of a product
 */
public class Supplier extends Person{
    final String vatNumber;
    final String email;


    public Supplier(String name, String surname, String fiscalCode, String phone, String vatNumber, String email, String address){
        super(name, surname, fiscalCode, phone, address);
        this.vatNumber = vatNumber;
        this.email = email;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", vatNumber='" + vatNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    


    
}

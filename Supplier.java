/*
 * Rapresent a supplier of a product
 */
public class Supplier extends Person{
    final String vatNumber;
    final String email;
    final String address;


    public Supplier(String name, String surname, String fiscalCode, String phone, String vatNumber, String email, String address){
        super(name, surname, fiscalCode, phone);
        this.vatNumber = vatNumber;
        this.email = email;
        this.address = address;
    }

    public String getVatNumber() {
        return vatNumber;
    }

    public String getEmail() {
        return email;
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

public class Supplier extends Person{
    final String vatNumber;
    final String email;

    public Supplier(String name, String surname, String fiscalCode, String phone, String vatNumber, String email){
        super(name, surname, fiscalCode, phone);
        this.vatNumber = vatNumber;
        this.email = email;
    }

    
}

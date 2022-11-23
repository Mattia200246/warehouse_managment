/*
 *  Rapresents generic Person
 */
public class Person {
    final String name;
    final String surname;
    final String fiscalCode;
    final String phone;
    final String address;

    public Person(String name, String surname, String fiscalCode, String phone, String address){
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
        this.phone = phone;
        this.address = address;
    }
}

package src.obj;
/*
 *  Rapresents generic Person
 */
public class Person {
    protected final String name;
    protected final String surname;
    protected final String fiscalCode;
    protected final String phone;
    protected final String address;

    public Person(String name, String surname, String fiscalCode, String phone, String address){
        this.name = name;
        this.surname = surname;
        this.fiscalCode = fiscalCode;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFiscalCode() {
        return fiscalCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

import javax.persistence.*;

@Embeddable
public class Address {
    public String street;
    public String city;
    public String zipCode;

    public Address() {
    }

    public Address(String street, String city, String zipCode) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }
}

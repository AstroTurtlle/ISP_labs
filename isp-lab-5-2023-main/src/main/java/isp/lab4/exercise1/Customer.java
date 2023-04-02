package isp.lab4.exercise1;

public class Customer {
    private String customerID;
    private String name;
    private String phone;
    private Address address;

    public Customer(String customerID, String name, String phone, Address address) {
        this.customerID = customerID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }
}

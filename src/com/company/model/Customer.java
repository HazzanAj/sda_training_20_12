package model;

import javax.persistence.*;

import java.util.List;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerName;
    private String customerAddress;
    private String customerEmail;

    @OneToMany()
    private List<Order> order;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public List<Order> getOrder() {
        return order;
    }

    public void setOrder(List<Order> order) {
        this.order = order;
    }

    public String toString() {
        return "Customers{customerId=" + customerId +
                ", customerName=" + customerName +
                ", customerAddress=" + customerAddress +
                ", customerEmail=" + customerEmail +
                "}";

    }
}
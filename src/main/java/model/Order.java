package model;

import javax.persistence.*;

@Entity
@Table (name = "order")

public class Order {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name = "orderId")
private int orderId;

@ManyToOne
@JoinColumn(name = "productId")
private Product product;

@ManyToOne
@JoinColumn(name = "customerId")
private Customer customer;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

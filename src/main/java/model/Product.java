package model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import java.lang.String;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {




    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "productID")
    private int productID;

    @ManyToOne
    @JoinColumn(name = "shopID")

   private GroceryShop shopID;

    @Column(name = "productName")
    private String productName;
    @Column(name = "productPrice")
    private int productPrice;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getShopID() {
        return shopID;
    }

    public void setShopID(int shopID) {
        this.shopID = shopID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}

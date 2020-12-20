
package main;

import model.Product;
import model.Customer;
import model.GroceryShop;
import model.Order;

import repository.GroceryShopRepository;
import repository.OrderRepository;
import repository.ProductRepository;
import repository.RepositoryCustomer;

public class Main {
    public static void main(String[] args) {
        RepositoryCustomer CusRep= new RepositoryCustomer();
        OrderRepository OrdRep = new OrderRepository();
        ProductRepository proRep = new ProductRepository();
        GroceryShopRepository groRep = new GroceryShopRepository();

        Product pro = new Product();
        Customer cus = new Customer();
        Order ord = new Order();
        GroceryShop gro = new GroceryShop();

        //Implementing Product' Records
        pro.setProductName("Milk");
        pro.setProductPrice(2);
        // Implementing Customer's Records
        cus.setCustomerName("Zahidul");
        cus.setCustomerAddress("42A Tallin Estonia");
        cus.setCustomerEmail("Zah@gmail.com");

     /*   // Implementing Order Records
        stuCourse.setProduct("Milk");
        stuCourse.setCustomer("Zahidul");*/

        //Implementing GroceryShop Records
        gro.setShopName("PaulSmith Grocery");
        gro.setAddress("12B Tallin Estonia");
        gro.setLocation("Tallin  Estonia");
        
        // Implementing Save and Update
        CusRep.saveCustomer(cus);
        CusRep.updateCustomers(cus);
        proRep.saveProduct(pro);
        proRep.updateProduct(pro);
        groRep.saveShop(gro);
        groRep.updateShop(gro);
       
    }
}
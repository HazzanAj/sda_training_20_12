package repository;

import model.GroceryShop;
import util.DbUtil;
import java.util.*;

import javax.persistence.EntityManager;

public class GroceryShopRepository {

    private EntityManager rm;

    
    public GroceryShopRepository() {
        rm = DbUtil.getEntityManager();
    }

    public void saveShop(GroceryShop groceryShop) {
        try {
            rm.getTransaction().begin();
            rm.persist(groceryShop);
            rm.getTransaction().commit();
        } catch (Exception ex) {
            rm.getTransaction().rollback();
        }
    }

    public void updateShop(GroceryShop groceryShop) {
        try {
            rm.getTransaction().begin();
            rm.merge(groceryShop);
            rm.getTransaction().commit();
        } catch (Exception ex) {
            rm.getTransaction().rollback();
        }
    }



    public void deleteShop(GroceryShop groceryShop) {
        try {
            rm.getTransaction().begin();
            rm.remove(groceryShop);
            rm.getTransaction().commit();
        } catch (Exception ex) {
            rm.getTransaction().rollback();
        }
    }

    public List<GroceryShop> listAllShops() {
        String sql = "from GroceryShop rm";
        return rm.createQuery(sql).getResultList();
    }


}




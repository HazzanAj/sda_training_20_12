package repository;

import model.Customer;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryCustomer {

    private EntityManager em;

    public RepositoryCustomer() { em = DbUtil.getEntityManager();
    }

    public void saveCustomer(Customer customer) {
        try {
            em.getTransaction().begin();
            em.persist(customer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void updateCustomers(Customer customer) {
        try {
            em.getTransaction().begin();
            em.merge(customer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void deleteCustomer(Customer customer) {
        try {
            em.getTransaction().begin();
            em.remove(customer);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }
    public List<Customer> listAllCustomer() {
        String sql = "FROM Customer cm";
        return em.createQuery(sql).getResultList();
    }
}
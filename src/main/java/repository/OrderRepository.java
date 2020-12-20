package repository;

import model.Order;
import util.DbUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class OrderRepository {

    private EntityManager em;

    public OrderRepository() {
        em = DbUtil.getEntityManager();
    }

    public void save (Order order) {
        try {
            em.getTransaction().begin();
            em.persist(order);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void update (Order order) {
        try {
            em.getTransaction().begin();
            em.merge(order);
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public void delete (Order order) {
        try {
            em.getTransaction().begin();
            em.remove(em.merge(order));
            em.getTransaction().commit();
        } catch (Exception ex) {
            em.getTransaction().rollback();
        }
    }

    public List<Order> listAll() {
        String sql ="FROM Order o";
        return em.createQuery(sql).getResultList();
    }

    public Order findById(int id) {
        String sql = "FROM Client c WHERE c.clientId = :cId";
        return em.createQuery(sql, Order.class).setParameter("cId", id).getSingleResult();
    }
}


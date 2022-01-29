package geekbrains.avbugorov.spring1.lesson3.dao;

import geekbrains.avbugorov.spring1.lesson3.model.Customer;
import geekbrains.avbugorov.spring1.lesson3.model.Order;
import geekbrains.avbugorov.spring1.lesson3.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDao {
    final
    private SessionFactory sessionFactory;

    public CustomerDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

//    public List<Product> showPurchasedProducts(Long productId) {
//        List<Order> orderList = null;
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        Customer customer = session.get(Customer.class, customerId);
//        orderList = customer.getCustomers();
//        System.out.println(orderList);
//        session.getTransaction().commit();
//        return null;
//    }

    public List<Customer> getAll() {
        List<Customer> tempList;
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        tempList = session.createQuery("from Customer ").list();
        session.getTransaction().commit();
        return tempList;
    }

    public Customer returnCustomerById(long id) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class, id);
        session.getTransaction().commit();
        return customer;
    }

    public List<Order> getOrderListByCustomerId(Long customerId) {
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Customer customer = session.get(Customer.class, customerId);
        List<Order> listOrder = customer.getListOrder();

        session.getTransaction().commit();
        return listOrder;
    }


}

package geekbrains.avbugorov.spring1.lesson3.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "customer_name")
    private String name;

    @OneToMany(mappedBy = "customerOrder",fetch = FetchType.EAGER)
    private List<Order> listOrder;

    public Customer() {
    }

    public List<Order> getListOrder() {
        return listOrder;
    }



    public void setListOrder(List<Order> customers) {
        this.listOrder = customers;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

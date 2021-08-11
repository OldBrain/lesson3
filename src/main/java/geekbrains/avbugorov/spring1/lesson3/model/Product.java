package geekbrains.avbugorov.spring1.lesson3.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private Integer price;

    @OneToMany(mappedBy = "productOrder", fetch = FetchType.EAGER)
    List<Order> orderListIdProduct;

    public Product() {
    }

    public List<Order> getOrderListIdProduct() {
        return orderListIdProduct;
    }

    public void setOrderListIdProduct(List<Order> orders) {
        this.orderListIdProduct = orders;
    }

    public Product(String title, Integer price) {
        this.title = title;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", Наименование='" + title + '\'' +
                ", цена сегодня=" + price +
                '}';
    }
}

package geekbrains.avbugorov.spring1.lesson3.model;

public class Product {
  private Long id;
  private String title;
  private Integer price;

  public Product(Long id) {
    this.id = id;
  }

  public Product(Long id, String title, Integer price) {
    this.id = id;
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


}

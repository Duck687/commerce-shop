package Models;
import javax.persistence.*;

@Entity
public class basket {
    private Integer id_basket;
    private Integer id_user;
    private Integer id_product;
    private Integer count_product;

    public basket() {
    }

    public basket(Integer id_basket, Integer id_user, Integer id_product, Integer count_product) {
        this.id_basket = id_basket;
        this.id_user = id_user;
        this.id_product = id_product;
        this.count_product = count_product;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId_basket() {
        return id_basket;
    }

    public void setId_basket(Integer id_basket) {
        this.id_basket = id_basket;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public Integer getCount_product() {
        return count_product;
    }

    public void setCount_product(Integer count_product) {
        this.count_product = count_product;
    }
}

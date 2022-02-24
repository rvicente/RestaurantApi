package pt.capgemini.allanborges.restaurantapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu_asb")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menuId", nullable = false)
    private Integer id;

    @Column(name = "menuName", nullable = false)
    private String menuName;

    @Column(name = "menuPrice", nullable = false)
    private Double menuPrice;

    @Column(name = "menuDescription", nullable = false)
    private String menuDescription;

    @Column(name = "menuActive", nullable = false)
    private Boolean menuActive = false;

    public Boolean getMenuActive() {
        return menuActive;
    }

    public void setMenuActive(Boolean menuActive) {
        this.menuActive = menuActive;
    }

    public String getMenuDescription() {
        return menuDescription;
    }

    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }

    public Double getMenuPrice() {
        return menuPrice;
    }

    public void setMenuPrice(Double menuPrice) {
        this.menuPrice = menuPrice;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
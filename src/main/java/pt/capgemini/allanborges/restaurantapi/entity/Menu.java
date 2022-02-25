package pt.capgemini.allanborges.restaurantapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "menu_asb")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menuId", nullable = false)
    private Integer menuId;

    @Column(name = "menuName", nullable = false)
    private String menuName;

    @Column(name = "menuPrice", nullable = false)
    private Double menuPrice;

    @Column(name = "menuDescription", nullable = false)
    private String menuDescription;

    @Column(name = "menuActive", nullable = false)
    private Boolean menuActive = false;

    public Menu() {
    }
    public Menu(Integer menuId, String menuName, Double menuPrice, String menuDescription, Boolean menuActive) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
        this.menuActive = menuActive;
    }

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
    public Integer getMenuId() {
        return menuId;
    }
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", menuDescription='" + menuDescription + '\'' +
                ", menuActive=" + menuActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return menuId.equals(menu.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId);
    }
}
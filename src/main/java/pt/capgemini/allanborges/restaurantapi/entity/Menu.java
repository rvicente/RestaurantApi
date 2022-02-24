package pt.capgemini.allanborges.restaurantapi.entity;

import javax.persistence.*;

@Entity
@Table(name = "menu_asb")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuId;
    private String menuName;
    private double menuPrice;
    private String menuDescription;
    private boolean menuActive;

    public Menu() {
    }
    public Menu(int menuId, String menuName, double menuPrice, String menuDescription, boolean menuActive) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.menuDescription = menuDescription;
        this.menuActive = menuActive;
    }

    public int getMenuId() {
        return menuId;
    }
    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }
    public String getMenuName() {
        return menuName;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public double getMenuPrice() {
        return menuPrice;
    }
    public void setMenuPrice(double menuPrice) {
        this.menuPrice = menuPrice;
    }
    public String getMenuDescription() {
        return menuDescription;
    }
    public void setMenuDescription(String menuDescription) {
        this.menuDescription = menuDescription;
    }
    public boolean isMenuActive() {
        return menuActive;
    }
    public void setMenuActive(boolean menuActive) {
        this.menuActive = menuActive;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", menuPrice=" + menuPrice +
                ", menuDescription='" + menuDescription + '\'' +
                ", menuActive=" + menuActive +
                '}';
    }
}
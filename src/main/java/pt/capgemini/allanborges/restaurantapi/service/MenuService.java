package pt.capgemini.allanborges.restaurantapi.service;

import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.entity.ResponseMenu;
import pt.capgemini.allanborges.restaurantapi.error.MenuFieldNotAddedException;
import pt.capgemini.allanborges.restaurantapi.error.MenuNotFoundException;

import java.util.List;

public interface MenuService {

    Menu addMenu(Menu menu) throws MenuFieldNotAddedException;

    List<Menu> getActiveMenu();

    Menu updateMenu(Integer menuId, Menu menu);

    Menu findMenuById(Integer menuId) throws MenuNotFoundException;
}
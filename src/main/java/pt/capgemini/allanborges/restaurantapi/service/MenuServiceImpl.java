package pt.capgemini.allanborges.restaurantapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.error.MenuNotFoundException;
import pt.capgemini.allanborges.restaurantapi.repository.MenuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }

    @Override
    public List<Menu> getActiveMenu() {
        List<Menu> menuList = menuRepository.findAll();
        List<Menu> activeList = new ArrayList<>();
        for(Menu menus : menuList) {
            if (menus.getMenuActive()) {
                activeList.add(menus);
            }
        }
        return activeList;
    }

    @Override
    public Menu updateMenu(Integer menuId, Menu menu) {
        Menu existingMenu = menuRepository.findById(menuId).orElse(null);

        assert existingMenu != null;
        existingMenu.setMenuName(menu.getMenuName());
        existingMenu.setMenuPrice(menu.getMenuPrice());
        existingMenu.setMenuDescription(menu.getMenuDescription());
        existingMenu.setMenuActive(menu.getMenuActive());

        return menuRepository.save(existingMenu);
    }

    @Override
    public Menu findMenuById(Integer menuId) {
        return menuRepository.findById(menuId).get();
    }
}
package pt.capgemini.allanborges.restaurantapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.repository.MenuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        Menu me = menuRepository.findById(menuId).get();

//        me.setMenuName(menu.getMenuName());
//        me.setMenuPrice(menu.getMenuPrice());
//        me.setMenuDescription(menu.getMenuDescription());
//        me.setMenuActive(menu.getMenuActive());

        if(Objects.nonNull(menu.getMenuName()) && !"".equalsIgnoreCase(menu.getMenuName())) {
            me.setMenuName(menu.getMenuName());
        }
        if(Objects.nonNull(menu.getMenuPrice())) {
            me.setMenuPrice(menu.getMenuPrice());
        }
        if(Objects.nonNull(menu.getMenuDescription()) && !"".equalsIgnoreCase(menu.getMenuDescription())) {
            me.setMenuDescription(menu.getMenuDescription());
        }
        if(Objects.nonNull(menu.getMenuActive())) {
            me.setMenuActive(menu.getMenuActive());
        }

        return menuRepository.save(me);
    }

    @Override
    public Menu findMenuById(Integer menuId) {
        return menuRepository.findById(menuId).get();
    }
}

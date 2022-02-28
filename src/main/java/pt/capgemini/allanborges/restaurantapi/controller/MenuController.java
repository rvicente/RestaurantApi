package pt.capgemini.allanborges.restaurantapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.entity.ResponseMenu;
import pt.capgemini.allanborges.restaurantapi.error.MenuNotFoundException;
import pt.capgemini.allanborges.restaurantapi.service.MenuService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/api/v1/addMenu")
    public ResponseMenu addMenu(@RequestBody Menu menu){
        Menu currentMenu = menuService.addMenu(menu);
        List<Menu> currentList = new ArrayList<>();
        currentList.add(currentMenu);
//
//        if (currentMenu.getMenuName() == null || currentMenu.getMenuPrice() == null || currentMenu.getMenuDescription() == null || currentMenu.getMenuActive() == null) {
//            return new ResponseMenu("NOK", new Date().toString(), "500", UUID.randomUUID().toString(), "Error: a Menu field was left blank", currentList);
//        }
        return new ResponseMenu("OK", new Date().toString(), "200", UUID.randomUUID().toString(), "Menu add Success", currentList);
    }

    @GetMapping("/api/v1/getMenu")
    public ResponseMenu getActiveMenu(){
        return new ResponseMenu("OK", new Date().toString(), "200", UUID.randomUUID().toString(), "Menu get Success", menuService.getActiveMenu());
    }

    @PostMapping("/api/v1/updateMenu/{id}")
    public ResponseMenu updateMenu(@PathVariable("id") Integer menuId, @RequestBody Menu menu){
        Menu currentMenu = menuService.updateMenu(menuId, menu);
        List<Menu> currentList = new ArrayList<>();
        currentList.add(currentMenu);
        return new ResponseMenu("OK", new Date().toString(), "200", UUID.randomUUID().toString(), "Menu update Success", currentList);
    }

    @GetMapping("/api/v1/getMenuById/{id}")
    public ResponseMenu getMenuById(@PathVariable ("id") Integer menuId) throws MenuNotFoundException {
        Menu currentMenu = menuService.findMenuById(menuId);
        List<Menu> currentList = new ArrayList<>();
        currentList.add(currentMenu);
        return new ResponseMenu("OK", new Date().toString(), "200", UUID.randomUUID().toString(), "Menu getById Success", currentList);
    }
}
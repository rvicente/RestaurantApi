package pt.capgemini.allanborges.restaurantapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.service.MenuService;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/api/v1/addMenu")
    public Menu addMenu(@RequestBody Menu menu){
        return menuService.addMenu(menu);
    }

}

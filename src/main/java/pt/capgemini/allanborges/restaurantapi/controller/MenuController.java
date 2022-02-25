package pt.capgemini.allanborges.restaurantapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.error.MenuNotFoundException;
import pt.capgemini.allanborges.restaurantapi.service.MenuService;
import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class MenuController {

    @Autowired
    private MenuService menuService;

    @PostMapping("/api/v1/addMenu")
    public Menu addMenu(@RequestBody Menu menu){
        return menuService.addMenu(menu);
    }

    @GetMapping("/api/v1/getMenu")
    public List<Menu> getActiveMenu(){
        return menuService.getActiveMenu();
    }

    @PostMapping("/api/v1/updateMenu/{id}")
    public ResponseEntity<?> updateMenu(@PathVariable("id") Integer menuId, @RequestBody Menu menu){
        try {
            menuService.updateMenu(menuId, menu);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/v1/getMenuById/{id}")
    public Menu getMenuById(@PathVariable ("id") Integer menuId) throws MenuNotFoundException {
        return menuService.findMenuById(menuId);
    }
}

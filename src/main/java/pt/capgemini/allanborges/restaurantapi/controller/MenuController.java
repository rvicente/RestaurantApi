package pt.capgemini.allanborges.restaurantapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
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

    @PutMapping("/api/v1/updateMenu/{id}")
    public ResponseEntity<?> updateMenu(@PathVariable ("id") Integer menuId, @RequestBody Menu menu){
        try {
            Menu existProduct = menuService.findMenuById(menuId);
            menuService.addMenu(menu);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/api/v1/getMenuById/{id}")
    public ResponseEntity<Menu> getMenuById(@PathVariable ("id") Integer menuId){
        try {
            Menu menu = menuService.findMenuById(menuId);
            return new ResponseEntity<>(menu, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}

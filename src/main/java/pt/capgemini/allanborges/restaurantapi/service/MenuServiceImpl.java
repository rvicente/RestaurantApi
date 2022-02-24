package pt.capgemini.allanborges.restaurantapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;
import pt.capgemini.allanborges.restaurantapi.repository.MenuRepository;

@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Menu addMenu(Menu menu) {
        return menuRepository.save(menu);
    }
}

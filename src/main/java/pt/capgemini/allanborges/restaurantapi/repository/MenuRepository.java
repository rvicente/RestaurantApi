package pt.capgemini.allanborges.restaurantapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pt.capgemini.allanborges.restaurantapi.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Integer> {
}

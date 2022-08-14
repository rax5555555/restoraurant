package ru.pcs.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.restaurant.models.Menu;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {
    List<Menu> findByDishName(String dishName);
}

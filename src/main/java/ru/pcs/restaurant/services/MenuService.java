package ru.pcs.restaurant.services;

import ru.pcs.restaurant.forms.MenuForm;
import ru.pcs.restaurant.models.Menu;

import java.util.List;

public interface MenuService {
    void addMenu(MenuForm menuForm);

    List<Menu> getAllMenu();

    void deleteMenu(Long menuId);

    Menu getMenu(Long menuId);

    void updateMenu(Long menuId, MenuForm menuForm);

    List<Menu> getName(String name);
}

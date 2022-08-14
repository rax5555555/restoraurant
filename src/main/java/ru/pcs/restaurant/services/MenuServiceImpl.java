package ru.pcs.restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pcs.restaurant.forms.MenuForm;
import ru.pcs.restaurant.models.Menu;
import ru.pcs.restaurant.repositories.MenuRepository;

import java.util.List;

@Component
public class MenuServiceImpl implements MenuService {
    private final MenuRepository menuRepository;

    @Autowired
    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public void addMenu(MenuForm menuForm) {
        Menu menu = Menu.builder()
                .dishName(menuForm.getDishName())
                .description(menuForm.getDescription())
                .price(menuForm.getPrice())
                .weight(menuForm.getWeight())
                .menuClassification(menuForm.getMenuClassification())
                .build();
        menuRepository.save(menu);
    }

    @Override
    public List<Menu> getAllMenu() {
        return menuRepository.findAll();
    }

    @Override
    public void deleteMenu(Long menuId) {
        menuRepository.deleteById(menuId);
    }

    @Override
    public Menu getMenu(Long menuId) {
        return menuRepository.getById(menuId);
    }

    @Override
    public void updateMenu(Long menuId, MenuForm menuForm) {
        Menu buId = menuRepository.getById(menuId);
        buId.setDishName(menuForm.getDishName());
        buId.setDescription(menuForm.getDescription());
        buId.setPrice(menuForm.getPrice());
        buId.setWeight(menuForm.getWeight());
        menuRepository.save(buId);
    }

    @Override
    public List<Menu> getName(String dishName) {
        return menuRepository.findByDishName(dishName);
    }
}

package ru.pcs.restaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.pcs.restaurant.forms.MenuForm;
import ru.pcs.restaurant.models.Menu;
import ru.pcs.restaurant.models.MenuClassification;
import ru.pcs.restaurant.services.MenuClassificationService;
import ru.pcs.restaurant.services.MenuService;

import java.util.List;

@Controller
public class MenuController {
    private final MenuService menuService;
    private final MenuClassificationService classificationService;

    @Autowired
    public MenuController(MenuService menuService, MenuClassificationService classificationService) {
        this.menuService = menuService;
        this.classificationService = classificationService;
    }

    @GetMapping("/menu")
    public String getMenuPage(Model model) {
        List<Menu> allMenu = menuService.getAllMenu();
        List<MenuClassification> allClassification = classificationService.getAllClassification();
        model.addAttribute("menu", allMenu);
        model.addAttribute("classifications", allClassification);
        return "menu";
    }


    @PostMapping("/menu")
    public String addMenu(MenuForm menuForm) {
        menuService.addMenu(menuForm);
        return "redirect:/menu";
    }

    @PostMapping("/menu/{menu-id}/delete")
    public String deleteMenu(@PathVariable("menu-id") Long menuId) {
        menuService.deleteMenu(menuId);
        return "redirect:/menu";
    }

    @GetMapping("/menu/{menu-id}")
    public String getMenuPage(Model model, @PathVariable("menu-id") Long menuId) {
        Menu menu = menuService.getMenu(menuId);
        model.addAttribute("menu", menu);
        return "menuId";
    }

    @PostMapping("/menu/{menu-id}/update")
    public String updateMenu(@PathVariable("menu-id") Long menuId, MenuForm menuForm) {
        menuService.updateMenu(menuId, menuForm);
        return "redirect:/menu";
    }


    @PostMapping("/all/search")
    public String getMenuPageName(@RequestParam String dishName, Model model) {
        List<Menu> byDishName = menuService.getName(dishName);
        model.addAttribute("menu", byDishName);
        return "showMenu";
    }


    @GetMapping("/all")
    public String getAllMenu(Model model) {
        List<Menu> allMenu = menuService.getAllMenu();
        model.addAttribute("menu", allMenu);
        return "showMenu";
    }
}

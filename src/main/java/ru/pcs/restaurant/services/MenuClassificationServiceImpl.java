package ru.pcs.restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pcs.restaurant.models.MenuClassification;
import ru.pcs.restaurant.repositories.MenuClassificationRepository;

import java.util.List;

@Component
public class MenuClassificationServiceImpl implements MenuClassificationService {

    private final MenuClassificationRepository menuClassificationRepository;

    @Autowired
    public MenuClassificationServiceImpl(MenuClassificationRepository menuClassificationRepository) {
        this.menuClassificationRepository = menuClassificationRepository;
    }

    @Override
    public List<MenuClassification> getAllClassification() {
        return menuClassificationRepository.findAll();
    }
}

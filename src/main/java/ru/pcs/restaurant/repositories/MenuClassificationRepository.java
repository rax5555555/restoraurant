package ru.pcs.restaurant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pcs.restaurant.models.MenuClassification;

public interface MenuClassificationRepository extends JpaRepository<MenuClassification, Long> {
}

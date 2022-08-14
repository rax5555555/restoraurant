package ru.pcs.restaurant.forms;

import lombok.Data;
import ru.pcs.restaurant.models.MenuClassification;

import java.math.BigDecimal;

@Data
public class MenuForm {
    private Long id;
    private String dishName;
    private String description;
    private BigDecimal price;
    private Double weight;
    private MenuClassification menuClassification;
}

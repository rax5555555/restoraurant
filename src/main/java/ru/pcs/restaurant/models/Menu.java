package ru.pcs.restaurant.models;

import jdk.jfr.Category;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dishName;
    private String description;
    private BigDecimal price;
    private Double weight;

    @ManyToOne(fetch = FetchType.EAGER, targetEntity = MenuClassification.class)
    @JoinColumn(name = "menu_classification_id")
    private MenuClassification menuClassification;
}

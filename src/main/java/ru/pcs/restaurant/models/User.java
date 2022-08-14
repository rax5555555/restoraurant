package ru.pcs.restaurant.models;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity

@Table(name = "users")
public class User {

    public enum Role {
        ADMIN, USER
    }

    @Enumerated(value = EnumType.STRING)
    private Role role;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    @Column(unique = true)
    private String email;
    private String password;
}

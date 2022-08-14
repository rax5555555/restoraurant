package ru.pcs.restaurant.forms;

import lombok.Data;

@Data
public class SignUpForm {
    private String firstName;
    private String email;
    private String password;
}

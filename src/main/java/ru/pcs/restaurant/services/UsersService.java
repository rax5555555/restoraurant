package ru.pcs.restaurant.services;

import ru.pcs.restaurant.forms.UserForm;
import ru.pcs.restaurant.models.User;

import java.util.List;

public interface UsersService {
    void addUser(UserForm userForm);

    List<User> getAllUsers();

    void deleteUser(Long userId);

    User getUser(Long userId);

    void updateUser(Long userId, UserForm userForm);
}

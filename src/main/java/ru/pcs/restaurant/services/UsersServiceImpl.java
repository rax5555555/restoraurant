package ru.pcs.restaurant.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.pcs.restaurant.forms.UserForm;
import ru.pcs.restaurant.models.User;
import ru.pcs.restaurant.repositories.UserRepository;

import java.util.List;

@Component
public class UsersServiceImpl implements UsersService {

    private final UserRepository userRepository;

    @Autowired
    public UsersServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void addUser(UserForm userForm) {
        User user = User.builder()
                .firstName(userForm.getFirstName())
                .email(userForm.getEmail())
                .password(userForm.getPassword())
                .build();
        userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public User getUser(Long userId) {
        return userRepository.getById(userId);
    }

    @Override
    public void updateUser(Long userId, UserForm userForm) {
        User user = userRepository.getById(userId);
        user.setFirstName(userForm.getFirstName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        userRepository.save(user);
    }
}


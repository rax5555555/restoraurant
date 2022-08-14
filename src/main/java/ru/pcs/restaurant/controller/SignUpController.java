package ru.pcs.restaurant.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.pcs.restaurant.forms.SignUpForm;
import ru.pcs.restaurant.forms.UserForm;
import ru.pcs.restaurant.services.SignUpService;
import ru.pcs.restaurant.services.UsersService;

@RequiredArgsConstructor
@Controller
@RequestMapping("/signUp")
public class SignUpController {
    private final SignUpService signUpService;

    @GetMapping
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping
    public String signUpUser(SignUpForm form) {
        signUpService.signUpUser(form);
        return "redirect:/signIn";
    }
}

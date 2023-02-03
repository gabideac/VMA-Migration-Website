package com.VMA.demo.Controller;

import com.VMA.demo.Entities.UserRegister;
import com.VMA.demo.Service.UserService;
import com.VMA.demo.exception.UserException;
import jakarta.validation.Valid;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserControler {
    @Autowired
    UserService userService;

    @GetMapping("/register")
    public ModelAndView getRegisterPage() {
        UserRegister userRegister = new UserRegister();

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("registration");
        modelAndView.addObject("userRegister", userRegister);

        return modelAndView;
    }
    @GetMapping("/")
    public ModelAndView getHomePage(){
        ModelAndView modelAndView = new ModelAndView("homepage");
        return modelAndView;
    }

    @PostMapping("/register")
    public ModelAndView registerUser(@ModelAttribute("userRegister") @Valid UserRegister userRegister, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView("registration");
        if (bindingResult.hasErrors()) {
            return modelAndView;
        }
        try {
            userService.checkAndRegister(userRegister);

        } catch (UserException e) {
            throw new RuntimeException(e);
        }
        return new ModelAndView("redirect:/register?success");
    }
}

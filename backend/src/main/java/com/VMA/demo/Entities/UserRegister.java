package com.VMA.demo.Entities;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class UserRegister {
    @NotEmpty(message = "baga ceva")
    private String username;

    @NotEmpty(message = "Email cannot be empty")
    @Email(message = "Incorrect email format!")
    private String email;

    @NotEmpty(message = "Password cannot be null or empty!")
    @Size(min = 4, max = 50, message = "Password must have between 8 and 20 characters!")
    private String password;

    @NotEmpty(message = "Password confirmation cannot be empty!")
    @Size(min = 4, max = 50, message = "trebe ceva si aici")
    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
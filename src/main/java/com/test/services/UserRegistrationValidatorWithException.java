package com.test.services;

public class UserRegistrationValidatorWithException {

    UserRegistrationValidator validator = new UserRegistrationValidator();

    public void validateFirstName(String firstName) throws InvalidUserException {
        if (!validator.validateFirstName(firstName)) {
            throw new InvalidUserException("Invalid First Name");
        }
    }

    public void validateLastName(String lastName) throws InvalidUserException {
        if (!validator.validateLastName(lastName)) {
            throw new InvalidUserException("Invalid Last Name");
        }
    }

    public void validateEmail(String email) throws InvalidUserException {
        if (!validator.validateEmail(email)) {
            throw new InvalidUserException("Invalid Email");
        }
    }

    public void validateMobile(String mobile) throws InvalidUserException {
        if (!validator.validateMobile(mobile)) {
            throw new InvalidUserException("Invalid Mobile");
        }
    }

    public void validatePassword(String password) throws InvalidUserException {
        if (!validator.validatePassword(password)) {
            throw new InvalidUserException("Invalid Password");
        }
    }
}
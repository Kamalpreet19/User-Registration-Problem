package com.test.services;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

    public class UserRegistrationTest {

        UserRegistrationValidator validator = new UserRegistrationValidator();



        @Test
        void givenValidFirstName_ShouldReturnTrue() {
            assertTrue(validator.validateFirstName("Kamal"));
        }

        @Test
        void givenInvalidFirstName_ShouldReturnFalse() {
            assertFalse(validator.validateFirstName("kamal"));
        }

        @Test
        void givenValidLastName_ShouldReturnTrue() {
            assertTrue(validator.validateLastName("Kaur"));
        }

        @Test
        void givenInvalidLastName_ShouldReturnFalse() {
            assertFalse(validator.validateLastName("kaur"));
        }



        @Test
        void givenValidEmail_ShouldReturnTrue() {
            assertTrue(validator.validateEmail("abc.xyz@bl.co.in"));
        }

        @Test
        void givenInvalidEmail_ShouldReturnFalse() {
            assertFalse(validator.validateEmail("abc@.com"));
        }

        // Parameterized Email Test (UC10)
        @ParameterizedTest
        @ValueSource(strings = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc.xyz@bl.co.in"
        })
        void givenMultipleValidEmails_ShouldReturnTrue(String email) {
            assertTrue(validator.validateEmail(email));
        }



        @Test
        void givenValidMobile_ShouldReturnTrue() {
            assertTrue(validator.validateMobile("91 9919819801"));
        }

        @Test
        void givenInvalidMobile_ShouldReturnFalse() {
            assertFalse(validator.validateMobile("919919819801"));
        }



        @Test
        void givenValidPassword_ShouldReturnTrue() {
            assertTrue(validator.validatePassword("Abcdef1@"));
        }

        @Test
        void givenInvalidPassword_ShouldReturnFalse() {
            assertFalse(validator.validatePassword("abcdefg"));
        }
    }


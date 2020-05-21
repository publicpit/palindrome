package com.example;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @org.junit.jupiter.api.Test
    void isPalindrome() {
        assertTrue(PalindromeNumber.isPalindrome(1));
        assertFalse(PalindromeNumber.isPalindrome(12));
        assertTrue(PalindromeNumber.isPalindrome(121));

    }


}
package com.example;

public class PalindromeNumber {
    public static boolean isPalindrome(int number) {

        // solution inverting the digits and comparing the originalNumber with the reverseNumber
        int reverseNumber = 0;
        int remainingNumber = 0;
        int originalNumber = number;
        boolean result = false;

        while (number > 0) {

            remainingNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + remainingNumber;
            number = number / 10;
        }

        return (reverseNumber == originalNumber);
    }


    // dummy solution comparing extreme digits for each step
    public static boolean isPalindrome1(int number) {

        boolean palindromeFlag = false;
        int digits = 0;
        int number1 = number;
        int count = 0;

        while (number1 > 0) { // counting number of digits
            number1 /= 10;
            digits++;
        }
        if (digits != 2) { // to account for number with more than two digits

            if (digits % 2 != 0) { // to account for odd digit numbers
                for (int i = (digits - 1); i >= 2; i--) {

                    if (number % 10 == number / (int) Math.pow(10, i)) {
                        number = (number - number / (int) Math.pow(10, i) * (int) Math.pow(10, i)) / 10;
                        if (number <= 1) { // to account for palindrome with zero in between i.e. 10001
                            count = digits / 2;
                            break;
                        }
                        count++;
                    }
                }
            }

            if (digits % 2 == 0) { // to account for even digit numbers
                for (int j = (digits - 1); j >= 1; j--) {

                    if (number % 10 == number / (int) Math.pow(10, j)) {
                        number = (number - number / (int) Math.pow(10, j) * (int) Math.pow(10, j)) / 10;
                        if (number <= 1) {
                            count = digits / 2; // to account for palindrome with zero in between i.e. 100_001
                            break;
                        }
                        count++;
                    }
                }
            }
        } else if (number % 10 == number / 10) { // to account for 2-digits number
            palindromeFlag = true;
        }

        if (digits / 2 == count) {
            palindromeFlag = true;
        }

        return palindromeFlag;
    }
}


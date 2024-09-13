package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
    }

    public static boolean isPalindrome (int x) {
        int pal = x;
        int reverse = 0;
        boolean result = false;
        while (pal != 0 ){
            int remainder = pal % 10;
            reverse = reverse * 10 + remainder;
            pal = pal / 10;
        }
        if(x == reverse){ result = true; }

        return result;
    }

    public static boolean isPerfectNumber (int x) {
        if(x < 0 ) return false;
        boolean result = false;
        int sum = 0;

        for (int i = 1 ; i <= x/2 ; i++ ){
            if (x % i == 0){
                sum += i;
            }
        }
        if (sum == x) {
            result = true;
        }
        return result;
    }

    public static String numberToWords (int x ){
        if (x < 0 ) {return "Invalid Value";}
        char[] digits = String.valueOf(x).toCharArray();
        String numToText ="";

        for(char digit:digits){
            switch (digit){
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }

        }

        return numToText.trim();
    }



}

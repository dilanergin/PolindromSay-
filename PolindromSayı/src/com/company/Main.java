package com.company;

public class Main {

    static boolean isPolindrom(int number) {
        int number2, lastNumber, newNumber = 0;
        number2 = number;
        while (number2 != 0) {
            lastNumber = number2 % 10;
            newNumber = (newNumber * 10) + lastNumber;
            number2 /= 10;
        }
        System.out.println(newNumber);
        if (number == newNumber)
            return true;
        else
            return false;


    }

    public static void main(String[] args) {
        // Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

        System.out.println(isPolindrom(789));
        System.out.println("------------------------------------");
        System.out.println(isPolindrom(676));


    }
}

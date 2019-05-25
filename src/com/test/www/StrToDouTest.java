package com.test.www;

import java.util.Scanner;

public class StrToDouTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String str = scanner.nextLine();
        Double number;

        while (true) {
            try {

                number = Double.parseDouble(str);
                break;
            } catch (NumberFormatException e) {

                System.out.println("cannot convert to a double number,please enter a new string: ");

                str = scanner.nextLine();
            }
        }
        System.out.println("you input a double number: " + number);
    }
}

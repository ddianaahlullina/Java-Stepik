package IfOperator;

import java.util.Scanner;

public class ThreeEqualStrings {
    public static void main(String[] args) {
        /*С клавиатуры построчно вводятся три строки.
          Необходимо определить, все ли он равны.
          Если да, то вывести "Yes", в противном случае - "No"
         */
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.next();
        String secondString = scanner.next();
        String thirdString = scanner.next();
        if (firstString.equals(secondString) && secondString.equals(thirdString)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

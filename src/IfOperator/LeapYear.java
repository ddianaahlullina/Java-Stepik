package IfOperator;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        //Если год Високосный, то выведите "Yes", если же нет, то выведете "No"
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        if (inputYear % 400 == 0) { //год, номер которого кратен 400, — високосный
            System.out.println("Yes");
        } else if (inputYear % 100 == 0) { //остальные годы, номер которых кратен 100, — невисокосные
            System.out.println("No");
        } else if (inputYear % 4 == 0) { //годы, номер которых кратен 4, — високосные[
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

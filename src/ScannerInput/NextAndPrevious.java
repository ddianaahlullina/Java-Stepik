package ScannerInput;

import java.util.Scanner;

public class NextAndPrevious {
    public static void main(String[] args) {
        //Напишите программу, которая считывает три целых числа и выводит их произведение.
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        int nextNumber = a + 1;
        int previousNumber = a - 1;
        System.out.println("The next number for the number " + a + " is " + nextNumber +"." );
        System.out.println("The previous number for the number " + a + " is " + previousNumber +"." );
    }
}

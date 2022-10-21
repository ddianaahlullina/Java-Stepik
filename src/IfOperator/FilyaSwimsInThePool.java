package IfOperator;

import java.util.Scanner;

public class FilyaSwimsInThePool {
    /* Программа получает на вход числа N, M, x, y.
       Программа должна вывести число метров,
       которое нужно проплыть Филе до бортика.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x < y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }
    }
}

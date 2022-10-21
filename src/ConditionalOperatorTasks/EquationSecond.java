package ConditionalOperatorTasks;

import java.util.Scanner;

public class EquationSecond {
    /*Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения (a != 0).
      Определите количество его корней.
      Вам достаточно вывести одно целое число - количество корней квадратного уравнения.
      ax^2 + bx + c =0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int D = b * b - 4 * a * c;
        if (D < 0) {
            System.out.println("0");
        } else if (D == 0) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}

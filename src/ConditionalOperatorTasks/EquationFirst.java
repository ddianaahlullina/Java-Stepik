package ConditionalOperatorTasks;

import java.util.Scanner;

public class EquationFirst {
    /*Вводятся два целых числа:  a, b - коэффициенты линейного уравнения a * x + b = 0.
      Определите количество его корней.
      Вам достаточно вывести одно целое число - количество корней квадратного уравнения.
      Если корней бесконечно много, ты выведите строку "inf".

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("inf");
        } else if (a == 0 & b != 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
    }
}

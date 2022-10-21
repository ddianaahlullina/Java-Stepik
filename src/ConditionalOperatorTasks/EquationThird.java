package ConditionalOperatorTasks;

import java.util.Scanner;

public class EquationThird {
    /* Вводятся три целых числа:  a, b и c - коэффициенты квадратного уравнения.
       Определите количество его корней.
       Вам достаточно вывести одно целое число - количество корней уравнения.
       Если корней бесконечно много, ты выведите строку "inf".
       Множество решений если a b c = 0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int D = (int) ((Math.pow(b, 2)) - (4 * a * c)); // приведение к int от double откидывает десятичную дробь,
        // Math.pow метод для возведения числа в степень
        if (a == 0) {
            if (b == 0 && c != 0) {
                System.out.println("0");
            } else if (b == 0 && c == 0) {
                System.out.println("inf");
            } else {
                System.out.println("1");
            }
        } else if (D < 0) {
            System.out.println("0");
        } else if (D > 0) {
            System.out.println("2");
        } else {
            System.out.println("1");
        }
    }
}

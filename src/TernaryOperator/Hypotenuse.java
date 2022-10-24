package TernaryOperator;

import java.util.Scanner;

public class Hypotenuse {
    /*Вводится два целых числа - длины катетов прямоугольного треугольника.
    Найдите гипотенузу этого треугольника.
    a2 + b2 = c2, где a, b — катеты, с — гипотенуза.
    c = корень кв из а2+б2
    Input: 3 4  Output : 5.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
        // принимает в качестве параметра только double либо нужно привести к нужному типу
        // дописывания названия типа данных в обычных скобочках перед переменной а = (int) b
        System.out.println(c);
    }
}

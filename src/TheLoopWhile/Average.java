package TheLoopWhile;

import java.util.Scanner;

public class Average {
    /* Пользователь с клавиатуры вводит действительные числа до 0.
       Необходимо вычислить их среднее арифметическое.
       Гарантируется, что он введёт хотя бы одно ненулевое число
       Input 1 2 3 0 Output 2.0
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        double sum = 0;
        double countOfNumbers = 0;
        while (number != 0) {
            sum += number; // 0 + digit
            countOfNumbers++; //
            number = scanner.nextDouble();
        }
        System.out.println(sum / countOfNumbers);
    }
}

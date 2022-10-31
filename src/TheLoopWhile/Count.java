package TheLoopWhile;

import java.util.Scanner;

public class Count {
    /* Вводится 2 целых числа a и b (a <= b).
       Необходимо вычислить количество всех чисел кратных 3,
       но не кратных 5 от а до b включительно.
       Input: 1 16 Output: 4
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int countOfNumbers = 0;
        while (firstNumber <= secondNumber) {
            if (firstNumber % 3 == 0 && firstNumber % 5 != 0) {
                countOfNumbers++;
            }
            firstNumber++;
        }
        System.out.println(countOfNumbers);
    }
}



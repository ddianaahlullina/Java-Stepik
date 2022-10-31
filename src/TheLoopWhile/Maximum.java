package TheLoopWhile;

import java.util.Scanner;

public class Maximum {
    /* Последовательность состоит из различных натуральных чисел и завершается числом 0.
      Определите значение максимального элемента в этой последовательности.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int maxNumber = inputNumber;
        while (inputNumber != 0) {
            inputNumber = scanner.nextInt();
            if (maxNumber < inputNumber) {
                maxNumber = inputNumber;
            }
        }
        System.out.println(maxNumber);
    }
}

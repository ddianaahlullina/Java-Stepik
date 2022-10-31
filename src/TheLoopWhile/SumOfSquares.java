package TheLoopWhile;

import java.util.Scanner;

public class SumOfSquares {
    // По данному натуральному n вычислите сумму 1^2+2^2+...+n^2.
    // Input 3 Output 14
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int sum = 0;
        while (inputNumber >= 1) {
            sum += Math.pow(inputNumber, 2);
            inputNumber--;
        }
        System.out.println(sum);
    }
}

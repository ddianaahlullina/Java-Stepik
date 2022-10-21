package ConditionalOperatorTasks;

import java.util.Scanner;

public class CountsOfNumberSecond {
    /* Вводится целое число n (0 < n < 1000).
       Определите, сколько в нём цифр.
       Выведите ответ на экран.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber <= 9 && inputNumber > 0) {
            System.out.println("1");
        } else if (inputNumber >= 10 && inputNumber <= 99) {
            System.out.println("2");
        } else if (inputNumber <= 0 && inputNumber < 1000) {
            System.out.println("Number need to be more than 0 and less than 1000.");
        } else {
            System.out.println("3");
        }
    }
}

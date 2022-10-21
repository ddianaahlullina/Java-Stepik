package ConditionalOperatorTasks;

import java.util.Scanner;

public class CountsOfNumberFirst {
    /*Вводится целое число n (0 < n < 1000).
     Определите, является ли оно двузначным?
     Выведите в ответ "Yes"/"No".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber >= 10 && inputNumber <= 99) {
            System.out.println("Yes");
        } else if (inputNumber < 1000 && inputNumber < 0) {
            System.out.println("Number need to be more than 0 and less than 1000.");
        } else {
            System.out.println("No");
        }
    }
}

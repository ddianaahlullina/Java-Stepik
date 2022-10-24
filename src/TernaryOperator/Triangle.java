package TernaryOperator;

import java.util.Scanner;

public class Triangle {
    /*Вводятся три целых числа.
      Необходимо определить, существует ли треугольник с такими сторонами.
      В ответ выведите "Yes"/"No".
      Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
      Требуется сравнить каждую сторону с суммой двух других.
      Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
      то треугольника с такими сторонами не существует.
      Input: 3 4 5 Output : Yes
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sideA = b + c;
        int sideB = a + c;
        int sideC = a + b;
        System.out.println((a < sideA) && (b < sideB) && (c < sideC) ? "Yes" : "No");
    }
}

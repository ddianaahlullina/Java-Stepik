package TernaryOperator;

import java.util.Scanner;

public class CoordinateQuarters {
    /*Даны координаты двух точек на плоскости, требуется определить,
     лежат ли они в одной координатной четверти или нет (все координаты отличны от нуля).
      Входные данные
      Вводятся 4 числа: координаты первой точки (x1, y1) и координаты второй точки (x2, y2).
      Выходные данные
      Программа должна вывести слово YES,
      если точки находятся в одной координатной четверти,
      в противном случае вывести слово NO.
      Input: 1 1 2 2  Output : YES
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xA = scanner.nextInt();
        int yA = scanner.nextInt();
        int xB = scanner.nextInt();
        int yB = scanner.nextInt();
        System.out.println(xA * xB > 0 && yA * yB > 0 ? "YES" : "NO");
    }
}

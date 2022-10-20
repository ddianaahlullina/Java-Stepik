package ScannerInput;

import java.util.Scanner;

public class SquareAndPerimeter {
    public static void main(String[] args) {
        /*На одной строчке через пробел записаны два целых числа:
         длина и ширина прямоугольника.
         Вычислите его площадь и периметр.
         Результат выведите на разных строках. */
        Scanner scanner = new Scanner(System.in);
        int lengthRectangle = scanner.nextInt();
        int widthRectangle = scanner.nextInt();
        int square = lengthRectangle * widthRectangle;
        int perimeter = 2 * (lengthRectangle + widthRectangle);
        System.out.println(square);
        System.out.println(perimeter);
    }
}

package TernaryOperator;

import java.util.Scanner;

public class Chess {
    /*Требуется определить, бьет ли ладья,
      стоящая на клетке с указанными координатами
      (номер строки и номер столбца), фигуру, стоящую на другой указанной клетке.
      Входные данные
      Вводятся четыре числа: координаты ладьи (два числа) и координаты другой фигуры (два числа),
      каждое число вводится в отдельной строке.
      Координаты - целые числа в интервале от 1 до 8.
      Требуется вывести слово YES, если ладья сможет побить фигуру за 1 ход
      и NO - в противном случае.
      Input: 2 2 2 5 Output : YES
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStringA = scanner.nextInt();
        int numberOfColumnA = scanner.nextInt();
        int numberOfStringB = scanner.nextInt();
        int numberOfColumnB = scanner.nextInt();
        System.out.println(numberOfStringA == numberOfStringB || numberOfColumnA == numberOfColumnB ? "YES" : "NO");
    }
}

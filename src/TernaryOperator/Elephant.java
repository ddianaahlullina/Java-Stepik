package TernaryOperator;

import java.util.ArrayList;
import java.util.Scanner;

public class Elephant {
    /* Требуется определить, бьет ли слон,
       стоящий на клетке с указанными координатами
       (номер строки и номер столбца), фигуру,
       стоящую на другой указанной клетке.
       Вводятся четыре числа: координаты слон (два числа) и
       координаты другой фигуры (два числа),
       каждое число вводится в отдельной строке.
       Координаты - целые числа в интервале от 1 до 8.
       Требуется вывести слово YES, если слон сможет побить фигуру за 1 ход
       и NO - в противном случае.
             Input: 1 1 3 3 Output : YES
     */
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        while (arrayList.size() < 4) {
            int number = scanner.nextInt();
            if (number >= 1 && number <= 8) {
                arrayList.add(number);
            } else {
                System.out.println("Incorrect number " + number);
            }
        }
        int x = Math.abs(arrayList.get(0) - arrayList.get(2)); //.abs возвращает положительное значение
        int y = Math.abs(arrayList.get(1) - arrayList.get(3));
        System.out.println(x == y ? "YES" : "NO");
    }
}

/* если две клетки лежат на одной диагонали,
   то либо сумма координат (x+y), либо разность координат
   (x-y) у них должны быть равны (в зависимости от направления диагонали)
 */
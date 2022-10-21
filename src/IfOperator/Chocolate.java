package IfOperator;

import java.util.Scanner;

public class Chocolate {
    /*Вводятся 3 числа: n, m и k; k не равно n × m.
      Гарантируется, что количество долек в шоколадке не превосходит 30000.
      Нужно вывести слово YES, если возможно отломить указанное число долек,
      в противном случае вывести слово NO.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int slice = scanner.nextInt();
        int breakOffSlice = scanner.nextInt();
        int square = size * slice;
        if ((breakOffSlice < square) && (slice <= 30000) && ((breakOffSlice % size == 0 || breakOffSlice % slice == 0))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    /* breakOffSlice не может быть больше общего к-ва долек
       slice количество долек не может быть больше 30к
       при делении отломленных долек на размер шоколадки(size)
        или на к-во долек (slice) не должно быть остатка
     */

}

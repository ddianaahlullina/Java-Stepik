package ConditionalOperatorTasks;

import java.util.Scanner;

public class PointOne {
    /*Вводятся два действительных числа: координаты точки на плоскости.
      Определите, принадлежит ли эта точка закрашенной области.
      Выведите ответ на задачу в формате "Yes"/"No".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        if (y > (2 * x)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

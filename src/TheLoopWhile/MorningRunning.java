package TheLoopWhile;

import java.util.Scanner;

public class MorningRunning {
    //В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения.
    // По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextInt();
        double day = scanner.nextInt();
        int countOfDay = 1;
        while ( distance < day) {
            distance *= 1.1;
            countOfDay++;
        }
        System.out.println(countOfDay);
    }
}

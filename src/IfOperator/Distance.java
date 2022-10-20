package IfOperator;

import java.util.Scanner;

public class Distance {
    /*Напишите программу, которая по введённым времени и скорости найдёт пройденный путь.
    Сначала вводится время движения, затем скорость.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int speed = scanner.nextInt();
        int distance = time * speed;
        System.out.println(distance);
    }
}

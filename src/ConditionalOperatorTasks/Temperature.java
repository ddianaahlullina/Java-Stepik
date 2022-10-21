package ConditionalOperatorTasks;

import java.util.Scanner;

public class Temperature {
    /*Вводится одно действительное число - температура воздуха на улице.
      Если она меньше, чем 22.4 градуса, то вывести "Холодно(",
      если больше, то вывести "Тепло!",
      если ровно 22.4 градуса, то вывести "Прохладно...".
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = scanner.nextDouble();
        if (temperature < 22.4) {
            System.out.println("Холодно(");
        } else if (temperature == 22.4) {
            System.out.println("Прохладно...");
        } else {
            System.out.println("Тепло!");
        }
    }
}

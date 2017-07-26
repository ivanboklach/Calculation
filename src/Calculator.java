/**
 * Created by macbook on 26.07.17.
 */
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double first;
        double second;
        String operator;

        System.out.println("Вас приветствует простейший калькулятор!");
        System.out.println();
        System.out.print("Вввдите необходимое действие:");

        first = in.nextDouble();
        operator = in.next();
        second = in.nextDouble();

        if (operator.equals("+")) {
            System.out.println("Результат суммирования: " + (first + second));
        }

        if (operator.equals("-")) {
            System.out.println("Результат вычитания: " + (first - second));
        }

        if (operator.equals("*")) {
            System.out.println("Результат умножения: " + (first * second));
        }

        if (operator.equals("/")) {
            System.out.println("Результат деления: " + (first / second));
        }
    }
}


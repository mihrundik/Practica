package Fibonacci_homework.calc;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println("Введите число х? до которого необходимо вычислить число Фибоначчи: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        Calculation calc = new Calculation();
        System.out.print(calc.sum(x));
    }

}

package recurtion_homework;

import recurtion_homework.calc.Calculation;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Введите количество элементов Фибоначчи, которые необходимо вычислить: ");
        Scanner scanner = new Scanner(System.in);
        int z = scanner.nextInt();


        Calculation calc = new Calculation();
//        calc.sum(0, 1, z);
        calc.sum(z);

    }

}

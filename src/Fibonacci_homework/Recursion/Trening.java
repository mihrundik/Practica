package Fibonacci_homework.Recursion;

import Fibonacci_homework.Recursion.TreningSecond.Second;

public class Trening {
    public static void main(String[] args) {

        Second x = new Second();

        // Дано натуральное число n. Выведите все числа от 1 до n.
        x.first(1, 5);
        x.enter();

        // Даны два целых числа A и В (каждое в отдельной строке).
        // Выведите все числа от A до B включительно, в порядке возрастания, если A < B, и
        // ли в порядке убывания в противном случае.
        x.second(1,5);
        x.enter();
        x.second(5,1);
        x.enter();

        // Дано натуральное число N. Вычислите сумму его цифр.
        x .fourth(0,179);
        x.enter();
        x.fourth(0, 1079);
        x.enter();
    }
}

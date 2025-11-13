package Fibonacci_homework.Recursion.TreningSecond;

public class Second {

    public void enter() {
        System.out.println();
    }

    // Дано натуральное число n. Выведите все числа от 1 до n.
    public void first(int count, int n) {
        if (n > count - 1) {
            System.out.print(count + " ");
            first(count + 1, n);
        }
    }

    // Даны два целых числа A и В (каждое в отдельной строке).
    // Выведите все числа от A до B включительно, в порядке возрастания, если A < B, и
    // ли в порядке убывания в противном случае.
    public void second(int x, int y) {
        int c = 1;
        if (x > y) {
            c = -1;
        }
        if (y != x) {
            System.out.print(x + " ");
            second(x + c, y);
        }
        else {
            System.out.print(y);
        }
    }



    // Дано натуральное число N. Вычислите сумму его цифр.
    public void fourth(int x, int n) {
        if (n >= 10) {
            fourth(x + n % 10, n / 10);
        }
        else {
            System.out.print(x + n);
        }
    }










}

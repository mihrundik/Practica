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
    // Выведите все числа от A до B включительно, в порядке возрастания,
    // если A < B, или в порядке убывания в противном случае.
    public void second(int x, int y) {
        int c = 1;
        if (x > y) {
            c = - 1;
        }
        if (y != x) {
            System.out.print(x + " ");
            second(x + c, y);
            }
        else {
            System.out.print(y);
        }
    }

    // Дано натуральное число N. Выведите слово YES, если число N
    // является точной степенью двойки, или слово NO в противном случае.
    public void third(double n) {
        if (n > 3 && n / 2 != 1) {
            third(n / 2);
        }
        if (n % 2 == 0 && n <= 3) {
            System.out.print("YES");
        }
        else if (n % 2 != 0 && n <= 3) {
            System.out.print("NO");
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

    // Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке,
    // разделяя их пробелами или новыми строками.
    public void fifth(int x) {
        if (x >= 10) {
            System.out.print(x % 10);
            fifth(x / 10);
        }
        else {
            System.out.print(x);
        }
    }

    // Дано натуральное число N. Выведите все его цифры по одной,
    // в обычном порядке, разделяя их пробелами или новыми строками.
    public void sixth(int x) {
        if (x >= 10) {
            System.out.print(x % 10 + " ");
            sixth(x / 10);
        }
        else {
            System.out.print(x);
        }
    }


}

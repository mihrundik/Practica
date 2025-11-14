package Recursion.TreningSecond;

import java.util.Scanner;

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

    // Дано натуральное число N. Выведите слово YES,
    // если число N является точной степенью двойки, или слово NO в противном случае.
    public void third(double n) {
        if (n <= 3 && n % 2 == 0) {
            System.out.print("YES");
        }
        else if (n <= 3 && n % 2 != 0) {
            System.out.print("NO");
        }
        else {
            third(n / 2);
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

    // Дано натуральное число N. Выведите все его цифры по одной,
    // в обратном порядке, разделяя их пробелами или новыми строками.
    public void fifth(int n) {
        if (n >= 10) {
            System.out.print(n % 10 + " ");
            fifth(n / 10);
        }
        else {
            System.out.print(n);
        }
    }

    // Дано натуральное число N. Выведите все его цифры по одной,
    // в обычном порядке, разделяя их пробелами или новыми строками.
    public void sixth(int n) {
        if (n >= 10) {
            sixth(n / 10);
        }
        System.out.print(n % 10 + " ");
    }

    // Дано натуральное число n>1. Проверьте, является ли оно простым.
    // Программа должна вывести слово YES, если число простое и NO,
    // если число составное. Алгоритм должен иметь сложность O(n‾√).
    public void seventh(int x, int n) {
        if (n == 2 || n ==3) {
            System.out.print("YES");
            return;
        }
        if (x * x > n) {
            System.out.print("YES");
            return;
        }
        if (n % x == 0) {
            System.out.print("NO");
            return;
        }
        seventh(x + 2, n);

    }

    // Дано натуральное число n>1. Выведите все простые делители этого числа
    // в порядке неубывания с учетом кратности.
    public void eighth(int x, int n) {
        if (n > 1) {
            if (n % x == 0) {
                System.out.print(x + " ");
                eighth(x, n / x);
            }
            else {
                eighth(x + 1, n);
            }
        }
    }

    // Дано слово, состоящее только из строчных латинских букв.
    // Проверьте, является ли это слово палиндромом. Выведите YES или NO./
    public void ninth(String str) {
        if (str.length() <=1) {
            System.out.print("YES");
            return;
        }
        if (str.charAt(0) != str.charAt(str.length()-1)) {
            System.out.print("NO");
            return;
        }
        ninth(str.substring(1, str.length()-1));
    }

    // Дана последовательность натуральных чисел (одно число в строке),
    // завершающаяся числом 0. Выведите все нечетные числа из этой последовательности, сохраняя их порядок.
    // В этой задаче нельзя использовать глобальные переменные и
    // передавать какие-либо параметры в рекурсивную функцию. Функция получает данные, считывая их с клавиатуры.
    public void tenth(int x) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        if (x % 2 != 0) {
            System.out.println(x);
        }
        if (x == 0){
            return;
        }
        tenth(x);
    }








}

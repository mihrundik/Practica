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

    // Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    // Определите наибольшее значение числа в этой последовательности.
    // В этой задаче нельзя использовать глобальные переменные и передавать какие-либо параметры
    // в рекурсивную функцию. Функция получает данные, считывая их с клавиатуры. Функция возвращает
    // единственное значение: максимум считанной последовательности. Гарантируется, что
    // последовательность содержит хотя бы одно число (кроме нуля).
    public void eleven(int max, int x){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        x = scanner.nextInt();

        if (x > 0) {
            if (x > max){
                max = x;
                eleven(max, x);
            } else {
                eleven(max, x);
            }
        } else {
            System.out.print(max);
        }

    }

    // Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    // Определите среднее значение элементов этой последовательности (без учета последнего нуля).
    //В этой задаче нельзя использовать глобальные переменные. Функция получает данные, считывая
    // их с клавиатуры, а не получая их в виде параметра. В программе на языке Python функция
    // возвращает кортеж из пары чисел: число элементов в последовательности и их сумма.
    // В программе на языке C++ результат записывается в две переменные,
    // которые передаются в функцию по ссылке.
    //Гарантируется, что последовательность содержит хотя бы одно число (кроме нуля).
    public void twelve(int count, int sum, int x) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        x = scanner.nextInt();

        if (x > 0) {
            sum = sum + x;
            count++;
            twelve(count, sum, x);

        } else {
            System.out.printf("%.10f\n", (double) sum / count);
        }
    }

    public void thirteenth(int max1, int max2, int x) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        x = scanner.nextInt();
        int temp = 0;

        if (x > 0) {
            if (x >= max1) {
                max2 = max1;
                max1 = x;
            }
            thirteenth(max1, max2, x);

        } else {
            System.out.println(max2);
        }
    }

    // Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
    // Определите, какое количество элементов этой последовательности, равны ее наибольшему элементу.
    //В этой задаче нельзя использовать глобальные переменные. Функция получает данные,
    // считывая их с клавиатуры, а не получая их в виде параметра. В программе на языке
    // Python функция возвращает результат в виде кортежа из нескольких чисел и функция вообще
    // не получает никаких параметров. В программе на языке C++ результат записывается в переменные,
    // которые передаются в функцию по ссылке. Других параметров, кроме как используемых для возврата
    // значения, функция не получает.
    // Гарантируется, что последовательность содержит хотя бы одно число (кроме нуля).
    public void fourteenth(int x) {
        int count = 1;
        int max = 0;

        while (x != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            x = scanner.nextInt();
            if (x > max) {
                max = x;
            } else if (x == max) {
                count++;
            } else {
                fourteenth(x);
            }
        }
        System.out.println(count);
    }





}

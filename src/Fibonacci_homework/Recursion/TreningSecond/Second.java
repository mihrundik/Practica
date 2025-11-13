package Fibonacci_homework.Recursion.TreningSecond;

public class Second {

    public void first(int count, int n) {
        if (n > count - 1) {
            System.out.print(count + " ");
            first(count + 1, n);
        }


        }
}

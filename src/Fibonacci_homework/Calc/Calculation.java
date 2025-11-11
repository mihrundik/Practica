package Fibonacci_homework.Calc;

public class Calculation {

    public void sum(int x, int y, int z) {
        if(z >= 1){
            System.out.print(x + " ");
        }
        if(z >= 2) {
            System.out.print(y + " ");
        }

        for(int i = 2; i < z; i++) {
            int temp = x + y;
            x = y;
            y = temp;
            System.out.print(y + " ");
        }

    }

}

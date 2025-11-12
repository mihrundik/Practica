package Fibonacci_homework.Calc;

public class Calculation {

//    public void sum(int x, int y, int z) {
//        if(z >= 1){
//            System.out.print(x + " ");
//        }
//        if(z >= 2) {
//            System.out.print(y + " ");
//        }
//
//        for(int i = 2; i < z; i++) {
//            int temp = x + y;
//            x = y;
//            y = temp;
//            System.out.print(y + " ");
//        }

    public void sum(int z) {
        for(int i = 0; i < z; i++) {
            System.out.print(sumFib(i) + " ");
        }
    }

    public int sumFib(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        if(i >= 2) {
            return sumFib(i - 1) + sumFib(i - 2);
        }

        return i;
    }

}

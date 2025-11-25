package lesson_10_11_2025.tools;

public class Math {

    public int sum(int... numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }

    public int sumNumber(int num) {
        if(num == 1) {
            return 1;
        }
         int sum = num + sumNumber(--num);
        return sum;
    }

}

package Tools;

public class Math {

    public int sum(int... numbers) {
        int sum = 0;
        for (int num: numbers) {
            sum += num;
        }
        return sum;
    }

}

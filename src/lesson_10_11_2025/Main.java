package lesson_10_11_2025;

import lesson_10_11_2025.tools.Math;
import lesson_10_11_2025.tools.Search;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        lesson_10_11_2025.tools.Math math = new Math();
        System.out.println(math.sum(1,2,3,4,5,2));

        Search search = new Search();
        System.out.println(search.search(5,2,3,4,5,6));

        Search searchModern = new Search();
        System.out.println(search.search(1,2,3,4,5,6));

        System.out.println(math.sumNumber(10));

        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(10);
        }

        int statement = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            for(int j = 0; j < numbers.length - 1; j++) {
                if(numbers[j] > numbers[j + 1]) {
                    statement = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = statement;
                }
            }
        }

        for (int num: numbers) {
            System.out.print( num + " ");
        }

    }
}
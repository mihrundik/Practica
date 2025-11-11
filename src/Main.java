import Tools.Math;
import Tools.Search;


public class Main {
    public static void main(String[] args) {

        Math math = new Math();
        System.out.println(math.sum(1,2,3,4,5,2));

        Search search = new Search();
        System.out.println(search.search(5,2,3,4,5,6));

        Search searchModern = new Search();
        System.out.println(search.search(1,2,3,4,5,6));

    }
}
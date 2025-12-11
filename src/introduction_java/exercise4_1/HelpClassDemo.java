package introduction_java.exercise4_1;

import java.io.IOException;
import java.util.Scanner;

public class HelpClassDemo {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        showmenu();
        char choice;
        Help hlpobj = new Help();

        for (;;) {
            do {
                choice = (char) System.in.read();
            } while (!hlpobj.isvalid(choice));

            if (choice == 'q') {
                break;
            }

            System.out.println("\n");
            hlpobj.helpon(choice);
        }
    }

    static void showmenu() {
        System.out.println("Cпpaвкa:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue\n");
        System.out.print("Bыбepитe (q to quit): ");
    }
}
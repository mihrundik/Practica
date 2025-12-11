package introduction_java.exercise4_1;

public class Help {

    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("Oпepaтop if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("J");
                break;
            case 'З':
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(init; условие; итерация}");
                System.out.println(" оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }

        System.out.println();
    }


    boolean isvalid(int ch) {
        return (ch >= '1' && ch <= '7') || ch == 'q';
    }
}

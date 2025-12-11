package introduction_java;

public class VehicleDemo {

    public static void main(String[] args) {
        Vehicle miniven = new Vehicle();
        Vehicle sportcar = new Vehicle();
        int range1, range2;

        miniven.passangers = 7;
        miniven.fuelcap = 16;
        miniven.mpg = 21;

        sportcar.passangers = 2;
        sportcar.fuelcap = 14;
        sportcar.mpg = 12;

        range1 = miniven.fuelcap * miniven.mpg;
        System.out.println("Мини-фургон может провезти " + miniven.passangers + " пассажиров на расстояние " + range1 + " миль");

        range2 = sportcar.fuelcap * sportcar.mpg;
        System.out.println("Мини-фургон может провезти " + sportcar.passangers + " пассажиров на расстояние " + range2 + " миль");

    }
}

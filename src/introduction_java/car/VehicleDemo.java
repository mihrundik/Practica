package introduction_java.car;

public class VehicleDemo {

    public static void main(String[] args) {


        Vehicle miniven = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);

        miniven.range();
        sportcar.range();

        double gallons;
        int dist = 252;

        gallons = miniven.fuelneeded(dist);
        System.out.println("для преодоления " + dist + " миль требуется " + gallons + " галлонов топлива");
        gallons = sportcar.fuelneeded(dist);
        System.out.println("для преодоления " + dist + " миль требуется " + gallons + " галлонов топлива");

    }
}

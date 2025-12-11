package introduction_java.car;

public class Vehicle {
    int passangers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m) {
        passangers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}

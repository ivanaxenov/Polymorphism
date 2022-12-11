package transport;

public class DriverC
        <T extends FreightCar>
        extends Driver {

    public DriverC(String driverFio, String possesionDriversLicense, float experience, FreightCar driverCar) {
        super(driverFio, possesionDriversLicense, experience, driverCar);
    }

    @Override
    public void startCarMoving() {
        System.out.println("Водитель нажал на газ");
        startCarMoving();
    }

    @Override
    public void stopCarMoving() {
        System.out.println("Водитель нажал на тормоз");
        stopCarMoving();
    }

    @Override
    public void refuelCar() {
        System.out.println("Водитель заправился");
        System.out.println("Водитель оплатил заправку");
    }

    @Override
    public String toString() {
        return "Водитель " + getDriverFio() + " управляет автомобилем " + carDriverInfo()
                + " и будет участвовать в заезде";
    }
}

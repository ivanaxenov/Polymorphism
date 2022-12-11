package transport;

public class DriverD
        <T extends Bus>
        extends Driver {

    public DriverD(String driverFio, String possesionDriversLicense, float experience, Bus driverCar) {
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

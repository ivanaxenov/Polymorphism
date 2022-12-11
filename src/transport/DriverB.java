package transport;


public class DriverB<T extends Car> extends Driver {
    public DriverB(String driverFio, String possesionDriversLicense, float experience, Car driverCar) {
        super(driverFio, possesionDriversLicense, experience, driverCar);
    }

    public DriverB(String driverFio, float experience, Transport driverCar) {
        super(driverFio, experience, driverCar);
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
    public boolean checkDriverLicence() {
        if (this.getPossesionDriversLicense() == null || this.getPossesionDriversLicense().isEmpty()
                || this.getPossesionDriversLicense().isBlank()) {
            return false;
        } else {
            return true;
        }
    }


    @Override
    public String toString() {
        return "Водитель " + getDriverFio() + " управляет автомобилем " + carDriverInfo()
                + " и будет участвовать в заезде";
    }
}

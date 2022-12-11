package transport;

public abstract class Driver {
    private String driverFio;
    private boolean possesionDriversLicense;
    private float experience;
    private Transport driverCar;

    public Driver(String driverFio, String possesionDriversLicense, float experience, Transport driverCar) {
        this.driverFio = driverFio;
        if (possesionDriversLicense == "есть") {
            this.possesionDriversLicense = true;
        }
        this.experience = experience;
        this.driverCar = driverCar;
    }

    public Driver(String driverFio, float experience, Transport driverCar) {
        this.driverFio = driverFio;
        this.experience = experience;
        this.driverCar = driverCar;
    }

    public abstract void startCarMoving();

    public abstract void stopCarMoving();

    public abstract void refuelCar();

    public abstract boolean checkDriverLicence();

    public String getDriverFio() {
        return driverFio;
    }

    public void setDriverFio(String driverFio) {
        if (driverFio != null && !driverFio.isEmpty() && !driverFio.isBlank()) {
            this.driverFio = driverFio;
        } else {
            driverFio = "unknown";
        }
    }
    public String getPossesionDriversLicense() {
        String str = "";
        if (possesionDriversLicense == true) {
            str += "Права есть!";
        }
        return str;
    }
    public void setPossesionDriversLicense(String possesionDriversLicense) {
        if (possesionDriversLicense == "есть") {
            this.possesionDriversLicense = true;
        } else {
            this.possesionDriversLicense = false;
        }
    }
    public Transport getDriverCar() {
        return driverCar;
    }
    public void setDriverCar(Car driverCar) {
        if (driverCar != null) {
            this.driverCar = driverCar;
        }
    }
    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        if (experience > this.experience) {
            this.experience = experience;
        }
    }

    public String carDriverInfo() {
        return driverCar.getBrand() + " " + driverCar.getModel();
    }
}

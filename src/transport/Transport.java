package transport;

import transportExeptions.TastedResult;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private float engineVolume;
    Set<Sponsor> sponsors;
    Set<Mechanic> mechanicTeam;
    String defalt = "default";

    public Transport(String brand, String model, float engineVolume) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = defalt;
        }
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = defalt;
        }
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public abstract void beTasted(Driver driver) throws TastedResult;

    public String mechanicTeamToString() {
        StringBuilder str = new StringBuilder();
        Iterator<Mechanic> iterator = this.getMechanicTeam().iterator();
        while (iterator.hasNext()) {
            Mechanic text = iterator.next();

            str.append(text.toString());
        }
        return str.toString();
    }

    public String sponsorListToString() {
        StringBuilder str = new StringBuilder();
        Iterator<Sponsor> iterator = this.getSponsors().iterator();
        while (iterator.hasNext()) {
            Sponsor text = iterator.next();

            str.append(text.toString());
        }
        return str.toString();
    }

    Set<Sponsor> getSponsors() {
        return sponsors;
    }

    void setSponsors(Set<Sponsor> sponsors) {
        this.sponsors = sponsors;
    }

    Set<Mechanic> getMechanicTeam() {
        return mechanicTeam;
    }

    void setMechanicTeam(Set<Mechanic> mechanicTeam) {
        this.mechanicTeam = mechanicTeam;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5f;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Float.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return brand + " " + model;
    }

}
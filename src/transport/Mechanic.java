package transport;


import java.util.HashSet;
import java.util.Set;

public class Mechanic<T extends Transport> {
    private String mechanicName;
    private String company;
    private Set<T> transports;

    public Mechanic(String mechanicName, String company) {
        this.mechanicName = mechanicName;
        this.company = company;
        this.transports = new HashSet<>();
    }

    public Set<T> getTransports() {
        return transports;
    }

    public void setTransports(Set<T> transports) {
        this.transports = transports;
    }

    public boolean carryOutMaintenance(Transport transport) {
        return true;
    }

    public boolean repairCar(Transport transport) {
        return true;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "mechanicName='" + mechanicName + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public String getMechanicName() {
        return mechanicName;
    }

    public void setMechanicName(String mechanicName) {
        this.mechanicName = mechanicName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
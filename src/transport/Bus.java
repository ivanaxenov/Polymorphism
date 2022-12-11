package transport;

import transportEnum.CapacityType;
import transportExeptions.TastedResult;

import java.util.HashSet;

public class Bus extends Transport implements Competing {

    private CapacityType capacityType;

    public Bus(String brand, String model, float engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
        this.sponsors = new HashSet<>();
        this.mechanicTeam = new HashSet<>(2);
    }

    public Bus(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.printf("%s %s начинает движение\n", getBrand(), getModel());
    }

    @Override
    public void stopMoving() {
        System.out.printf("%s %s заканчивает движение\n", getBrand(), getModel());
    }

    @Override
    public void printType() {
        if (capacityType != null) {
            System.out.println(capacityType.toString());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void beTasted(Driver driver) throws TastedResult {
        System.out.println("Автобус " + this.toString() + " в диагностике не требуется");
    }

    @Override
    public void pitStop() {
        System.out.printf("%s %s заехал на питстоп\n", getBrand(), getModel());
        System.out.printf("%s %s выехал с питстопа\n", getBrand(), getModel());
    }

    @Override
    public void bestTimeCircle() {
        System.out.printf("Лучшее время %s %s - %.3f\n", getBrand(), getModel(), (1 + Math.random() * 5));
    }

    @Override
    public void maxSpeed() {
        System.out.printf("Максимальная скорость %s %s - %.3f\n", getBrand(), getModel(), (100 + Math.random() * 200));
    }

    public void add(Mechanic<Bus> mechanic, Bus bus) {
        for (int i = 0; i < mechanic.getTransports().size(); i++) {
            if (mechanic.getTransports().contains(bus)) {
                bus.getMechanicTeam().add(mechanic);
            }
        }
    }

    public void add(Sponsor sponsor, Bus bus) {
        for (int i = 0; i < sponsor.getSponsors().size(); i++) {
            if (sponsor.getSponsors().contains(bus)) {
                bus.getSponsors().add(sponsor);
            }
        }
    }

    @Override
    public String toString() {
        return getBrand() + "  " + getModel() + ".";
    }
}

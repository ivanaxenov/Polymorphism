package transport;

import transportEnum.CapacityType;

public class Bus
        extends Transport
        implements Competing {
    private CapacityType capacityType;

    public Bus(String brand, String model, float engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
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

    @Override
    public String toString() {
        return getBrand() + "  " + getModel() + ".";
    }


}

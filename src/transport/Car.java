package transport;

import transportEnum.BodyType;
import transportExeptions.TastedResult;

import java.util.HashSet;

public class Car extends Transport implements Competing {

    private BodyType bodyType;

    public Car(String brand, String model, float engineVolume, BodyType bodyType) {
        super(brand, model, engineVolume);
        this.bodyType = bodyType;
        this.sponsors = new HashSet<>();
        this.mechanicTeam = new HashSet<>(2);
    }


    @Override
    public void startMoving() {
        System.out.printf("%s %s начинает движение \n", getBrand(), getModel());
    }
    @Override
    public void stopMoving() {
        System.out.printf("%s %s заканчивает движение\n", getBrand(), getModel());
    }

    @Override
    public void printType() {
        if (bodyType != null) {
            System.out.println(bodyType.toString());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    @Override
    public void beTasted(Driver driver) throws TastedResult {
        if (!driver.checkDriverLicence()) {
            throw new TastedResult("Необходимо указать тип прав!");
        } else {
            System.out.println("Все ОК!");
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

    public void add(Mechanic<Car> mechanic, Car car) {
        for (int i = 0; i < mechanic.getTransports().size(); i++) {
            if (mechanic.getTransports().contains(car)) {
                car.getMechanicTeam().add(mechanic);
            }
        }
    }

    public void add(Sponsor sponsor, Car car) {
        for (int i = 0; i < sponsor.getSponsors().size(); i++) {
            if (sponsor.getSponsors().contains(car)) {
                car.getSponsors().add(sponsor);
            }
        }
    }
}

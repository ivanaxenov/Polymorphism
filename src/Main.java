import transport.*;
import transportEnum.BodyType;
import transportEnum.CapacityType;
import transportEnum.LoadCapacity;
public class Main {
    public static void main(String[] args) {
        Car zhiguli = new Car("Лада", "Жигули", 1.6f, BodyType.SENAD);
        Car hyundai = new Car("Hyundai", "Solaris", 1.6f, BodyType.SENAD);
        Car nissan = new Car("Nissan", "Almera", 2.2f, BodyType.SENAD);
        FreightCar kamaz = new FreightCar("Камаз", "53605", 11.8f, LoadCapacity.N1);
        FreightCar ural = new FreightCar("УРАЛ", "М", 6.6f, LoadCapacity.N2);
        FreightCar volvo = new FreightCar("Volvo", "FH16", 16.1f, LoadCapacity.N3);
        Bus paz = new Bus("ПАЗ", "3205", 4.75f, CapacityType.MEDIUM);
        Bus mersedesBus = new Bus("Mercedes-Benz", "Sprinter", 3.0f, CapacityType.SMALL);
        Bus volkswagen = new Bus("Volkswagen", "Caddy", 2.0f, CapacityType.SMALL);

        zhiguli.startMoving();
        zhiguli.maxSpeed();
        zhiguli.pitStop();
        zhiguli.bestTimeCircle();
        zhiguli.stopMoving();
        kamaz.startMoving();
        kamaz.maxSpeed();
        kamaz.pitStop();
        kamaz.bestTimeCircle();
        kamaz.stopMoving();
        mersedesBus.startMoving();
        mersedesBus.maxSpeed();
        mersedesBus.pitStop();
        mersedesBus.bestTimeCircle();
        mersedesBus.stopMoving();

        DriverB<Car> dimon = new DriverB<>("Корнилов Дмитрий Алексеевич", "есть",
                3f, zhiguli);
        System.out.println(dimon.toString());
        DriverC<FreightCar> olezha = new DriverC<>("Леменцев Олег Иванович", "есть",
                10f, kamaz);
        System.out.println(olezha.toString());
        DriverD<Bus> kiruha = new DriverD<>("Родионов Кирилл Михайлович", "есть",
                7f, mersedesBus);
        System.out.println(kiruha.toString());

        zhiguli.printType();
        hyundai.printType();
        nissan.printType();
        kamaz.printType();
        ural.printType();
        volvo.printType();
        paz.printType();
        mersedesBus.printType();
        volkswagen.printType();
    }
}
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
        /**   DriverB<Car> dimon2 = new DriverB<>("Корнилов Дмитрий Алексеевич", "есть",
         3f, zhiguli);
         try {
         zhiguli.beTasted(dimon2);
         } catch (TastedResult e) {
         throw new RuntimeException(e);
         }
         DriverD<Bus> kiruha2 = new DriverD<>("Родионов Кирилл Михайлович",
         7f, mersedesBus);
         try {
         mersedesBus.beTasted(kiruha2);
         } catch (TastedResult e) {
         throw new RuntimeException(e);
         }
         DriverC<FreightCar> olezha2 = new DriverC<>("Леменцев Олег Иванович",
         10f, kamaz);
         try {
         nissan.beTasted(olezha2);
         } catch (TastedResult e) {
         throw new RuntimeException(e);
         }*/
        Mechanic<Car> kolia = new Mechanic<>("Коля Петров", "Компаниия - 1");
        kolia.getTransports().add(hyundai);
        hyundai.add(kolia, hyundai);
        System.out.println(hyundai.mechanicTeamToString());
        Mechanic<Car> dima = new Mechanic<>("Дима Иванов", "Компаниия - 2");
        Mechanic<Car> ilia = new Mechanic<>("Илья Сидоров", "Компаниия - 3");
        dima.getTransports().add(zhiguli);
        zhiguli.add(dima, zhiguli);
        nissan.add(ilia, nissan);
        // kolia.getTransports().add(kamaz);

        System.out.println(nissan.mechanicTeamToString());
        System.out.println(zhiguli.mechanicTeamToString());

        Sponsor hyundaiCompany = new Sponsor("Hyundai Company", 2_000_000);
        hyundaiCompany.getSponsors().add(hyundai);
        hyundai.add(hyundaiCompany, hyundai);
        System.out.println(hyundai.sponsorListToString());

        ServiceStation<Transport> one = new ServiceStation("One");
        one.addCar(hyundai);
        one.addCar(kamaz);
        one.addCar(paz);
        one.carryOutTechnicalInspection();
    }
}
public class Main {
    public static void main(String[] args) {
        Car zhiguli = new Car("Лада", "Жигули", 1.6f);
        Car hyundai = new Car("Hyundai", "Solaris", 1.6f);
        Car nissan = new Car("Nissan", "Almera", 2.2f);
        FreightCar kamaz = new FreightCar("Камаз", "53605", 11.8f);
        FreightCar uralaz = new FreightCar("УРАЛ", "М", 6.6f);
        FreightCar volvo = new FreightCar("Volvo", "FH16", 16.1f);
        Bus paz = new Bus("ПАЗ", "3205", 4.75f);
        Bus mersedesBus = new Bus("Mercedes-Benz", "Sprinter", 3.0f);
        Bus volkswagen = new Bus("Volkswagen", "Caddy", 2.0f);

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
    }
}
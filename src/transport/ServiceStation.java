package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<T extends Transport> {
    private String serviceName;

    public ServiceStation(String serviceName) {
        this.serviceName = serviceName;
    }

    public Queue<T> queue = new LinkedList<>();

    public void addCar(T transport) {
        Bus bus = new Bus("defalt", "defalt", 0f);
        if (transport.getClass().equals(bus.getClass()) == false) {
            queue.offer(transport);
        } else {
            System.out.println("Автобусы не нуждаются в тех обслуживании");
        }
    }

    public void carryOutTechnicalInspection() {
        T transport = queue.poll();
        if (transport != null) {
            System.out.println("Машина " + transport + "прошла техобсуживание");
            carryOutTechnicalInspection();
        }
    }
}
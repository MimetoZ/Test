package strategy;

public class Teleportation implements ArrivalStrategy {

    @Override
    public void arrival() {
        System.out.println("Arrival by Teleportation!");
    }
}

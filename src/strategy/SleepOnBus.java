package strategy;

public class SleepOnBus implements ArrivalStrategy{

    @Override
    public void arrival() {
        System.out.println("Arrival by Sleep On Bus!");
    }
}

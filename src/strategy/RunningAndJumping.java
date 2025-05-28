package strategy;

public class RunningAndJumping implements ArrivalStrategy {

    @Override
    public void arrival() {
        System.out.println("Arrival by Running And Jumping!");
    }
}

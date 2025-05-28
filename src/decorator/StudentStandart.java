package decorator;

import factory.Task;
import strategy.ArrivalStrategy;

public class StudentStandart implements Student {
    private String type;
    private ArrivalStrategy arrivalStrategy;

    public StudentStandart(String type, ArrivalStrategy arrivalStrategy) {
        this.type = type;
        this.arrivalStrategy = arrivalStrategy;
    }

    @Override
    public void giveTask(Task task) {
        System.out.print(type + ": ");
        task.description();
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void arrival() {
        arrivalStrategy.arrival();
    }

}

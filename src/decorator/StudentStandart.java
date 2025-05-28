package decorator;

import factory.Task;

public class StudentStandart implements Student {
    private String type;

    public StudentStandart(String type) {
        this.type = type;
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
}

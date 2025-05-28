package decorator;

import factory.Task;

public abstract class StudentDecorator implements Student {
    protected Student decorated;

    public StudentDecorator(Student decorated) {
        this.decorated = decorated;
    }

    public void giveTask(Task task) {
        decorated.giveTask(task);
    }

    public String getType() {
        return decorated.getType();
    }

    @Override
    public void arrival() {
        decorated.arrival();
    }
}

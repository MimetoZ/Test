package decorator;

import factory.Task;

public class Telepathy extends StudentDecorator{
    public Telepathy(Student student) {
        super(student);
    }

    public void giveTask(Task task) {
        super.giveTask(task);
        System.out.println("Telepathy added!");
    }
}

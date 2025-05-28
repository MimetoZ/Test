package decorator;

import factory.Task;

public class SuperFocus extends StudentDecorator{
    public SuperFocus(Student student) {
        super(student);
    }

    public void giveTask(Task task) {
        super.giveTask(task);
        System.out.println("Super Focus added!");
    }
}

package decorator;

import factory.Task;

public class FastWriting extends StudentDecorator{
    public FastWriting(Student student) {
        super(student);
    }

    public void giveTask(Task task) {
        super.giveTask(task);
        System.out.println("Fast Writing added!");
    }
}

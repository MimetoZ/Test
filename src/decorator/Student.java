package decorator;

import factory.Task;

public interface Student {
    void giveTask(Task task);
    String getType();
    void arrival();
}

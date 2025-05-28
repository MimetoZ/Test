package singleton;

import decorator.Student;
import factory.Task;
import factory.TaskFactory;

public class UniversitySingleton {
    private static UniversitySingleton instance;

    private UniversitySingleton() {
        System.out.println("University Exists");
    }

    public static UniversitySingleton getInstance() {
        if (instance == null) {
            instance = new UniversitySingleton();
        }
        return instance;
    }

    public void start(Student student) {
        Task task = TaskFactory.createTask(student.getType());
        student.giveTask(task);
    }
}

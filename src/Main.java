import decorator.*;
import singleton.UniversitySingleton;
import strategy.ArrivalStrategy;
import strategy.RunningAndJumping;
import strategy.SleepOnBus;
import strategy.Teleportation;

public class Main {
    public static void main(String[] args) {
        UniversitySingleton university = UniversitySingleton.getInstance();

        // Студент 1: вундеркинд със суперсила и стратегия
        Student student1 = new SuperFocus(new StudentStandart("вундеркинд"));
        ArrivalStrategy arrival1 = new RunningAndJumping();
        arrival1.arrival();
        university.start(student1);

        System.out.println();

        // Студент 2: фитнес маниак със суперсили
        Student student2 = new FastWriting(new Telepathy(new StudentStandart("фитнес маниак")));
        ArrivalStrategy arrival2 = new Teleportation();
        arrival2.arrival();
        university.start(student2);

        System.out.println();

        // Студент 3: калитко без суперсили
        Student student3 = new StudentStandart("калитко");
        ArrivalStrategy arrival3 = new SleepOnBus();
        arrival3.arrival();
        university.start(student3);
    }
}
import decorator.*;
import singleton.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        UniversitySingleton university = UniversitySingleton.getInstance();

        // Студент 1: вундеркинд със суперсила и пристигане
        ArrivalStrategy arrival1 = new RunningAndJumping();
        Student student1 = new SuperFocus(new StudentStandart("вундеркинд", arrival1));
        student1.arrival();
        university.start(student1);

        System.out.println();

        // Студент 2: фитнес маниак със суперсили и пристигане
        ArrivalStrategy arrival2 = new Teleportation();
        Student student2 = new FastWriting(new Telepathy(new StudentStandart("фитнес маниак", arrival2)));
        student2.arrival();
        university.start(student2);

        System.out.println();

        // Студент 3: калитко без суперсили, пристига след спане в автобус
        ArrivalStrategy arrival3 = new SleepOnBus();
        Student student3 = new StudentStandart("калитко", arrival3);
        student3.arrival();
        university.start(student3);
    }
}
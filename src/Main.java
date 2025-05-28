import decorator.*;
import singleton.*;
import strategy.*;

public class Main {
    public static void main(String[] args) {
        UniversitySingleton university = UniversitySingleton.getInstance();

        ArrivalStrategy arrival1 = new RunningAndJumping();
        Student student1 = new SuperFocus(new StudentStandart("вундеркинд", arrival1));
        university.start(student1);

        System.out.println();

        ArrivalStrategy arrival2 = new Teleportation();
        Student student2 = new FastWriting(new Telepathy(new StudentStandart("фитнес маниак", arrival2)));
        university.start(student2);

        System.out.println();

        ArrivalStrategy arrival3 = new SleepOnBus();
        Student student3 = new StudentStandart("калитко", arrival3);
        university.start(student3);

        System.out.println();


    }
}
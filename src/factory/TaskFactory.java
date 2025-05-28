package factory;

public class TaskFactory {
    public static Task createTask(String typeOfStudent) {
        switch (typeOfStudent) {
            case "вундеркинд": return new FunTask();
            case "фитнес маниак": return new HardTask();
            case "калитко": return new EasyTask();
            default: throw new IllegalArgumentException("Неизвестен тип студент.");
        }
    }
}

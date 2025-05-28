package factory;

public class TaskFactory {
    public static Task createTask(String typeOfStudent) {
        return switch (typeOfStudent) {
            case "вундеркинд" -> new FunTask();
            case "фитнес маниак" -> new HardTask();
            case "калитко" -> new EasyTask();
            default -> throw new IllegalArgumentException("Not a student type!");
        };
    }
}

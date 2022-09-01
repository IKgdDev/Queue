import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private final static int MAX_PERSON_COUNT = 5;
    private final static int MAX_TICKETS_COUNT = 5;
    private static String[] names = {"Oleg", "Misha", "Grisha", "Maksim", "Petya", "Lesha"};
    private static String[] surnames = {"Petrov", "Ivanov", "Sidorov", "Kozlov", "Dolgov", "Bobrov"};

    public static void main(String[] args) {
        
    }

    public static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < MAX_PERSON_COUNT; i++) {
            Person person = new Person(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], random.nextInt(MAX_TICKETS_COUNT));
            list.add(person);
        }
        return list;
    }
}

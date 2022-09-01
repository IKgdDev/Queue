import java.util.*;

public class Main {
    private final static int MAX_PERSON_COUNT = 5;
    private final static int MAX_TICKETS_COUNT = 2;
    private static String[] names = {"Oleg", "Misha", "Grisha", "Maksim", "Petya", "Lesha"};
    private static String[] surnames = {"Petrov", "Ivanov", "Sidorov", "Kozlov", "Dolgov", "Bobrov"};
    private static Random random = new Random();

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();

        for (Person client : generateClients()) {
            queue.offer(client);
        }

        while (!queue.isEmpty()) {
            Person client = queue.poll();
            System.out.println(client.getName() + " " + client.getSurname() + " прокатился на аттракционе.");
            client.spendTicket();
            if (client.getTicketCount() != 0) {
                queue.offer(client);
            }
        }
    }

    private static List<Person> generateClients() {
        List<Person> list = new ArrayList<>();

        for (int i = 0; i < MAX_PERSON_COUNT; i++) {
            Person client = new Person(
                    names[random.nextInt(names.length)],
                    surnames[random.nextInt(surnames.length)],
                    randInt(1, MAX_TICKETS_COUNT));
            list.add(client);
        }
        return list;
    }

    private static int randInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }
}

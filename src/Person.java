public class Person {
    private String name;
    private String surname;
    private int ticketCount;

    public Person(String name, String surname, int ticketCount) {
        this.name = name;
        this.surname = surname;
        this.ticketCount = ticketCount;
    }

    public int getTicketCount(){
        return ticketCount;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void spendTicket(){
        ticketCount--;
    }

}

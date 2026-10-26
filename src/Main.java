public class Main {
    public static void main(String[] args) {
        System.out.println("=== HELP DESK ===");

        Customer customer = new Customer(1, "Анна Петрова", "anna@mail.ru");
        SupportAgent agent = new SupportAgent(2, "Сергей Иванов", "sergey@helpdesk.ru");

        Ticket ticket = new Ticket(
                1,
                "Не работает Wi-Fi",
                "Не удаётся подключиться к сети"
        );

        System.out.println("Клиент: " + customer.getName());
        System.out.println("Заявка #" + ticket.getId() + ": "
                + ticket.getTitle() + " | " + ticket.getStatus());

        ticket.startProcessing();
        System.out.println("Статус: " + ticket.getStatus());

        ticket.resolve();
        System.out.println("Статус: " + ticket.getStatus());

        ticket.close();
        System.out.println("Статус: " + ticket.getStatus());

        System.out.println();
        customer.performAction();
        agent.performAction();

        Administrator administrator =
                new Administrator(3, "Олег", "admin@helpdesk.ru");
        administrator.performAction();
    }
}

public class Main {
    public static void main(String[] args) {
        int ticketPrice = 13676; //стоимость билета
        int milesRub = 20; //сумма равная 1 миле

        int bonus = ticketPrice/milesRub;

        System.out.println("Количество бонусных миль:" + bonus);
    }
}
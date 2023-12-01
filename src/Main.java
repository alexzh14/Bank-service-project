public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма: 1 000 000 рублей; Процентная ставка: 9,99 %; Срок: 1 год;");
        System.out.println("Сумма ежемесячного платежа:" + service.calculate(1_000_000, 9.99, 1));

        System.out.println();
        System.out.println("Сумма: 1 000 000 рублей; Процентная ставка: 9,99 %; Срок: 2 года;");
        System.out.println("Сумма ежемесячного платежа:" + service.calculate(1_000_000, 9.99, 2));

        System.out.println();
        System.out.println("Сумма: 1 000 000 рублей; Процентная ставка: 9,99 %; Срок: 3 года;");
        System.out.println("Сумма ежемесячного платежа:" + service.calculate(1_000_000, 9.99, 3));
    }
}

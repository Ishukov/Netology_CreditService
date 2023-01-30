public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit; // Сумма кредита
        double percent; // Процентная ставка
        int years; // Срок кредитования
        int payment; // Ежемесячный платеж

        // Первый расчет
        credit = 1000000;
        percent = 9.99;
        years = 1;
        payment = service.calculate(credit, percent, years);
        System.out.println("Ежемесячный платеж на 1 год составит: " + payment + " руб.");

        // Второй расчет
        credit = 1000000;
        percent = 9.99;
        years = 2;
        payment = service.calculate(credit, percent, years);
        System.out.println("Ежемесячный платеж на 2 года составит: " + payment + " руб.");

        // Третий расчет
        credit = 1000000;
        percent = 9.99;
        years = 3;
        payment = service.calculate(credit, percent, years);
        System.out.println("Ежемесячный платеж на 3 года составит: " + payment + " руб.");
    }
}
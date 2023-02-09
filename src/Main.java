public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double sum = 1_000_000;
        double month = 24;
        double percent = 9.99;

        double payInMonth = service.calculate(sum, month, percent);
        System.out.printf("%.2f", payInMonth);
    }
}
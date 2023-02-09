public class CreditPaymentService {
    public double calculate(double sum, double month, double percent) {

        double i = ((percent * 0.01) / 12);
        double payInMonth = sum * (Math.pow((1 + i), month) * i) / ((Math.pow((1 + i), month)) - 1);

        return payInMonth;
    }
}

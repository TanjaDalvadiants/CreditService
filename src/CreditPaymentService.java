public class CreditPaymentService {
    public double calculate(double sum , double month, double percent) {


        double k = (percent / month) * 0.01;
        double k2 = k + 1;

        double payInMonth = sum * k * Math.pow (k2, month ) / (Math.pow (k2, month ) - 1);
        return payInMonth;


    }
}

public class CreditPaymentService {
    //k – сумма кредита, p – процентная ставка, y – количество лет
    public int calculate(double credit, double percent, int years) {
        int m = years * 12;
        double monthPercent = ((percent / 12) / 100);
        double pow = Math.pow((1 + monthPercent), m);
        int result = (int) (credit * ((monthPercent * pow) / (pow - 1)));

        return result;
    }
}

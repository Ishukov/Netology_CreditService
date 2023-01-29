public class CreditPaymentService {
    //k – сумма кредита, p – процентная ставка, y – количество лет
    public int calculate(double k, double p, int y) {
        int m = y*12;
        double monthPercent = ((p/12)/100);
        double pow = Math.pow((1 + monthPercent), m);
        int result = (int) (k * ((monthPercent * pow) / (pow - 1)));

        return result;
    }
}

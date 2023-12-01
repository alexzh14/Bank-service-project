public class CreditPaymentService {
    public int calculate(int creditMass, double interestRate, int creditTermYear) {
        int creditTermMonth = creditTermYear * 12;
        double interestRatePerMonth = interestRate / 1200;
        double lowPartOne = Math.pow(1 + interestRatePerMonth, -creditTermMonth);
        double lowPartTwo = 1 - lowPartOne;
        double creditPayRaw = creditMass * interestRatePerMonth / lowPartTwo;
        return (int) creditPayRaw;
    }
}

package the.tax.pkgclass;

class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {}

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax() {
        double tax = 0;
        for (int i = 0; i < brackets[filingStatus].length; i++) {
            if (i == brackets[filingStatus].length - 1) {
                tax += rates[i] * (taxableIncome - brackets[filingStatus][i]);
            } else if (taxableIncome > brackets[filingStatus][i]) {
                tax += rates[i] * (brackets[filingStatus][i + 1] - brackets[filingStatus][i]);
            }
        }
        return tax;
    }
}

public class TestTax {
    public static void main(String[] args) {
        int[][] brackets2001 = {
            {27050, 65550, 136750, 297350},
            {45200, 109250, 166500, 297350},
            {22600, 54625, 83250, 148675},
            {36250, 93650, 151650, 297350}
        };
        
        double[] rates2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

        Tax tax = new Tax(Tax.SINGLE_FILER, brackets2001, rates2001, 50000);
        System.out.println("Tax: " + tax.getTax());
    }
}
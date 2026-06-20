package bigintegerandbigdicemal;
import java.math.BigInteger;
import java.math.BigDecimal;

public class LargeFactorial {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("9223372036854775807");
        BigInteger b = new BigInteger("2");
        BigInteger c = a.multiply(b);
        System.out.println("BigInteger multiplication: " + c);
        
        BigDecimal d = new BigDecimal(1.0);
        BigDecimal e = new BigDecimal(3);
        BigDecimal f = d.divide(e, 20, BigDecimal.ROUND_UP);
        System.out.println("BigDecimal division: " + f);
        
        System.out.println("Factorial of 100: " + factorial(100));
    }
    
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
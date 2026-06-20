package test.my.integer;
 public class TestMyInteger {
    public static void main(String[] args) {
        MyInteger n = new MyInteger(7);
        System.out.println("Value: " + n.getValue());
        System.out.println("Is even: " + n.isEven());
        System.out.println("Is odd: " + n.isOdd());
        System.out.println("Is prime: " + n.isPrime());
        System.out.println("Equals 7: " + n.equals(7));
        System.out.println("Parse int: " + MyInteger.parseInt("123"));
    }

}

 class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() { return value; }

    public boolean isEven() { return value % 2 == 0; }
    public boolean isOdd() { return value % 2 != 0; }
    
    public boolean isPrime() {
        if (value < 2) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(int n) { return n % 2 == 0; }
    public static boolean isOdd(int n) { return n % 2 != 0; }
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isEven(MyInteger n) { return n.isEven(); }
    public static boolean isOdd(MyInteger n) { return n.isOdd(); }
    public static boolean isPrime(MyInteger n) { return n.isPrime(); }

    public boolean equals(int n) { return value == n; }
    public boolean equals(MyInteger n) { return value == n.value; }

    public static int parseInt(char[] chars) {
        return Integer.parseInt(new String(chars));
    }

    public static int parseInt(String s) {
        return Integer.parseInt(s);
    }
   
}

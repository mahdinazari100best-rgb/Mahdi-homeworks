package the.stock.pkgclass;
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String s, String n) {
        symbol = s;
        name = n;
    }

    double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;
        System.out.println("Price-change percentage: " + stock.getChangePercent() + "%");
    }
}
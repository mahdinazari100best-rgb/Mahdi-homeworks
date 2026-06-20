package use.the.gregoriancalendar.pkgclass;
import java.util.GregorianCalendar;

public class UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();
        
        System.out.println("Current date:");
        System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
        
        cal.setTimeInMillis(1234567898765L);
        System.out.println("\nDate after setting time:");
        System.out.println("Year: " + cal.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + cal.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
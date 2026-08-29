//Filename NumericConversion2.java
//Written by Diana Grace Batara
// BSIT NETSEC 1-2
// WRITTEN ON AUGUST 22, 2026

public class NumericConversion2 {
    public static void main(String[] args) {
        int hoursWorked = 37;
        double payRate = 4.50;
        int grossPay = (int) (hoursWorked * payRate);

        System.out.println("Gross pay is " + grossPay);
    }
}
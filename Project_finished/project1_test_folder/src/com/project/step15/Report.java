package com.project.step15;

public class Report {
    /*
    - step 13
     */
    public static String headerLine(String name) {
        return "Rentals: " + name + "\n";
    }
    /*
    - step 13
     */
    public static String footerLine(double totalAmount, int frequentRenterPoints) {
        String result = "Total = $" + totalAmount + "\n";
        result += "Frequent renter points = " + frequentRenterPoints + "\n";
        return result + "---\n";
    }
    /*
    - step 14
     */
    public String rentalLine(int daysRented, String title, double charge) {
        return daysRented + " days of '" + title + "' $" + String.valueOf(charge) + "\n";
    }
}

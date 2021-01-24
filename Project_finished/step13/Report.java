package com.project.step13;

public class Report {
    /*
    - step 13
    - extract headerLine into a Report class
     */
    public static String headerLine(String name) {
        return "Rentals: " + name + "\n";
    }
    /*
    - step 13
    - extract footerLine method into Report class
     */
    public static String footerLine(double totalAmount, int frequentRenterPoints) {
        String result = "Total = $" + totalAmount + "\n";
        result += "Frequent renter points = " + frequentRenterPoints + "\n";
        return result + "---\n";
    }
}

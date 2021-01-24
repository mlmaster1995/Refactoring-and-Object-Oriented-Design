package com.project.step17;
/*
- step 16
 */
public interface Report {
    public String headerLine(String name);
    public String footerLine(double totalAmount, int frequentRenterPoints);
    public String rentalLine(int daysRented, String title, double charge);
}

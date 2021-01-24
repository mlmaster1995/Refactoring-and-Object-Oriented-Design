package com.project.step16;
/*
- step 16
- Report interface
 */
public interface Report {
    public String headerLine(String name);
    public String footerLine(double totalAmount, int frequentRenterPoints);
    public String rentalLine(int daysRented, String title, double charge);
}

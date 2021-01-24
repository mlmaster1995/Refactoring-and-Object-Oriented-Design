package com.project.step16;

    /*
	- step 16
    - change Report class to an interface and implemented by TaxReport Class
 	*/
public class TaxReport implements Report {
    /*
    - step 13
     */
    public String headerLine(String name) {
        return "Rentals: " + name + "\n";
    }
    /*
    - step 13
     */
    public String footerLine(double totalAmount, int frequentRenterPoints) {
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

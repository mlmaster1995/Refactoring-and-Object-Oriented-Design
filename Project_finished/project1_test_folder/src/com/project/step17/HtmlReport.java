package com.project.step17;

/*
step 17
- HtmlReport class implements Report Interface
- override Report method in the new class
 */
public class HtmlReport implements Report {
    @Override
    public String headerLine(String name) {
        return "<html><head><title>Rentals: " + name + "</title>" +
                "</head><body>\n"+ "<h1>Rentals: " + name + "</h1>\n"+
                "<table border=1><tr><th>Days</th><th>Title</th><th>" +
                "Charge</th></tr>\n";
    }

    @Override
    public String footerLine(double totalAmount, int frequentRenterPoints) {
        return "<tr><td></td><td><i>total</i><td align=right>$"+ totalAmount
                +"</td></tr>\n"+"</table><p>Frequent renter points = "+
                frequentRenterPoints +"</p>\n</body></html>\n";
    }

    @Override
    public String rentalLine(int daysRented, String title, double charge) {
        return "<tr><td align=right>"+daysRented + "</td><td>" + title + "<td align=right>$" + charge + "</td></tr>\n";
    }
}

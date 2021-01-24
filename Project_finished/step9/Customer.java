import java.util.*;

public class Customer {
    private String name;
    private List rentals = new ArrayList();
    public Customer(String name) {
	this.name = name;
    }
    /*
    methods
    - step1
    - private double chargeForRental(Rental rental_object) to calculate the charge for each particular rental
    - step2
    - change name each to rental and thisAmount to charge
    - step5
    - extract frequentRenterPoints method to Rental class
    - step 7
    - rename Rental each to Rental rental; change while loop to for loop
    - step 9
    - extract rentalLine method 
     */
    public String getName() {return name;}
    public void addRental(Rental arg) {rentals.add(arg);}
    public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;

		String result = "Rentals: " + getName() + "\n";
		/*
		 - step 7
		 - change while loop to for loop
		 */
		for (Iterator rentalIterator = rentals.iterator(); rentalIterator.hasNext();) {
			double charge = 0;
			Rental rental = (Rental) rentalIterator.next();
			/*
			 - accumulate each rental charge
			*/
			charge += rental.charge();
			/*
			 - step 5
			 - get frequentRenterPoints
			*/
			frequentRenterPoints += rental.frequentRenterPoints();
			/*
			- step 9
			- generate rental line method
			 */
			result += rentalLine(charge, rental);
			// sum total amount
			totalAmount += charge;
		}
		//add footer lines
		result += "Total = $" + totalAmount + "\n";
		result += "Frequent renter points = " + frequentRenterPoints + "\n";
		return result + "---\n";
    }

    /*
     - step 9 method
     */
	private String rentalLine(double thisAmount, Rental rental) {
		return rental.getDaysRented() + " days of '" + rental.getMovie().getTitle() +
		"' $" + String.valueOf(thisAmount) + "\n";
	}

}


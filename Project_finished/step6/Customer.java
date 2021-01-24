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
    - step3
    - move chargeForRental method from Customer to Rental class
    - rename it as charge() as a public method in Rental class
    - step5
    - extract frequentRenterPoints method to Rental class
     */
    public String getName() {return name;}
    public void addRental(Rental arg) {rentals.add(arg);}
    public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator rentalIterator = rentals.iterator();
		String result = "Rentals: " + getName() + "\n";

		while (rentalIterator.hasNext()) {
			double charge = 0;
			/*
			- step 2
			 */
			Rental rental = (Rental) rentalIterator.next();
			/*
			- step 1
			- step 2
			- step 3
			 */
			charge += rental.charge();
			/*
			 - step 5
			 */
			frequentRenterPoints += rental.frequentRenterPoints();
			//show figures for this rental
			result += rental.getDaysRented() + " days of '" + rental.getMovie().getTitle() +
			"' $" + String.valueOf(charge) + "\n";
			// sum total amount
			totalAmount += charge;
		}
		//add footer lines
		result += "Total = $" + totalAmount + "\n";
		result += "Frequent renter points = " + frequentRenterPoints + "\n";
		return result + "---\n";
    }

}


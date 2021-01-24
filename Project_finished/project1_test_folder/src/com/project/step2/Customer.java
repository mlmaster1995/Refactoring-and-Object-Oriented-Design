package com.project.step2;

import java.util.*;

public class Customer {
    private String name;
    private List rentals = new ArrayList();
    public Customer(String name) {
	this.name = name;
    }
    /*
    methods
    - step 1
    - private double chargeForRental(Rental rental_object) to calculate the charge for each particular rental
    - step 2
    - change name each to rental and thisAmount to charge
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
			- change name each to rental
			 */
			Rental rental = (Rental) rentalIterator.next();
			/*
			- step 1
			- step 2
			- change thisAmount to charge
			 */
			charge += chargeForRental(rental);
			frequentRenterPoints ++;
			if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
			rental.getDaysRented() > 1) frequentRenterPoints ++;
			result += rental.getDaysRented() + " days of '" + rental.getMovie().getTitle() +
			"' $" + String.valueOf(charge) + "\n";
			totalAmount += charge;
		}

		result += "Total = $" + totalAmount + "\n";
		result += "Frequent renter points = " + frequentRenterPoints + "\n";
		return result + "---\n";
    }
	/*
   		- step 1
   	*/
	private double chargeForRental(Rental rental) {
		double charge =0;
		switch (rental.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				charge += 2;
				if (rental.getDaysRented() > 2)
					charge += (rental.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				charge += rental.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				charge += 1.5;
				if (rental.getDaysRented() > 3)
					charge += (rental.getDaysRented() - 3) * 1.5;
				break;
		}
		return charge;
	}
}


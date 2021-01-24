package com.project.step1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Customer {
    private String name;
    private List rentals = new ArrayList();
    public Customer(String name) {
	this.name = name;
    }
    /*
    methods
    - step1
    - add private double chargeForRental(Rental rental_object) to calculate the charge for each particular rental
     */
    public String getName() {return name;}
    public void addRental(Rental arg) {rentals.add(arg);}
    public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		Iterator rentalIterator = rentals.iterator();
		String result = "Rentals: " + getName() + "\n";
		while (rentalIterator.hasNext()) {
			double thisAmount = 0;
			Rental each = (Rental) rentalIterator.next();
			/*
			- step 1
			- add private double chargeForRental(Rental rental_object) to calculate the charge for each particular rental
			 */
			thisAmount += chargeForRental(each);
			frequentRenterPoints ++;
			if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
				frequentRenterPoints ++;
			result += each.getDaysRented() + " days of '" + each.getMovie().getTitle() +
			"' $" + String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		result += "Total = $" + totalAmount + "\n";
		result += "Frequent renter points = " + frequentRenterPoints + "\n";
		return result + "---\n";
    }

    /*
     - step 1
     - add private double chargeForRental(Rental rental_object) to calculate the charge for each particular rental
     */
	private double chargeForRental(Rental rental) {
		double rentalCharge =0;
		switch (rental.getMovie().getPriceCode()) {
			case Movie.REGULAR:
				rentalCharge += 2;
				if (rental.getDaysRented() > 2)
					rentalCharge += (rental.getDaysRented() - 2) * 1.5;
				break;
			case Movie.NEW_RELEASE:
				rentalCharge += rental.getDaysRented() * 3;
				break;
			case Movie.CHILDRENS:
				rentalCharge += 1.5;
				if (rental.getDaysRented() > 3)
					rentalCharge += (rental.getDaysRented() - 3) * 1.5;
				break;
		}
		return rentalCharge;
	}
}


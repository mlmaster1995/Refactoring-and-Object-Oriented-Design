package com.project.step12;

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
    - step 10
    - move rentalLine to Rental class
    - step 11
    - extract the headlerLine() method
    - step12
    - extract the footerLine() method
     */
    public String getName() {return name;}
    public void addRental(Rental arg) {rentals.add(arg);}
    public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		/*
		- step 11
		 */
		String result = headerLine(getName());
		/*
		 - step 7
		 */
		for (Iterator rentalIterator = rentals.iterator(); rentalIterator.hasNext();) {
			double charge = 0;
			Rental rental = (Rental) rentalIterator.next();
			/*
			 - accumulate each rental charge
			*/
			charge += rental.charge();
			/*
			 - step5
			*/
			frequentRenterPoints += rental.frequentRenterPoints();
			/*
			- step 9
			 */
			result += rental.rentalLine();
			totalAmount += charge;
		}
		/*
		- step 12
		 */
		return result + footerLine(totalAmount, frequentRenterPoints);
    }

	/*
	- step 11
	- extract the header line method
	*/
	private String headerLine(String name) {
		return "Rentals: " + name + "\n";
	}
	/*
	- step12
	- extract footerLine method
	 */
	private String footerLine(double totalAmount, int frequentRenterPoints) {
		String result = "Total = $" + totalAmount + "\n";
		result += "Frequent renter points = " + frequentRenterPoints + "\n";
		return result + "---\n";
	}
}


package com.project.step14;

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
    - step13
    - extract headerLine and footerLine to Report class
    - step14
    - extract rentalLine() to Report class
     */
    public String getName() {return name;}
    public void addRental(Rental arg) {rentals.add(arg);}
    public String statement() {
		double totalAmount = 0;
		int frequentRenterPoints = 0;
		/*
		- step 13
		 */
		Report report = new Report();
		/*
		- step 11
		 */
		String result = report.headerLine(getName());
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
			 - step 5
			*/
			frequentRenterPoints += rental.frequentRenterPoints();
			/*
			- step 9
			- step 14
    		- extract rentalLine() to Report class
			 */
			result += rental.rentalLine(report);
			totalAmount += charge;
		}
		/*
		- step 12
		 */
		return result + report.footerLine(totalAmount, frequentRenterPoints);
    }
}


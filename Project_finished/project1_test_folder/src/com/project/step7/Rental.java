package com.project.step7;

public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
	    this.movie = movie;
	    this.daysRented = daysRented;
    }
    /*
     - methods
     - step3
     - move chargeForRental method to Rental class
     - rename it as charge() as a public method in Rental class
     - step4
     - refactor charge() method and move the logic into Moive class
     - step5
     - extract frequentRenterPoints() from Customer class
     - step 6
     - move isNewRealse() to  Moive class
     */
    public int getDaysRented() {
	return daysRented;
    }
    public Movie getMovie() {
	return movie;
    }

    /*
     - step3
     - new method moved from customer class
     */
    public double charge() {
        return this.movie.charge(this.daysRented);
    }
    /*
    - step5
    - new method is extracted from customer class
    - step 6
    - move priceCode test to the Movie class
    */
    public int frequentRenterPoints() {
        int frequentRenterPoints =0;
        // add frequent renter points
        frequentRenterPoints++;
         // add bonus for a two day new release rental
        if ((this.movie.isNewRelease()) &&
                this.daysRented > 1) frequentRenterPoints ++;
        return frequentRenterPoints;
    }


}


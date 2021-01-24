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
     - extract frequentRenterPoints() from Customer class to Rental class
     */
    public int getDaysRented() {
	return daysRented;
    }
    public Movie getMovie() {
	return movie;
    }

    /*
     - step 4
     */
    public double charge() {
        return this.movie.charge(this.daysRented);
    }
    /*
    - step 5
    - new method is extracted from customer class
    */
    public int frequentRenterPoints() {
        int frequentRenterPoints =0;
        // add frequent renter points
        frequentRenterPoints++;
         // add bonus for a two day new release rental
        if ((this.movie.getPriceCode() == Movie.NEW_RELEASE) &&
                this.daysRented > 1) frequentRenterPoints ++;
        return frequentRenterPoints;
    }


}


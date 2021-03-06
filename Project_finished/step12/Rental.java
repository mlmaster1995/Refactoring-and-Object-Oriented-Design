public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
	    this.movie = movie;
	    this.daysRented = daysRented;
    }
    /*
     - methods
     - step 3
     - move chargeForRental method to Rental class
     - rename it as charge() as a public method in Rental class
     - step 4
     - refactor charge() method and move the logic into Moive class
     - step 5
     - extract frequentRenterPoints() from Customer class
     - step 6
     - move isNewRealse() to  Moive class
     - step 10
     - move rentalLine method to Rental class
     */
    public int getDaysRented() {
	return daysRented;
    }
    public Movie getMovie() {
	return movie;
    }
    /*
     - step3
     */
    public double charge() {
        return this.movie.charge(this.daysRented);
    }
    /*
    - step5
    - step6
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

    /*
    - step 10
     */
    public String rentalLine() {
		return this.daysRented + " days of '" + this.movie.getTitle() +
		"' $" + String.valueOf(this.charge()) + "\n";
	}
}


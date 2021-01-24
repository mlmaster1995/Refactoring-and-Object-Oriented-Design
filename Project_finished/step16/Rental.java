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
     - step 10
     - move rentalLine method to Rental class
     - step 14
     - extract rentalLine() to Report class
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
    - step 6
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
     - step 14
     */
    public String rentalLine(Report report) {
        return report.rentalLine(this.daysRented, this.movie.getTitle(),this.charge());
	}
}


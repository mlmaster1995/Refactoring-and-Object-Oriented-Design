public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
	    this.movie = movie;
	    this.daysRented = daysRented;
    }
    /*
     - step 3
     - move chargeForRental method to Rental class
     - rename it as charge() as a public method in Rental class
     - step 4
     - refactor charge() method and move the logic into Moive class
     */
    public int getDaysRented() {
	return daysRented;
    }
    public Movie getMovie() {
	return movie;
    }

    /*
     - step 3
     - step 4
     - refactor charge() method and move the logic into Moive class
     */
    public double charge() {
        return this.movie.charge(this.daysRented);
    }
}


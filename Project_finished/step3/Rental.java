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
     - rename it as charge() as a public method in Rental class
     */
    public double charge() {
        double charge = 0;
        switch (this.movie.getPriceCode()) {
            case Movie.REGULAR:
                charge += 2;
                if (this.daysRented > 2)
                    charge += (this.daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                charge += this.daysRented * 3;
                break;
            case Movie.CHILDRENS:
                charge += 1.5;
                if (this.daysRented > 3)
                    charge += (this.daysRented - 3) * 1.5;
                break;
        }
        return charge;
    }
}


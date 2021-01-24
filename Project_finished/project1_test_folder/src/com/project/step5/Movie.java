package com.project.step5;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
	this.title = title;
	this.priceCode = priceCode;
    }
    /*
     - step4
     - methods
     - add charge() method in the Movie class to return the moive charge fees
     */
    public int getPriceCode() {
	return priceCode;
    }
    public void setPriceCode(int arg) {
	priceCode = arg;
    }
    public String getTitle() {
	return title;
    }

    // step 4
    public double charge(int daysRented){
        double charge = 0;
        switch (this.priceCode) {
            case Movie.REGULAR:
                charge += 2;
                if (daysRented > 2)
                    charge += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                charge += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                charge += 1.5;
                if (daysRented > 3)
                    charge += (daysRented - 3) * 1.5;
                break;
        }
        return charge;
    }
}

package refactordemo;
public class Movie  {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String name, int priceCode) {
        _title = name;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void  setPriceCode(int newPrice){
        _priceCode = newPrice;
    }

    public String getTitle(){
        return _title;
    }

	double getPrice(int daysRented) {
		double thisAmount = 0;
		switch (_priceCode) {
		case Movie.REGULAR:
			thisAmount += 2;
			if (daysRented > 2)
				thisAmount += (daysRented - 2) * 1.5;
			break;
		case Movie.NEW_RELEASE:
			thisAmount += daysRented * 3;
			break;
		case Movie.CHILDRENS:
			thisAmount += 1.5;
			if (daysRented > 3)
				thisAmount += (daysRented - 3) * 1.5;
			break;
		}
		return thisAmount;
	}

	int getPoints(int daysRented) {
		int frequentRenterPoints=1;
	
		// add bonus for a two day new release rental
		if ((_priceCode == Movie.NEW_RELEASE) && daysRented > 1)
			frequentRenterPoints++;
		// show figures for this rental
		return frequentRenterPoints;
	}

}

package refactordemo;

public interface Price {
    public int getPriceCode();
    public double getPrice(int daysRented);
}

class ChildrensPrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getPrice(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }
}

class NewReleasePrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    public double getPrice(int daysRented) {
        return daysRented * 3;
    }
}

class RegularPrice implements Price {
    @Override
    public int getPriceCode() {
        return Movie.REGULAR;
    }

    @Override
    public double getPrice(int daysRented) {
        double result = 2;
        if (daysRented > 2){
            result += (daysRented - 2) * 1.5;}
        return result;
    }
}


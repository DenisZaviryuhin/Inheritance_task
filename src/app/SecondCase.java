package app;


public class SecondCase extends FirstCase {


    double tax;


    public SecondCase(double rate, double win, double tax) {
        super(rate, win);
        this.tax = tax;
    }

    public double getData2() {
        double winNum = getNum();
        tax = 5;
        if (winNum >= 3 & winNum <= 7) {
            double rateTax = (rate * tax) / 100;
            rate = rate - rateTax;

            return (rate * 125) / 100;
        } else if (winNum > 7) {
            tax = 10;
            rate = rate * 2;
            double winTax = (rate * tax) / 100;
            return rate - winTax;
        } else return getData1();

    }
}



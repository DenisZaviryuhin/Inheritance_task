package app;


public class SecondCase extends FirstCase {


    double tax;
    int[] nums = {3, 4, 5, 6, 7};

    public SecondCase(double rate, double win, double tax) {
        super(rate, win);
        this.tax = tax;
    }

    public double getData2() {
        double winNum = enterNum();
        tax = 5;
        if (winNum >= nums[0] & winNum <= nums[4]) {
            double rateTax = (rate * tax) / 100;
            rate = rate - rateTax;

            return (rate * 125) / 100;
        } else if (winNum > nums[4]) {
            tax = 10;
            rate = rate * 2;
            double winTax = (rate * tax) / 100;
            return rate - winTax;
        } else return getData1();

    }
}



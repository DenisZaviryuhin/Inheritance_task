package app;




class FirstCase {

    double rate;
    double winValue;


    public FirstCase(double rate, double win) {
        this.rate = rate;
        this.winValue = win;
    }

    public double getNum() {
        double num = (Math.random() * 10) + 1;
        System.out.println("Winning number is : " + Math.round(num));
        return num;
    }


    double getData1() {
        return (rate * 125) / 100;

    }
}

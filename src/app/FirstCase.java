package app;


import java.util.Scanner;

class FirstCase {

    double rate;
    double winValue;


    public FirstCase(double rate, double win) {
        this.rate = rate;
        this.winValue = win;
    }

    public double enterNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you got : ");
        int num = scanner.nextInt();
        return num;
    }


    double getData1() {
        return (rate * 125) / 100;

    }
}

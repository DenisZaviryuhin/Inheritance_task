package app;


import java.util.Scanner;

public class Main {
    static double winValue;
    static double rate;
    static double tax;
    static final String CURRENCY = "USD";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter your rate in " + CURRENCY + " :");
        rate = scanner.nextDouble();


        FirstCase firstCase = new FirstCase(rate, winValue);
        winValue = firstCase.getData1();


        SecondCase secondCase = new SecondCase(rate, winValue, tax);
        winValue = secondCase.getData2();


        System.out.printf("Congratulations! Your win is %s %.2f", CURRENCY, winValue);


    }
}

package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("WHATS IS THE DOLLAR PRICE?   ");
        double  dollarValue = sc.nextDouble();

        System.out.println("HOW MANY DOLLARS WILL BE BOUGHT?  ");
        double dollarQuant = sc.nextDouble();

       double dV = CurrencyConverter.calculatorQuant(dollarValue,dollarQuant);
       double dQ = CurrencyConverter.amountReais(dollarValue,dollarQuant);




        System.out.printf(" amount to be paid in reais %.2fn",dV +dQ );
        sc.close();
    }
}

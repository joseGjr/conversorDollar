package util;

public class CurrencyConverter {

    public static final double IOF = 6.0;


    public static double calculatorQuant(double dollarQuant , double dollarValue){
        return  (dollarQuant * dollarValue)* IOF /100 ;
    }
    public static double amountReais(double dollarQuant, double dollarValue){
        return dollarQuant * dollarValue;
    }
}



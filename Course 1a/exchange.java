public class exchange {
    public static void main(String args[]) {
        double amountInUSD = 100.0;
        double exchangeRateUSDToEUR = 0.85;

        System.out.println(amountInUSD);
        System.out.println(amountInUSD *= exchangeRateUSDToEUR);
        System.out.println(amountInUSD -= 55);
        System.out.printf("%2.2f", amountInUSD /= exchangeRateUSDToEUR);

       //"%2.2f" used to keep decimal places to 2
       //"%2.2f\n" used to print on new line 

       //Strings are immutable & arrays can only be of the same type

    }
}

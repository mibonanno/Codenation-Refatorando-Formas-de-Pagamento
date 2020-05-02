package br.com.codenation.paymentmethods;

public class DebitCard implements PriceStrategy {

    private static Double discount = 0.95;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }

}
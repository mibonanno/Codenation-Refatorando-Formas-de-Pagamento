package br.com.codenation.paymentmethods;

public class CashPayment implements PriceStrategy {

    private static Double discount = 0.9;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }

}
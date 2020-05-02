package br.com.codenation.paymentmethods;

public class TransferPayment implements PriceStrategy {

    private static Double discount = 0.92;

    @Override
    public Double calculate(Double price) {
        return price * discount;
    }

}
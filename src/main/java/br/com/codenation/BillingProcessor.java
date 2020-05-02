package br.com.codenation;

        import br.com.codenation.paymentmethods.PaymentMethod;
        import br.com.codenation.paymentmethods.PriceStrategy;

public class BillingProcessor {

    public Double calculate(Order order) {
        PaymentMethod paymentMethod = order.getPaymentMethod();
        PriceStrategy paymentStrategy = paymentMethod.getPaymentStrategy();
        double price = order.getPrice();
        return paymentStrategy.calculate(price);
    }

}


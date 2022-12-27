package ua.edu.ucu.apps.demo.payments;

public class CreditCardPayment implements Payment{
    @Override
    public boolean pay() {
        return true;
    }
}
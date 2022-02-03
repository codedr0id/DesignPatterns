package Strategies;

import Utility.Strategy;

public class BillPayment implements Strategy {
    @Override
    public void execute() {
        System.out.println("Bill Payment successful !!");
    }
}

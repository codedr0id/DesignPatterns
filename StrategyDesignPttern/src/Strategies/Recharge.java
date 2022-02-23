package Strategies;

import Utility.Strategy;

public class Recharge implements Strategy {
    @Override
    public void execute() {
        System.out.println("Mobile Recharge successful !!");
    }
}

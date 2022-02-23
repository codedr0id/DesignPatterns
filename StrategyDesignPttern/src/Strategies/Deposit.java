package Strategies;

import Utility.Strategy;

public class Deposit implements Strategy {
    @Override
    public void execute(){
        System.out.println("Deposit successful !!");
    }
}

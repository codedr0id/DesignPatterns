package Strategies;

import Utility.Strategy;

public class BankTransfer implements Strategy {
    @Override
    public void execute(){
        System.out.println("BankTransfer successful !!");
    }
}

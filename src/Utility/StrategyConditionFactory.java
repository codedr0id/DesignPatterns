package Utility;

import Strategies.BankTransfer;
import Strategies.BillPayment;
import Strategies.Deposit;
import Strategies.Recharge;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class StrategyConditionFactory {
    Map<String, Strategy> strategyMap = new HashMap<>();

    public StrategyConditionFactory() {
        strategyMap.put("BANK_TRANSFER", new BankTransfer());
        strategyMap.put("DEPOSIT", new Deposit());
        strategyMap.put("RECHARGE", new Recharge());
        strategyMap.put("BILL_PAYMENT", new BillPayment());
    }

    public Optional<Strategy> getStrategy(String condition) {
        return Optional.ofNullable(strategyMap.get(condition));
    }
}

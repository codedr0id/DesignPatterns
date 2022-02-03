import Utility.Strategy;
import Utility.StrategyConditionFactory;

public class Driver {
    private static final StrategyConditionFactory strategyConditionFactory = new StrategyConditionFactory();

    public static void run(String condition) {
        Strategy strategy = strategyConditionFactory.getStrategy(condition)
                .orElseThrow(() -> new IllegalArgumentException("Invalid condition"));
        strategy.execute();
    }

    public static void main(String[] args) {
        run("BANK_TRANSFER");
        run("DEPOSIT");
        run("RECHARGE");
        run("BILL_PAYMENT");
        run("ANYTHING");
    }
}

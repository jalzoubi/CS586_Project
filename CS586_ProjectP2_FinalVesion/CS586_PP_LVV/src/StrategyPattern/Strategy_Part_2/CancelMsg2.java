package StrategyPattern.Strategy_Part_2;

import StrategyPattern.*;

public class CancelMsg2 extends CancelMsg {
    @Override
    public void CancelMsg() {
        System.out.println("The Transaction is cancelled.:(");
    }
}

package StrategyPattern.Startegy_Part_1;

import StrategyPattern.*;

public class CancelMsg1 extends CancelMsg {
    @Override
    public void CancelMsg() {
        System.out.println("\nThe Transaction is cancelled :(\n");
    }
}

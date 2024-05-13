package StrategyPattern.Startegy_Part_1;

import StrategyPattern.*;

public class PayMsg1 extends PayMsg {
    public PayMsg1() {
    }

    public void PayMsg() {
        System.out.println("\nSelect Payment: ");
        System.out.println("-> Cash ");
        System.out.println("-> Creadit \n");
    }
}

package StrategyPattern.Startegy_Part_1;

import Data_Stores.DataStore;
import StrategyPattern.SetPayType;

public class SetPayType1 extends SetPayType {
    public void SetPayType(DataStore ds, int x) {
        if (x == 1) {
            System.out.println("\n╔═════════════════════════════╗");
            System.out.println("║        CARD PAY Type!       ║");
            System.out.println("╚═════════════════════════════╝\n");
            ds.w = 1;
        } else if (x == 0) {
            System.out.println("\n╔═════════════════════════════╗");
            System.out.println("║        Cash PAY Type!       ║");
            System.out.println("╚═════════════════════════════╝\n");
            ds.w = 0;
        }
        

    }

}

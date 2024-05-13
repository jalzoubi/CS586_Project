package StrategyPattern.Startegy_Part_1;

import StrategyPattern.EjectCard;

public class EjectCard1 extends EjectCard {

    @Override
    public void EjectCard() {
        System.out.println("\n╔═════════════════════════════╗");
            System.out.println("║      Credit Card Ejected  ║");
            System.out.println("╚═════════════════════════════╝\n");
    }

}

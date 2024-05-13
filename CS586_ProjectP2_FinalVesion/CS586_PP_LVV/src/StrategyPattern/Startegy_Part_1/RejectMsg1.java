package StrategyPattern.Startegy_Part_1;

import StrategyPattern.*;

public class RejectMsg1 extends RejectMsg {
    @Override
    public void RejectMsg() {
       // System.out.println();
        System.out.println("\n╔═════════════════════════════════════════╗");
        System.out.println("║                                           ║");
        System.out.println("║  The credit card is not approved!         ║");
        System.out.println("║                                           ║");
        System.out.println("╚═════════════════════════════════════════╝\n");
            }
}

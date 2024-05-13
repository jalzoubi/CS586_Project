package StrategyPattern.Startegy_Part_1;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class PrintReceipt1 extends PrintReceipt {
    @Override
    public void PrintReceipt(DataStore ds) {
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║           Receipt:           ║");
        System.out.println("║------------------------------║");
        System.out.println("║ # of Letters Pumped: " + ds.L + "       ║");
        System.out.println("║ Total: $" + String.format("%.2f", ds.total) + "                  ║");
        System.out.println("╚══════════════════════════════╝");
        
    }
}
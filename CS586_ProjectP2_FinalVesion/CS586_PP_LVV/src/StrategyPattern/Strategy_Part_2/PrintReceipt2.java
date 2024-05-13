package StrategyPattern.Strategy_Part_2;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class PrintReceipt2 extends PrintReceipt {
    @Override
    public void PrintReceipt(DataStore ds) {
        System.out.println("+" + "-".repeat(24) + "+");
        System.out.println("|         Receipt         |");
        System.out.println("+" + "-".repeat(24) + "+");
        System.out.println("| # of Gallons: " + ds.G + "        |");
        System.out.printf("| Total: $%.2f            |\n", ds.total);
        
    }
}
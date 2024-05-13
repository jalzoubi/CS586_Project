package StrategyPattern.Startegy_Part_1;

import StrategyPattern.*;
import Data_Stores.DataStore;

public class GasPumpedMsg1 extends GasPumpedMsg {
    @Override
    public void GasPumpedMsg(DataStore ds) {
        System.out.println( "\n"+ds.L+ " Litters pumped\n" );
       // System.out.println(String.format("Total: $%.2f", ds.total));
    }
}
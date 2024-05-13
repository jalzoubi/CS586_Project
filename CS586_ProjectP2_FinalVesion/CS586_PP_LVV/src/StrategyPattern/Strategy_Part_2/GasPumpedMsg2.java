package StrategyPattern.Strategy_Part_2;

import StrategyPattern.*;

import Data_Stores.DataStore;

public class GasPumpedMsg2 extends GasPumpedMsg {
    @Override
    public void GasPumpedMsg(DataStore ds) {
        System.out.println( "\n"+ds.G+ " Number of Gallones pumped: " );
        //System.out.println(String.format("Total: $%.2f", ds.total));
    }
}
package StrategyPattern.Strategy_Part_2;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class PumpGasUnit2 extends PumpGasUnit {
    @Override
    public void PumpGasUnit(DataStore ds) {
        ds.G= ds.G+1;
        ds.total= ds.price * ds.G;
    }
}
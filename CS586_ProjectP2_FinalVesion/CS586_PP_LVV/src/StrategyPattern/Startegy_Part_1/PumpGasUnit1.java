package StrategyPattern.Startegy_Part_1;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class PumpGasUnit1 extends PumpGasUnit {
    @Override
    public void PumpGasUnit(DataStore ds) {
    
        ds.L= ds.L + 1;
        ds.total= ds.price * ds.L;
    
}}
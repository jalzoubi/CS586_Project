package StrategyPattern.Startegy_Part_1;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class StoreCash1 extends StoreCash {

    @Override
    public void StoreCash(DataStore ds) {
        ds.cash=ds.temp_c;

    }

}
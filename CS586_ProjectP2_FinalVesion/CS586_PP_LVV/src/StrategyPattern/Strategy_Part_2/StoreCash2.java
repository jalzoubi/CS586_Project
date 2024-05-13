package StrategyPattern.Strategy_Part_2;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class StoreCash2 extends StoreCash {

    @Override
    public void StoreCash(DataStore ds) {// Store Cash
        ds.cash=ds.temp_cash;
    }

}
package StrategyPattern.Strategy_Part_2;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class ReturnCash2 extends ReturnCash {
    @Override
    public void ReturnCash(DataStore ds) {
        float returned;
        if (ds.cash > 0) {
            returned = ds.cash - ds.price * ds.G;
        } else {
            returned = 0;
        }
        System.out.println(String.format("RETURN $%.2f of CASH", returned));
    }
}

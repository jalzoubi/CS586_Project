package StrategyPattern.Startegy_Part_1;

import Data_Stores.*;
import StrategyPattern.*;

public class StorePrices1 extends StorePrices {

    @Override
    public void StorePrices(DataStore ds) {
        ds.price = ds.temp_a;

    }
}

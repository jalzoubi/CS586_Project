package StrategyPattern.Strategy_Part_2;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class SetInitialValues2 extends SetInitialValues {
    @Override
    public void SetInitialValues(DataStore ds) {
        ds.G=0;
        ds.total=0;
    }
}
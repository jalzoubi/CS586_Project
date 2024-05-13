package StrategyPattern.Startegy_Part_1;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class SetInitialValues1 extends SetInitialValues {
    @Override
    public void SetInitialValues(DataStore ds) {
        ds.L=0;
        ds.total=0;
    }
}

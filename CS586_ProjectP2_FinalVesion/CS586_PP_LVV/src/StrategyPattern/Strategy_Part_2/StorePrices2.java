package StrategyPattern.Strategy_Part_2;

import Data_Stores.*;
import StrategyPattern.*;

public class StorePrices2 extends StorePrices {

    @Override
    public void StorePrices(DataStore ds) {// Store values permnantly
        ds.Rprice=ds.temp_Ta;
        ds.Pprice=ds.temp_Tb;
        ds.Dprice=ds.temp_Tc;
        System.out.println("Gas Pump2 is Activated......:)");
    }
}

package StrategyPattern.Strategy_Part_2;

import Data_Stores.DataStore;
import StrategyPattern.*;

public class SetPrice2 extends SetPrice {
    @Override
    public void SetPrice(DataStore ds, int t) {// set the price to the sutabile type
        if (t == 1){
            System.out.println("\n*** Diesel Type activated ***\n");
            ds.price = ds.Dprice;
        }
        else if (t == 2){
            ds.price= ds.Rprice;
            System.out.println("\n*** Regular Type activated ***\n");
        }
        else if (t == 3){
            System.out.println("\n*** Premium Type activated ***\n");
            ds.price=ds.Pprice;}
    }
}
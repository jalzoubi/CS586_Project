package StrategyPattern;

import Data_Stores.DataStore;

public abstract class SetPayType {
    public SetPayType() {
    }

    public abstract void SetPayType(DataStore ds, int x);
}

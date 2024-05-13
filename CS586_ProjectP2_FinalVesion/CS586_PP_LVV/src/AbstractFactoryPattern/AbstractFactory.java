package AbstractFactoryPattern;

import Data_Stores.DataStore;
import StrategyPattern.*;

// Abstract factory class responsible for creating components related to gas pump operations
public abstract class AbstractFactory {
    // Instance variable to hold a reference to the data store
    DataStore dataStore;

    // Abstract method to retrieve the data store
    public abstract DataStore getDataStore();

    // Abstract factory methods for creating various components used in gas pump operations

    // Creates a component for storing prices
    public abstract StorePrices CreateStorePrices();

    // Creates a component for displaying pay message
    public abstract PayMsg CreatePayMsg();

    // Creates a component for storing cash
    public abstract StoreCash CreateStoreCash();

    // Creates a component for displaying menu for Disel ..Reguler..Priemum
    public abstract DisplayMenu CreateDisplayMenu();

    // Creates a component for displaying rejection message
    public abstract RejectMsg CreateRejectMsg();

    // Creates a component for setting prices
    public abstract SetPrice CreateSetPrice();

    // Creates a component for setting initial values
    public abstract SetInitialValues CreateSetInitialValues();

    // Creates a component for pumping gas units
    public abstract PumpGasUnit CreatePumpGasUnit();

    // Creates a component for displaying gas pumped message
    public abstract GasPumpedMsg CreateGasPumpedMsg();

    // Creates a component for printing receipt
    public abstract PrintReceipt CreatePrintReceipt();

    // Creates a component for displaying cancel message
    public abstract CancelMsg CreateCancelMsg();

    // Creates a component for returning cash
    public abstract ReturnCash CreateReturnCash();

    // Creates a component for setting payment type
    public abstract SetPayType CreateSetPayType();

    // Creates a component for ejecting card
    public abstract EjectCard CreateEjectCard();
    
}

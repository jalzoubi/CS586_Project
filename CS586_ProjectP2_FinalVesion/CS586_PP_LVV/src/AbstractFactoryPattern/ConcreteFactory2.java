package AbstractFactoryPattern;

import Data_Stores.DataStore;
import Data_Stores.DataStore2;
import StrategyPattern.*;
import StrategyPattern.Strategy_Part_2.*;

// Concrete factory class implementing AbstractFactory to create components for GasPump2
public class ConcreteFactory2 extends AbstractFactory {

    // Method to create or retrieve the data store specific to GasPump2
    @Override
    public DataStore getDataStore() {
        if (dataStore == null) {
            dataStore = new DataStore2();
        }
        return dataStore;
    }

    // Method to create StorePrices component for GasPump2
    @Override
    public StorePrices CreateStorePrices() {
        return new StorePrices2();
    }

    // Method to create PayMsg component for GasPump2
    @Override
    public PayMsg CreatePayMsg() {
        return new PayMsg2();
    }

    // Method to create StoreCash component for GasPump2
    @Override
    public StoreCash CreateStoreCash() {
        return new StoreCash2();
    }

    // Method to create DisplayMenu component for GasPump2
    @Override
    public DisplayMenu CreateDisplayMenu() {
        return new DisplayMenu2();
    }

    // Method to create RejectMsg component for GasPump2
    @Override
    public RejectMsg CreateRejectMsg() {
        return new RejectMsg2();
    }

    // Method to create SetPrice component for GasPump2
    @Override
    public SetPrice CreateSetPrice() {
        return new SetPrice2();
    }

    // Method to create SetInitialValues component for GasPump2
    @Override
    public SetInitialValues CreateSetInitialValues() {
        return new SetInitialValues2();
    }

    // Method to create PumpGasUnit component for GasPump2
    @Override
    public PumpGasUnit CreatePumpGasUnit() {
        return new PumpGasUnit2();
    }

    // Method to create GasPumpedMsg component for GasPump2
    @Override
    public GasPumpedMsg CreateGasPumpedMsg() {
        return new GasPumpedMsg2();
    }

    // Method to create PrintReceipt component for GasPump2
    @Override
    public PrintReceipt CreatePrintReceipt() {
        return new PrintReceipt2();
    }

    // Method to create CancelMsg component for GasPump2
    @Override
    public CancelMsg CreateCancelMsg() {
        return new CancelMsg2();
    }

    // Method to create ReturnCash component for GasPump2
    @Override
    public ReturnCash CreateReturnCash() {
        return new ReturnCash2();
    }

    // Method to create SetPayType component for GasPump2
    @Override
    public SetPayType CreateSetPayType() {
        return new SetPayType2();
    }

    // Method to create EjectCard component for GasPump2
    @Override
    public EjectCard CreateEjectCard() {
        return new EjectCard2();
    }
}

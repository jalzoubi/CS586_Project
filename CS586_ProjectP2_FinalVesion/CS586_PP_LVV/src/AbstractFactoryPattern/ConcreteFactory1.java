package AbstractFactoryPattern;

import Data_Stores.DataStore;
import Data_Stores.DataStore1;
import StrategyPattern.*;
import StrategyPattern.Startegy_Part_1.*;

// Concrete factory class implementing AbstractFactory to create components for GasPump1
public class ConcreteFactory1 extends AbstractFactory {

    // Method to create or retrieve the data store specific to GasPump1
    @Override
    public DataStore getDataStore() {
        if (dataStore == null) {
            dataStore = new DataStore1();
        }
        return this.dataStore;
    }

    // Method to create StorePrices component for GasPump1
    @Override
    public StorePrices CreateStorePrices() {
        return new StorePrices1();
    }

    // Method to create PayMsg component for GasPump1
    @Override
    public PayMsg CreatePayMsg() {
        return new PayMsg1();
    }

    // Method to create StoreCash component for GasPump1
    @Override
    public StoreCash CreateStoreCash() {
        return new StoreCash1();
    }

    // Method to create DisplayMenu component for GasPump1
    @Override
    public DisplayMenu CreateDisplayMenu() {
        return new DisplayMenu1();
    }

    // Method to create RejectMsg component for GasPump1
    @Override
    public RejectMsg CreateRejectMsg() {
        return new RejectMsg1();
    }

    // Method to create SetPrice component for GasPump1
    @Override
    public SetPrice CreateSetPrice() {
        return new SetPrice1();
    }

    // Method to create SetInitialValues component for GasPump1
    @Override
    public SetInitialValues CreateSetInitialValues() {
        return new SetInitialValues1();
    }

    // Method to create PumpGasUnit component for GasPump1
    @Override
    public PumpGasUnit CreatePumpGasUnit() {
        return new PumpGasUnit1();
    }

    // Method to create GasPumpedMsg component for GasPump1
    @Override
    public GasPumpedMsg CreateGasPumpedMsg() {
        return new GasPumpedMsg1();
    }

    // Method to create PrintReceipt component for GasPump1
    @Override
    public PrintReceipt CreatePrintReceipt() {
        return new PrintReceipt1();
    }

    // Method to create CancelMsg component for GasPump1
    @Override
    public CancelMsg CreateCancelMsg() {
        return new CancelMsg1();
    }

    // Method to create ReturnCash component for GasPump1
    @Override
    public ReturnCash CreateReturnCash() {
        return new ReturnCash1();
    }

    // Method to create SetPayType component for GasPump1
    @Override
    public SetPayType CreateSetPayType() {
        return new SetPayType1();
    }

    // Method to create EjectCard component for GasPump1
    @Override
    public EjectCard CreateEjectCard() {
        return new EjectCard1();
    }
}

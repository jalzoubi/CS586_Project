package StatePatteren;

import AbstractFactoryPattern.AbstractFactory;
import Data_Stores.DataStore;
import StrategyPattern.*;

// Class responsible for processing outputs based on the current state
public class OutputProcessor {
    // Member variables representing various components
    private DataStore ds; // Data store to hold system data
    private PayMsg payMsg; // Strategy for displaying payment message
    private StoreCash storeCash; // Strategy for storing cash
    private DisplayMenu displayMenu; // Strategy for displaying menu
    private RejectMsg rejectMsg; // Strategy for displaying rejection message
    private SetPrice setPrice; // Strategy for setting gas price
    private SetInitialValues setInitialValues; // Strategy for setting initial values
    private PumpGasUnit pumpGasUnit; // Strategy for pumping gas
    private GasPumpedMsg gasPumpedMsg; // Strategy for displaying gas pumped message
    private PrintReceipt printReceipt; // Strategy for printing receipt
    private CancelMsg cancelMsg; // Strategy for displaying cancellation message
    private ReturnCash returnCash; // Strategy for returning cash
    private SetPayType setPayType; // Strategy for setting payment type
    private EjectCard ejectCard; // Strategy for ejecting card
    private StorePrices storePrices; // Strategy for storing gas prices

    // Constructor
    public OutputProcessor() {
    }

    // Method to initialize the output processor with an abstract factory
    public void Initialize(AbstractFactory var1) {
        this.ds = var1.getDataStore();
        // Initialize each component using the abstract factory
        this.payMsg = var1.CreatePayMsg();
        this.storeCash = var1.CreateStoreCash();
        this.displayMenu = var1.CreateDisplayMenu();
        this.rejectMsg = var1.CreateRejectMsg();
        this.setPrice = var1.CreateSetPrice();
        this.setInitialValues = var1.CreateSetInitialValues();
        this.pumpGasUnit = var1.CreatePumpGasUnit();
        this.gasPumpedMsg = var1.CreateGasPumpedMsg();
        this.printReceipt = var1.CreatePrintReceipt();
        this.cancelMsg = var1.CreateCancelMsg();
        this.returnCash = var1.CreateReturnCash();
        this.setPayType = var1.CreateSetPayType();
        this.ejectCard = var1.CreateEjectCard();
        this.storePrices = var1.CreateStorePrices(); // StorePrices method was not initialized here; corrected
    }

    // Method to eject card
    public void ejectCard() {
        this.ejectCard.EjectCard();
    }

    // Method to set payment type
    public void setPayType(int t) {
        ds.w=t;
        this.setPayType.SetPayType(ds, t);
    }

    // Method to store prices
    public void StorePrices() {
        this.storePrices.StorePrices(this.ds);
    }

    // Methods to process different outputs

    // Method to display payment message
    public void PayMsg() {
        this.payMsg.PayMsg();
    }

    // Method to store cash
    public void StoreCash() {
        this.storeCash.StoreCash(this.ds);
    }

    // Method to display menu
    public void DisplayMenu() {
        this.displayMenu.DisplayMenu();
    }

    // Method to display rejection message
    public void RejectMsg() {
        this.rejectMsg.RejectMsg();
    }

    // Method to set gas price
    public void SetPrice(int g) {
        setPrice.SetPrice(this.ds, g);
    }

    // Method to set initial values
    public void SetInitialValues() {
        this.setInitialValues.SetInitialValues(this.ds);
    }

    // Method to pump gas
    public void PumpGasUnit() {
        this.pumpGasUnit.PumpGasUnit(this.ds);
    }

    // Method to display gas pumped message
    public void GasPumpedMsg() {
        this.gasPumpedMsg.GasPumpedMsg(this.ds);
    }

    // Method to print receipt
    public void PrintReceipt() {
        this.printReceipt.PrintReceipt(this.ds);
    }

    // Method to display cancellation message
    public void CancelMsg() {
        this.cancelMsg.CancelMsg();
    }

    // Method to return cash
    public void ReturnCash() {
        this.returnCash.ReturnCash(this.ds);
    }

}

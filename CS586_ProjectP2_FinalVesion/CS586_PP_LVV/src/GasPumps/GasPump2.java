package GasPumps;

import AbstractFactoryPattern.AbstractFactory;
import Data_Stores.DataStore;
import StatePatteren.MDAEFSM;

// Class representing GasPump2 operations
public class GasPump2 {
    private DataStore d;    // Data store for GasPump2
    private MDAEFSM m;      // State machine for GasPump2

    // Method to initialize GasPump2 with abstract factory
    public void Initialize(AbstractFactory af) {
        d = af.getDataStore();  // Get data store from abstract factory
        m = new MDAEFSM();      // Create new state machine
        m.Initialize(af);       // Initialize state machine with abstract factory
    }

    // Method to activate GasPump2 with fuel prices
    public void Activate(float a, float b, float c) {
        if (a > 0 && b > 0 && c > 0) {  // Check if prices are positive
            d.temp_Ta = a;  // Set temporary value for type A fuel price
            d.temp_Tb = b;  // Set temporary value for type B fuel price
            d.temp_Tc = c;  // Set temporary value for type C fuel price
            m.Activate();   // Activate state machine
        }
    }

    // Method to start GasPump2
    public void Start() {
        this.m.Start(); // Start state machine
    }

    // Method to pay with cash at GasPump2
    public void PayCash(int c) {
        if (c > 0) {    // Check if cash amount is positive
            d.temp_cash = c;    // Set temporary cash value
            m.PayType(0);       // Set payment type to cash in state machine
        }
    }

    // Method to cancel transaction at GasPump2
    public void Cancel() {
        m.Cancel(); // Cancel transaction in state machine
    }

    // Method to select diesel fuel type at GasPump2
    public void Diesel() {
        m.SelectGas(1); // Select diesel fuel type in state machine
        m.Continue();   // Continue state machine operation
    }

    // Method to select premium fuel type at GasPump2
    public void Premium() {
        m.SelectGas(3); // Select premium fuel type in state machine
        m.Continue();   // Continue state machine operation
    }

    // Method to select regular fuel type at GasPump2
    public void Regular() {
        m.SelectGas(2); // Select regular fuel type in state machine
        m.Continue();   // Continue state machine operation
    }

    // Method to start pumping fuel at GasPump2
    public void StartPump() {
        this.m.Continue();
        m.StartPump();  // Start pumping in state machine
    }

    // Method to pump a gallon of fuel at GasPump2
    public void PumpGallon() {
        if (d.w == 0 && d.cash > 0 && d.cash < d.price * (d.G + 1)) { // Check if cash is sufficient for pumping
            m.StopPump();   // Stop pumping if cash is insufficient
        } else {
            m.Pump();   // Otherwise, continue pumping
        }
    }

    // Method to stop pumping fuel at GasPump2
    public void Stop() {
        m.StopPump();   // Stop pumping in state machine
    }

    // Method to print receipt at GasPump2
    public void Receipt() {
        m.Receipt();    // Print receipt in state machine
    }

    // Method to not print receipt at GasPump2
    public void NoReceipt() {
        m.NoReceipt();  // Do not print receipt in state machine
    }
}

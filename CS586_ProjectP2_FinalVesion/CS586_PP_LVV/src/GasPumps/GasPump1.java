package GasPumps;

import AbstractFactoryPattern.AbstractFactory;
import Data_Stores.DataStore;
import StatePatteren.MDAEFSM;

// Class representing GasPump1 operations
public class GasPump1 {
    private DataStore d;    // Data store for GasPump1
    private MDAEFSM m = new MDAEFSM();      // State machine for GasPump1

    // Constructor
    public GasPump1() {
      
    }

    // Method to activate GasPump1
    public void Activate(int a) {
        if (a > 0) {
            d.temp_a = a;   // Set temporary value a
            this.m.Activate();  // Activate state machine
        } else {
            System.out.println("a Is negative!!");  // Error message for negative input
        }
    }

    // Method to start GasPump1
    public void Start() {
        this.m.Start(); // Start state machine
    }

    // Method to pay with cash at GasPump1
    public void PayCash(int c) {
        d.temp_c = c;   // Set temporary cash value
       // d.w = 0;        // Set payment type to cash
        this.m.PayType(0);  // Set payment type in MDAEFSM
    }

    // Method to pay with credit card at GasPump1
    public void PayCredit() {
                // Set payment type to credit
        this.m.PayType(1);  // Set payment type in state machine
    }

    // Method to handle rejected payment at GasPump1
    public void Reject() {
        this.m.Reject();    // Call reject method in MDAEFSM
    }

    // Method to cancel transaction at GasPump1
    public void Cancel() {
        this.m.Cancel();    // Call cancel method in MDAEFSM
    }

    // Method to handle approved payment at GasPump1
    public void Approved() {
        d.w = 1;
        this.m.Approved();  // Call approved method in MDAEFSM
    }

    // Method to start pumping fuel at GasPump1
    public void StartPump() {
        this.m.Continue();  // Continue MDAEFSM operation
        this.m.StartPump(); // Start pumping in MDAEFSM
    }

    // Method to pump fuel at GasPump1
    public void Pump() {
        if (d.w == 1)  // If payment is credit, proceed with pumping
            m.Pump();
        else if (d.cash < d.price * (d.L + 1)) {  // If cash is insufficient, stop pumping and print receipt
            this.m.StopPump();
            this.m.Receipt();
        } else
            this.m.Pump();  // Otherwise, continue pumping
    }

    // Method to stop pumping fuel at GasPump1
    public void StopPump() {
        this.m.StopPump();  // Stop pumping in state machine
        this.m.Receipt();   // Print receipt in state machine
    }

    // Method to initialize GasPump1 with abstract factory
    public void Initialize(AbstractFactory af) {
        d = af.getDataStore();  // Get data store from abstract factory
        m = new MDAEFSM();      // Create new state machine
        m.Initialize(af);       // Initialize state machine with abstract factory
    }
}

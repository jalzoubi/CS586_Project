package StatePatteren;

import AbstractFactoryPattern.AbstractFactory;

// Class representing the MDAEFSM (Marstons-Drive-At-Express Fuel Service Machine)
public class MDAEFSM {
    private State[] states; // Array to hold different states of the FSM
    private State state;    // Current state of the FSM
   

    // Method to initialize the FSM with an abstract factory
    public void Initialize(AbstractFactory af) {
        OutputProcessor op = new OutputProcessor(); // Create output processor
        op.Initialize(af);  // Initialize output processor with abstract factory
        states = new State[8];  // Create an array to hold states
        // Initialize each state and assign to the corresponding index in the array
        states[0] = new S0();
        states[1] = new S1();
        states[2] = new S2();
        states[3] = new S3();
        states[4] = new S4();
        states[5] = new S5();
        states[6] = new S6();
        states[7] = new S7();
        state = states[7];  // Set initial state to S7

        // Set the MDAEFSM and OutputProcessor references for each state
        for (int i = 0; i < states.length; i++) {
            states[i].setMDAEFSM(this);
            states[i].setOutputProcessor(op);
        }
    }

    // Methods to trigger actions in the current state
    public void Activate() {
        state.Activate();
    }

    public void Start() {
        state.Start();
    }

    public void PayType(int t) {
        state.PayType(t);
    }

    public void Reject() {
        state.Reject();
    }

    public void Cancel() {
        state.Cancel();
    }

    public void Approved() {
        state.Approved();
    }

    public void StartPump() {
        state.StartPump();
    }

    public void Pump() {
        state.Pump();
    }

    public void StopPump() {
        state.StopPump();
    }

    public void SelectGas(int g) {
        state.SelectGas(g);
    }

    public void Receipt() {
        state.Receipt();
    }

    public void NoReceipt() {
        state.NoReceipt();
    }

    public void Continue() {
        state.Continue();
    }

    // Method to set the current state
    public void setState(int s) {
        state = states[s];
    }
}

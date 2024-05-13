package StatePatteren;

// State class representing the initial state of the GasPump
public class S0 extends State {

   // Override methods from the State class
   
   @Override
   public void Activate() {
      // No action required in this state
   }

   @Override
   public void Approved() {
      // No action required in this state
   }

   @Override
   public void Cancel() {
      // No action required in this state
   }

   @Override
   public void Continue() {
      // No action required in this state
   }

   @Override
   public void NoReceipt() {
      // No action required in this state
   }

   @Override
   public void PayType(int var1) {
      // No action required in this state
   }

   @Override
   public void Pump() {
      // No action required in this state
   }

   @Override
   public void Receipt() {
      // No action required in this state
   }

   @Override
   public void Reject() {
      // No action required in this state
   }

   @Override
   public void SelectGas(int var1) {
      // No action required in this state
   }

   // Method called when the GasPump is started
   @Override
   public void Start() {
      // Display payment message and transition to the next state
      this.op.PayMsg();
      this.mdaefsm.setState(1); // Transition to state S1
   }

   @Override
   public void StartPump() {
      // No action required in this state
   }

   @Override
   public void StopPump() {
      // No action required in this state
   }
}

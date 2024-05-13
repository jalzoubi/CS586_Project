package StatePatteren;

// State class representing the state when the Gas Pump is activated
public class S7 extends State {

   // Override methods from the State class

   // Method called when the GasPump is activated
   @Override
   public void Activate() {
      // Store prices and transition to state S0
      this.op.StorePrices(); // Call method to store prices
      this.mdaefsm.setState(0); // Transition to state S0
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

   // Method called when the user is pumping gas
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

   @Override
   public void Start() {
      // No action required in this state
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

package StatePatteren;

// State class representing the state when the transaction is completed without receiving a receipt
public class S6 extends State {

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
      // Return cash to the user and transition to state S0
      this.op.ReturnCash();
      this.mdaefsm.setState(0);
   }

   @Override
   public void PayType(int var1) {
      // No action required in this state
   }

   @Override
   public void Pump() {
      // No action required in this state
   }

   // Method called when the user requests a receipt
   @Override
   public void Receipt() {
      // Print the receipt, return cash to the user, and transition to state S0
      this.op.PrintReceipt();
      this.op.ReturnCash();
      this.mdaefsm.setState(0);
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

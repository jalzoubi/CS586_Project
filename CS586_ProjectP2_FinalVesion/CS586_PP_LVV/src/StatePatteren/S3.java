package StatePatteren;

// State class representing the state after the payment type is selected
public class S3 extends State {

   // Override methods from the State class
   
   @Override
   public void Activate() {
      // No action required in this state
   }

   @Override
   public void Approved() {
      // No action required in this state
   }

   // Method called when the transaction is canceled
   @Override
   public void Cancel() {
      // Display cancel message, return cash, and transition to state S0
      this.op.CancelMsg();
      this.op.ReturnCash();
      this.mdaefsm.setState(0);
   }

   // Method called to continue the transaction
   @Override
   public void Continue() {
      // Transition to state S4 
      this.mdaefsm.setState(4);
     // System.out.println("LOOK JAfar ))))))))))");
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
   public void SelectGas(int g) {
      // Set the price for the selected gas type
      this.op.SetPrice(g); // LOOK here
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

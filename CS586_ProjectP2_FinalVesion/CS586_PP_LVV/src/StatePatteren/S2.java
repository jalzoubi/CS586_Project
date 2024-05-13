package StatePatteren;

// State class representing the state after the credit card is approved
public class S2 extends State {

   // Override methods from the State class
   
   // Method called when the GasPump is activated
   @Override
   public void Activate() {
      // No action required in this state
   }

   // Method called when the transaction is approved
   @Override
   public void Approved() {
      // Print approval message, display menu, set payment type to credit, eject card, and transition to state S3
      System.out.println("\nThe credit card is approved.:)");
      //this.op.DisplayMenu();
      this.op.setPayType(1);
      this.op.ejectCard();
      this.mdaefsm.setState(3);
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
      // Display rejection message, eject card, and transition to state S0
      this.op.RejectMsg();
      this.op.ejectCard();
      this.mdaefsm.setState(0);
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

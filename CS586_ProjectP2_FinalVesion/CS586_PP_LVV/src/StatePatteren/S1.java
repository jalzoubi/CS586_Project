package StatePatteren;

// State class representing the state after the transaction has started
public class S1 extends State {

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
   public void PayType(int t) {

      if (t == 1) {
         // Transition to state S2 for credit card payment
         this.mdaefsm.setState(2);
         System.out.println("Waiting for approval...");
      } else if (t == 0) {
         // Store cash, display menu, set payment type, and transition to state S3 for cash payment
         this.op.StoreCash();///////////
         this.op.DisplayMenu();
       //  this.op.setPayType(0);
         this.mdaefsm.setState(3);
         
      }
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

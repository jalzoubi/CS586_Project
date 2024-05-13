package StatePatteren;

// State class representing the state after the user selects to continue the transaction
public class S4 extends State {

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

   @Override
   public void Start() {
      // No action required in this state
   }

   // Method called when the user starts the pump
   @Override
   public void StartPump() {
      // Print a message, set initial values, and transition to state S5
      System.out.println("\nStart Pumping.......\n");
      this.op.SetInitialValues();
      this.mdaefsm.setState(5);
   }

   @Override
   public void StopPump() {
      // No action required in this state
   }

}

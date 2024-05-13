package StatePatteren;

// State class representing the state when the user is pumping gas
public class S5 extends State {

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
      // Call methods to pump gas unit and display gas pumped message
      this.op.PumpGasUnit();
      this.op.GasPumpedMsg();
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

   // Method called when the user stops pumping gas
   @Override
   public void StopPump() {
      // Print a message, stop the pump, and transition to state S6
      System.out.println("Pump is Stopped. :)");
      this.mdaefsm.setState(6);
   }

}

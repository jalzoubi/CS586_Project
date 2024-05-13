package StatePatteren;

public abstract class State {
   public OutputProcessor op ;
   public MDAEFSM mdaefsm;

   public State() {
   }

   public abstract void Activate();

   public abstract void Start();

   public abstract void PayType(int var1);

   public abstract void Reject();

   public abstract void Cancel();

   public abstract void Approved();

   public abstract void StartPump();

   public abstract void Pump();

   public abstract void StopPump();

   public abstract void SelectGas(int var1);

   public abstract void Receipt();

   public abstract void NoReceipt();

   public abstract void Continue();

   public void setOutputProcessor(OutputProcessor o) {
     this.op = o;
   }

   public void setMDAEFSM(MDAEFSM mda) {
      this.mdaefsm = mda;
   }
}

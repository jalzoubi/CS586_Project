package Data_Stores;

// Abstract class representing the data store for gas pump operations
public abstract class DataStore {
    // Variables representing shared data among gas pumps
    public int temp_c;      // Temporary variable c
    public int temp_a;      // Temporary variable a
    public int w;           // Payment type indicator (0 for cash, 1 for credit)
    public int cash;        // Available cash
    public float price;     // Price per gallon
    public int L;           // Number of Litters pumped
    public float total;     // Total amount of fuel pumped

    // Variables specific to GasPump2
    public float temp_Ta;   // Temporary variable Ta
    public float temp_Tb;   // Temporary variable Tb
    public float temp_Tc;   // Temporary variable Tc

    // Variables specific to GasPump2
    public int temp_cash;   // Temporary cash variable
    public float Dprice;    // Diesel price
    public float Rprice;    // Regular gasoline price
    public float Pprice;    // Premium gasoline price
    public int G;           // Gallons pumped

   
}

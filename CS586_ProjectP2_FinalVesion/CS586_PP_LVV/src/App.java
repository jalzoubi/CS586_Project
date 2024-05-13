import java.util.Scanner;

import GasPumps.GasPump1;
import GasPumps.GasPump2;
import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.ConcreteFactory1;
import AbstractFactoryPattern.ConcreteFactory2;
/**
 * This class represents an application for managing gas pumps. It provides a menu-driven interface
 * for interacting with GasPump1 and GasPump2 objects.
 */
public class App {
        // Constants for menu headers and operations for GasPump-2
    public static final String MENU_HEADER2 = "                          GasPump-2\n";
    public static final String MENU_OPERATIONS2 = "                  MENU of Operations\n";
    public static final String[] OPERATIONS2 = {
            "0. Activate(float, float, float)",
            "1. Start()",
            "2. PayCash(int)",
            "3. Cancel()",
            "4. Premium()",
            "5. Regular()",
            "6. Diesel()",
            "7. StartPump()",
            "8. PumpGallon()",
            "9. Stop()",
            "a. Receipt()",
            "b. NoReceipt()",
            "q. Quit prgram"
    };
        // Constants for menu headers and operations for GasPump-1
    public static final String MENU_HEADER = "                          GasPump-1\n";
    public static final String MENU_OPERATIONS = "                  MENU of Operations\n";
    public static final String[] OPERATIONS = {
            "0. Activate(int)",
            "1. Start()",
            "2. PayCredit",
            "3. Reject()",
            "4. Cancel()",
            "5. Approved()",
            "6. PayCash(int)",
            "7. StartPump()",
            "8. Pump()",
            "9. StopPump()",
            "q. Quit prgram"
    };

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println("\t\t\tSelect GP-1 or GP-2");
        System.out.println("\t1. GP-1");
        System.out.println("\t2. GP-2");
        Scanner sc = new Scanner(System.in);
        System.out.print("Select GP: ");
        int ck = sc.nextInt();
        System.out.println("");
        if (ck == 1){        // Interaction with GasPump-1
            AbstractFactory af1 = new ConcreteFactory1();
            GasPump1 gp1 = new GasPump1();
           
            gp1.Initialize(af1);

            System.out.print(MENU_HEADER);
            System.out.print(MENU_OPERATIONS);
            for (String operation : OPERATIONS) {
                System.out.println(operation);
            }
            System.out.println("");
            System.out.print("  Please make a note of these operations\n\n");
            System.out.print("           GasPump-1 Execution\n");
            System.out.println("");
            char ch = '1';
            while (ch != 'q') {
                System.out.print("\n  Select Operation: \n");
                for (String operation : OPERATIONS) {
                    System.out.print(operation+" ");
                }
                System.out.println("");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0': // Activate()
                        System.out.print("  Operation:  Activate(int a)\n");
                        System.out.print("  Enter value of the parameter a:\n");
                        int a = sc.nextInt();
                        gp1.Activate(a);
                        break;
                    case '1': // Start
                        System.out.print("  Operation:  Start()\n");
                        gp1.Start();
                        break;
                    case '2': // PayCredit
                        System.out.print("  Operation:  PayCredit()\n");
                        gp1.PayCredit();
                        break;
                    case '3': // Reject
                        System.out.print("  Operation:  Reject()\n");
                        gp1.Reject();
                        break;
                    case '4': // Cancel
                        System.out.print("  Operation:  Cancel()\n");
                        gp1.Cancel();
                        break;
                    case '5': // Approved
                        System.out.print("  Operation:  Approved()\n");
                        gp1.Approved();
                        break;
                    case '6': // PayCash
                        System.out.print("  Operation:  PayCash(int c)\n");
                        System.out.print("  Enter value of the parameter c:\n");
                        int c = sc.nextInt();
                        gp1.PayCash(c);
                        break;
                    case '7': // StartPump
                        System.out.print("  Operation:  StartPump()\n");
                        gp1.StartPump();
                        break;
                    case '8': // Pump
                        System.out.print("  Operation: Pump()\n");
                        gp1.Pump();
                        break;
                    case '9': // StopPump
                        System.out.print("  Operation:  StopPump()\n");
                        gp1.StopPump();
                        break;
                }
            }
        } else if (ck == 2){        // Interaction with GasPump-2

            
            GasPump2 gp2 = new GasPump2();
            AbstractFactory af2 = new ConcreteFactory2();
            gp2.Initialize(af2);
            /////////////////////////////////////////////////////////////
            System.out.print(MENU_HEADER2);
            System.out.print(MENU_OPERATIONS2);
            for (String operation : OPERATIONS2) {
                System.out.println(operation);
            }
            System.out.println("");
            System.out.print("  Please make a note of these operations\n\n");
            System.out.print("           GasPump-2 Execution\n");
            System.out.println("");
            char ch = '1';
            while (ch != 'q') {            // Display menu for GasPump-2
                System.out.print("  \nSelect Operation: \n");
                for (String operation : OPERATIONS2) {
                    System.out.print(operation+" ");
                }
                System.out.println("");
                ch = sc.next().charAt(0);
                switch (ch) {
                    case '0': // Activate()
                        System.out.print("  Operation:  Activate(float, float, float)\n");
                        System.out.print("  Enter value of the Regular Price:\n");
                        float x = sc.nextFloat();
                        System.out.print("  Enter value of the parameter Primum Price:\n");
                        float y = sc.nextFloat();
                        System.out.print("  Enter value of the parameter Desil Price:\n");
                        float z = sc.nextFloat();
                        gp2.Activate(x,y,z);
                        break;
                    case '1': // Start
                        System.out.print("  Operation:  Start()\n");
                        gp2.Start();
                        break;
                    case '2': // PayCash(int)
                        System.out.print("  Operation:  PayCash(int c)\n");
                        System.out.print("  Enter value of the parameter c:\n");
                        int c2 = sc.nextInt();
                        gp2.PayCash(c2);
                        break;
                    case '3': // Cancel()
                        System.out.print("  Operation:  Cancel()\n");
                        gp2.Cancel();
                        break;
                    case '4': // Premium()
                        System.out.print("  Operation:  Premium()\n");
                        gp2.Premium();
                        break;
                    case '5': // Regular()
                        System.out.print("  Operation:  Regular()\n");
                        gp2.Regular();
                        break;
                    case '6': // Diesel()
                        System.out.print("  Operation:  Diesel()\n");
                        gp2.Diesel();
                        break;
                    case '7': // StartPump()
                        System.out.print("  Operation:  StartPump()\n");
                        gp2.StartPump();
                        break;
                    case '8': // PumpGallon()
                        System.out.print("  Operation: PumpGallon()\n");
                        gp2.PumpGallon();
                        break;
                    case '9': // Stop()
                        System.out.print("  Operation:  Stop()\n");
                        gp2.Stop();
                        break;
                    case 'a': //Receipt()
                        System.out.println("    Operation:  Receipt()");
                        gp2.Receipt();
                        break;
                    case 'b': //NoReceipt()
                        System.out.println("    Operation:  NoReceipt()");
                        gp2.NoReceipt();
                        break;
                }
            }
        }
        sc.close();
    }
}

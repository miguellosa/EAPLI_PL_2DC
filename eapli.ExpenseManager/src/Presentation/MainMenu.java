/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class MainMenu {

    public void mainLoop() {
        int option;
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");
            System.out.println("1. Register an expense");
            System.out.println("2. Define expense type");
            System.out.println("3. Define payment");
            System.out.println("4. Register income");
            System.out.println("5. Display expenses");
            System.out.println("6. Import/Export data");
            System.out.println("0. Exit\n\n");
            option = Console.readInteger("Please choose a option");
            switch (option) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.mainLoop();
                    break;
                case 2:
                    ExpenseTypeUI type = new ExpenseTypeUI();
                    type.mainLoop();
                    break;
                case 3:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un1 = new UnavailableFunctionUI();
                    un1.mainLoop();
                    break;
                case 4:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un2 = new UnavailableFunctionUI();
                    un2.mainLoop();
                    break;
                case 5:
                    /* jumps to submenu "Display Expenses" */
                    DisplayExpensesUI dispEx = new DisplayExpensesUI();
                    dispEx.mainLoop();
                    break;
                case 6:
                    /* jumps to submenu "Export(import Data" */
                    ExportImportDataUI eID = new ExportImportDataUI();
                    eID.mainLoop();
                    break;
                default:
                    System.out.println("Unknown option\nPlease try again!");
            }
        } while (option != 0);
    }
}

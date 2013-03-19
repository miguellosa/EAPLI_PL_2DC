/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;
import eapli.util.Console;

/**
 *
 * @author Magano
 */
class ExpenseTypeUI {
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE TYPE  * * *\n");
        
        String desc  = Console.readLine("Description:");
             
        ExpenseTypeController controller = new ExpenseTypeController();
        controller.RegisterExpenseType(desc);
        
        System.out.println("Expense type recorded.");
    }
}

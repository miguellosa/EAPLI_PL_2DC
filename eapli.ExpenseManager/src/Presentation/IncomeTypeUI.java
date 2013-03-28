/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.IncomeTypeController;
import eapli.util.Console;

/**
 *
 * @author i090566
 */
public class IncomeTypeUI {
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN INCOME TYPE  * * *\n");
        
        String description  = Console.readLine("Description:");
             
        IncomeTypeController incController = new IncomeTypeController();
        incController.RegisterIncomeType(description);
        
        System.out.println("Income type recorded.");
    }
}

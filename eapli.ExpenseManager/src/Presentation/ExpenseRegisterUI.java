/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
import Model.ExpenseType;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
       
        String n="";
        ExpenseType exp=new ExpenseType(n);
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        String type = Console.readLine("Type:");
        
        
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
<<<<<<< HEAD
        controller.registerExpense(what, date, amount,exp);
=======
        //controller.registerExpense(what, date, amount);
>>>>>>> d2b4b9b413a461303a93edd1b389309909806ebd
        
        System.out.println("expense recorded.");
    }
}

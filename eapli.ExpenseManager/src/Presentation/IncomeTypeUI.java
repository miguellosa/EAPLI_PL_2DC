/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.IncomeTypeController;
import eapli.util.Console;

/**
 *
 * @author i090566
 */
public class IncomeTypeUI extends BaseUI {
    
     private BaseController controller = new BaseController(); 
    
    @Override
    public BaseController controller(){
        return controller;
    }

    @Override
    public void show() {
        headline();
        System.out.println(controller.showWeeklyExpenses()+"            |||            "+controller.getCurrentMonthExpenses());
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("  Register an income type  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop() {
        
        String description  = Console.readLine("Description:");
             
        IncomeTypeController incController = new IncomeTypeController();
        incController.RegisterIncomeType(description);
        
        System.out.println("Income type recorded.");
    }
}

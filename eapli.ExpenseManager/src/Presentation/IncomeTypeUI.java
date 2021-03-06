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
        System.out.println("Semana: "+controller.showWeeklyExpenses()+"            |||            "+"Mês: "+controller.getCurrentMonthExpenses());
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
        
        String shortName = Console.readLine("Short Name: ");
        String description  = Console.readLine("Description:");
        
             
        IncomeTypeController incController = new IncomeTypeController();
        incController.RegisterIncomeType(shortName, description);
        
        System.out.println("Income type recorded.");
    }
}

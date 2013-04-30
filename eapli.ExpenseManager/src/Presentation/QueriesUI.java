/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import eapli.util.Console;

/**
 *
 * @author Miguel
 */
public class QueriesUI extends BaseUI {
    
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
        System.out.println("===================");
        System.out.println("  Queries  ");
        System.out.println("===================\n");
    }

    @Override
    public void mainLoop(){
        int option;
        final int VIEWAGREGATEDEXPENSES=1, QUIT=0, VIEWGRAPHIC=2;  
        do {
            System.out.println("1. Display Aggregated Expenses");     
            System.out.println("2. Display Aggregated Expenses by Graphic");
            System.out.println("0. Exit\n");
            
            option = Console.readInteger("Please choose a option");
            
            switch (option) {
                case QUIT:
                    /*return to main*/
                    return;
                    
                case VIEWAGREGATEDEXPENSES:
                    DisplayExpensesUI dispEx = new DisplayExpensesUI();
                    dispEx.show();
                    break;
                case VIEWGRAPHIC:
                    DisplayGraphUI graphEx=new DisplayGraphUI();
                    graphEx.show();
                    break;
                     
                default:
                    System.out.println("Unknown option\nPlease try again!");
                    break;
            }
        } while (option != QUIT);
        
    }
    
}

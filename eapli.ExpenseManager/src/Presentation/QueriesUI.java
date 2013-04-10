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
    
    @Override
    public BaseController controller(){
        return null;
    }

    @Override
    public void show() {
        headline();
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
        final int VIEWAGREGATEDEXPENSES=1, QUIT=0;  
        do {
            System.out.println("1. Display Aggregated Expenses");            
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
               
                default:
                    System.out.println("Unknown option\nPlease try again!");
                    break;
            }
        } while (option != QUIT);
        
    }
    
}
package Presentation;

import Controllers.BaseController;
import Controllers.DisplayExpensesController;
import eapli.util.Console;

/**
 * User interface displaying the available options within "Display Expense"
 * @author João Carreira
 */
public class DisplayExpensesUI extends BaseUI {
    
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
        System.out.println("  Display Expenses  ");
        System.out.println("===================\n");
    }

    @Override
    public void mainLoop(){
        int option,option1,option2;
        DisplayExpensesController dec= new DisplayExpensesController();
        do{
            
            System.out.println("1. Monthly expenses");
            System.out.println("2. Weekly expenses");
            System.out.println("0. Go back\n\n");
            option = Console.readInteger("Please choose an option");
            switch(option){
                case 1:
                    option1 = Console.readInteger("Which Year?");
                    option2 = Console.readInteger("Which Month?\n (0-January until 11-December)");
                    dec.showMonthlyExpenses(option1,option2);
                    break;
                case 2:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un2 = new UnavailableFunctionUI();
                    un2.mainLoop();
                    break;
                case 0:
                    /* returns to previous menu */
                    return;
                default:
                    System.out.println("Unknown option\nPlease try again!");
            } // end switch
        } while(option != 0);
    }
    
    public void showMonthlyExpenses(String text){ 
        System.out.println(text);
    }
      

}
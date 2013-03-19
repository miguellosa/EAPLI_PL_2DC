package Presentation;

import eapli.util.Console;

/**
 * User interface displaying the available options within "Display Expense"
 * @author João Carreira
 */
public class DisplayExpensesUI {
    public void mainLoop(){
        int option;
        do{
            System.out.println("===================");
            System.out.println("  Display Expenses  ");
            System.out.println("===================\n");
            System.out.println("1. Monthly expenses");
            System.out.println("2. Weekly expenses");
            System.out.println("0. Go back\n\n");
            option = Console.readInteger("Please choose a option");
            switch(option){
                case 1:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un1 = new UnavailableFunctionUI();
                    un1.mainLoop();
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
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import eapli.util.Console;

/**
 *User interface displaying the available options within "Configurations"
 * @author Francisco
 */
public class ConfigurationsUI {
    public void mainLoop(){
        int option;
        do{
            System.out.println("======================");
            System.out.println("  Configurations  ");
            System.out.println("======================\n");
            System.out.println("1. Define Expense type");
            System.out.println("2. Configure Alerts");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("0. Go back\n\n");
            option = Console.readInteger("Please choose a option");
            switch(option){
                case 1:
                    ExpenseTypeUI type = new ExpenseTypeUI();
                    type.mainLoop();
                    break;
                case 2:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un1 = new UnavailableFunctionUI();
                    un1.mainLoop();
                    break;
                case 3:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un3 = new UnavailableFunctionUI();
                    un3.mainLoop();
                    break;
                case 4:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un4 = new UnavailableFunctionUI();
                    un4.mainLoop();
                    break;
                case 0:
                    /* returns to main menu */
                    return;
                default:
                    System.out.println("Unknown option\nPlease try again!");
            } // end switch
        } while(option != 0);
    } // end mainLoop
}//end class

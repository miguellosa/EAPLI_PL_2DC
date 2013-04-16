package Presentation;

import Controllers.BaseController;
import eapli.util.Console;
import java.util.Date;
import java.util.*;
import Model.Expense;
import Model.Income;
import Controllers.ExportController;
import ImportsExports.ExportCSV;
/**
 * User interface displaying the available options within "ExportImportDataUI"
 * @author João Carreira
 */
public class ExportImportDataUI extends BaseUI {
    
    private BaseController controller = new BaseController();
    
    @Override
    public BaseController controller(){
        return controller;
    }

    @Override
    public void show() {
        headline();
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("  Export/Import Data  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop(){
        int option;
        do{
            System.out.println("1. Export to CSV");
            System.out.println("2. Export to XML");
            System.out.println("3. Import from CSV");
            System.out.println("4. Import from XML");
            System.out.println("0. Go back\n\n");
            option = Console.readInteger("Please choose a option");
            switch(option){
                case 1:
                   
                    
                    List<Expense> tempListExp = new ArrayList();
                    List<Income> tempListInc = new ArrayList();
                    Date datebegin = Console.readDate("Beginning Date: ");
                    Date datend = Console.readDate("End Date: ");
                    
                    ExportController expController = new ExportController();
                    tempListExp = expController.exportExpenses(datebegin, datend);
                    tempListInc = expController.exportIncome(datebegin, datend);
                    
                    ExportCSV exp = new ExportCSV();
                    exp.exportExpensesIncomesToCSV(tempListExp, tempListInc,datebegin,datend);
                    
                    break;
                case 2:
                    /* replace the following code for appropriate function once it's implemented */
                    UnavailableFunctionUI un2 = new UnavailableFunctionUI();
                    un2.mainLoop();
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
} // end class

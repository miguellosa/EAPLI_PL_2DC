package Presentation;

import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import eapli.util.Console;

/**
 * User interface displaying the available options within "Display Expense"
 * @author João Carreira
 */
public class DisplayExpensesUI extends BaseUI {

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
        int option,option1;
        do{
            
            System.out.println("1. Monthly expenses");
            System.out.println("2. Weekly expenses");
            System.out.println("0. Go back\n\n");
            option = Console.readInteger("Please choose a option");
            switch(option){
                case 1:
                    /* replace the following code for appropriate function once it's implemented */
                    //System.out.println("Which month?\n (");
                    option1 = Console.readInteger("Which Month?\n (0-January until 11-December)");
                    showMonthlyExpenses(option1);
                    //UnavailableFunctionUI un1 = new UnavailableFunctionUI();
                    //un1.mainLoop();
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
    
    public void showMonthlyExpenses(int mes){ //...
       IExpenseTypeRepository typerepo=new ExpenseTypeRepository();
       IExpenseRepository repo=new ExpenseRepository();
        System.out.println("mes "+mes);
        for (int i = 0; i < typerepo.getTypeRep().size(); i++) { //lista de tipos
             System.out.println("mes1111 "+mes);
            for (int j = 0; j <repo.getAllExpenses().size(); j++) { //lista de expenses
                 System.out.println("mes123"+mes);
                 System.out.println("mes123 "+repo.getAllExpenses().get(j).getExpenseMonth());
                if(mes==repo.getAllExpenses().get(j).getExpenseMonth()){ 
                     System.out.println("tipo1 "+typerepo.getTypeRep().get(i).getDescription());
                      System.out.println("tiii "+repo.getAllExpenses().get(j).getDescription());
                     if( typerepo.getTypeRep().get(i).getDescription().equals(repo.getAllExpenses().get(j).getExptype().getDescription()))//se for do tipo na pos (i)
                     {
                         System.out.println(repo.getAllExpenses().get(i).toString());
                     }
                }
            }
        }
    }

}
package Presentation;

import Controllers.BaseController;
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
        do{
            
            System.out.println("1. Monthly expenses");
            System.out.println("2. Weekly expenses");
            System.out.println("0. Go back\n\n");
            option = Console.readInteger("Please choose an option");
            switch(option){
                case 1:
                    option1 = Console.readInteger("Which Year?");
                    option2 = Console.readInteger("Which Month?\n (0-January until 11-December)");
                    showMonthlyExpenses(option1,option2);
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
    
    public void showMonthlyExpenses(int ano,int mes){ //...
       IExpenseTypeRepository typerepo=new ExpenseTypeRepository();
       IExpenseRepository repo=new ExpenseRepository();
       //Compara cada tipo de despesa disponiveis, com todas as despesas existentes
        for (int i = 0; i < typerepo.getTypeRep().size(); i++) { //lista de tipos
           System.out.println("Tipo de Despesa: "+typerepo.getTypeRep().get(i).getDescription());
            for (int j = 0; j <repo.getAllExpenses().size(); j++) { //lista de expenses
                System.out.println("Ano "+repo.getAllExpenses().get(j).getExpenseYear());
                System.out.println("Mes utilizador "+mes);
                System.out.println("Mes das despesas "+repo.getAllExpenses().get(j).getExpenseMonth());
                if(mes+1==repo.getAllExpenses().get(j).getExpenseMonth()){ 
                     System.out.println("tipos de Despesas "+typerepo.getTypeRep().get(i).getDescription());
                     System.out.println("tipo da despesa "+repo.getAllExpenses().get(j).getExptype().getDescription());
                     if( typerepo.getTypeRep().get(i).getDescription().equals(repo.getAllExpenses().get(j).getExptype().getDescription()))// compara os tipos da despesas, com os tipos existentes)
                     {
                         System.out.println("igual "+repo.getAllExpenses().get(j).toString());
                     }
                }
            }
            System.out.println("-------------------------------------------------------------");
        }
    }

}
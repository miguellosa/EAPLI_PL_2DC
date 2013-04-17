
package Presentation;

import Controllers.BaseController;
import eapli.util.Console;


public class MainMenu extends BaseUI {
    
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
        System.out.println("  EXPENSE MANAGER  ");
        System.out.println("===================\n");
    }

    @Override
    public void mainLoop() {
        int option;
        final int REGISTEREXPENSE=1, REGISTERINCOME=2, REGISTERPAYMENTMETHOD=3, REGISTERINCOMETYPE=4, REGISTEREXPENSETYPE=5,QUERIES=6, IMPORTEXPORT=7, QUIT=0;  
        do {
            System.out.println("  ===  Main Menu  ===  ");
            System.out.println("1. Register Expense");
            System.out.println("2. Register Income");
            System.out.println("3. Register Payment Method");
            System.out.println("4. Register Income Type");
            System.out.println("5. Register Expense Type");
            System.out.println("6. Queries");
            System.out.println("7. Import/Export data");
            System.out.println("0. Exit\n");
            
            option = Console.readInteger("Please choose a option");
            
            switch (option) {
                case QUIT:
                    System.out.println("Arrivederci !");
                    return;
                    
                case REGISTEREXPENSE:
                    ExpenseRegisterUI exReg = new ExpenseRegisterUI();
                    exReg.show();
                    break;
                    
                case REGISTERINCOME:
                    IncomeRegisterUI incReg = new IncomeRegisterUI();
                    incReg.show();
                    break;
                    
                case REGISTERPAYMENTMETHOD:
                    PaymentMethodRegisterUI pmrUI = new PaymentMethodRegisterUI();
                    pmrUI.show();
                    break;
                    
                case REGISTERINCOMETYPE:
                    IncomeTypeUI incType = new IncomeTypeUI();
                    incType.show();
                    break;
                    
                case REGISTEREXPENSETYPE:
                    ExpenseTypeUI type = new ExpenseTypeUI();
                    type.show();
                    break;
                    
                case QUERIES:
                    QueriesUI quer = new QueriesUI();
                    quer.show();
                    break;
                    
                case IMPORTEXPORT:
                    ExportImportDataUI eID = new ExportImportDataUI();
                    eID.show();
                    break;
                    
                default:
                    System.out.println("Unknown option\nPlease try again!");
                    break;
            }
        } while (option != 0);
    }
}

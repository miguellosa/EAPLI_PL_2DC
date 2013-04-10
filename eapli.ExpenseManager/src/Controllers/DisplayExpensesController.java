/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseRepository;
import Persistence.IExpenseTypeRepository;
import Presentation.DisplayExpensesUI;
import java.util.List;

/**
 *
 * @author i110557
 */
public class DisplayExpensesController {

    public void showMonthlyExpenses(int year, int month){
       List<Expense> repo = ExpenseRepository.getInstance().getAllExpenses();
       DisplayExpensesUI displayexp= new DisplayExpensesUI();
       IExpenseTypeRepository typerepo=new ExpenseTypeRepository();      
       
        displayexp.showMonthlyExpenses("-------------------------------------------------------------");
        for (int i = 0; i < typerepo.getTypeRep().size(); i++) { //List of ExpenseTypes
           displayexp.showMonthlyExpenses("Expense Type: "+typerepo.getTypeRep().get(i).getDescription());
            for (int j = 0; j <repo.size(); j++) { //List of Expenses
                if(month+1==repo.get(j).getExpenseMonth() && year==repo.get(j).getExpenseYear()){ 
                     if( typerepo.getTypeRep().get(i).getDescription().equals(repo.get(j).getExptype().getDescription()))// compara os tipos da despesas, com os tipos existentes)
                     {
                         displayexp.showMonthlyExpenses(repo.get(j).toString());
                     }
                }
            }
             displayexp.showMonthlyExpenses("-------------------------------------------------------------");
        }
    }
 }
   

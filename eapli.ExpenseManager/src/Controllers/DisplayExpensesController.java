
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i110557
 */
public class DisplayExpensesController {

    public List<Expense> showMonthlyExpenses(int year, int month){
        
       List<Expense> repo = ExpenseRepository.getInstance().getAllExpenses();
       List<ExpenseType> typerepo=ExpenseTypeRepository.getInstance().getTypeRep();      
        List<Expense> display=new ArrayList<Expense>();
        for (int i = 0; i < typerepo.size(); i++) { //List of ExpenseTypes
            for (int j = 0; j <repo.size(); j++) { //List of Expenses
                if(month+1==repo.get(j).getExpenseMonth() && year==repo.get(j).getExpenseYear()){ 
                     if( typerepo.get(i).getDescription().equals(repo.get(j).getExptype().getDescription()))// compara os tipos da despesas, com os tipos existentes)
                     {
                        display.add(repo.get(j));
                     }
                }
            }
        }
        return display;
    }
 }

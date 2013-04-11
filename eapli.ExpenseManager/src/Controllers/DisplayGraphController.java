/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseRecord;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.ExpenseTypeRepository;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tiago
 */
public class DisplayGraphController {
    
    public DisplayGraphController(){}
    
    public List<ExpenseType> getExpenseTypes()
    {
       return ExpenseTypeRepository.getInstance().getTypeRep();
    }
    public void getSum(int year, int month ,List<ExpenseType> types){
        
        BigDecimal sums[]=new BigDecimal[ExpenseTypeRepository.getInstance().getTypeRep().size()];
        for(int i=0;i<types.size();i++)
        {
            List<Expense> expenses=new ArrayList<Expense>();
            expenses=ExpenseRepository.getInstance().getExpensesTypeByMonth(year, month, types.get(i));
            ExpenseRecord calculate=new ExpenseRecord();
            BigDecimal sum = BigDecimal.ZERO;
            sum=calculate.getSumExpenses(expenses);
            sums[i]=sum;
            //TODO: falta acrescentar a matriz que sera o grafico
        }
    }
    
}

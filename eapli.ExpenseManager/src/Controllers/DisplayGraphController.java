/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.*;
import Persistence.*;
import java.math.BigDecimal;
import java.util.*;

/**
 * Class that will connect the persistence package and the GUI, based on the creation of a chart to display expenses
 * @author André Silva 1100859
 * @author Tiago Pacheco 1110333
 * @version 1.0
 */
public class DisplayGraphController {
    
    /**
     * Constructor of the graph expenses controller
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     */
    public DisplayGraphController(){}
    
    /**
     * Controller that will return a list with types of expenses
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @return types of expenses
     */
    public List<ExpenseType> getExpenseTypes()
    {
       return ExpenseTypeRepository.getInstance().getTypeRep();
    }
    
    /**
     * Controller that will return a list of expenses sums, grouped by type
     * @author André Silva 1100859
     * @author Tiago Pacheco 1110333
     * @version 1.0
     * @since 1.0
     * @param year year of expenses
     * @param month month of expenses
     * @param types type of expenses
     * @return sums of expenses grouped by type
     */
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
        
        //FIX: returnar um array de somas sums  return sums;      
    }
    
}

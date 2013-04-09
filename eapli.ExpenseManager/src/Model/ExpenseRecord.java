/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author i100596
 * @author i100570
 */
public class ExpenseRecord {
    
    public ExpenseRecord(){}
    
    public BigDecimal getSumExpenses(List<Expense> listExpense){
        
        BigDecimal sum = BigDecimal.ZERO;
        
        
        for(int i = 0; i < listExpense.size(); i++){
            sum = sum.add(listExpense.get(i).getAmount());
        }
        
        return sum;
    }
    
}

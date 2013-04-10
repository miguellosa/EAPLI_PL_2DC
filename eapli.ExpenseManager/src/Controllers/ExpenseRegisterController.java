/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;


import Model.PaymentMethod;


import java.math.BigDecimal;
import java.util.Date;
import Persistence.*;
/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseRegisterController {

    public ExpenseRegisterController() {
    }



    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expType, PaymentMethod payMeth) {    
        Expense expense = new Expense( what, date, amount, expType, payMeth);
        
        ExpenseRepository.getInstance().save(expense);
        
        BigDecimal value = new BigDecimal (0.0);
        value.subtract(amount);
    }   
}

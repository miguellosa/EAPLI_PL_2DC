/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;

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

    public void registerExpense(String what, Date date, BigDecimal amount,ExpenseType exp) {
        Expense expense = new Expense( what, date, amount,exp);
        IExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }   
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;

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

    public void registerExpense(String what, Date date, BigDecimal amount) {
        Expense expense = new Expense( what, date, amount);
        IExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }   
}

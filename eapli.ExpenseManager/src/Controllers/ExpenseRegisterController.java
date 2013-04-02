/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.Expense;
import Model.ExpenseType;
<<<<<<< HEAD
=======
import Model.PaymentMethod;
>>>>>>> d2b4b9b413a461303a93edd1b389309909806ebd

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

<<<<<<< HEAD
    public void registerExpense(String what, Date date, BigDecimal amount,ExpenseType exp) {
        Expense expense = new Expense( what, date, amount,exp);
=======
    public void registerExpense(String what, Date date, BigDecimal amount, ExpenseType expType, PaymentMethod payMeth) {
        Expense expense = new Expense( what, date, amount, expType, payMeth);
>>>>>>> d2b4b9b413a461303a93edd1b389309909806ebd
        IExpenseRepository repo = new ExpenseRepository();
        repo.save(expense);
    }   
}

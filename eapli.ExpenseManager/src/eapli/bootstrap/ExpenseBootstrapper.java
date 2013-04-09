/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.Expense;
import Model.ExpenseType;
import Model.PaymentMethodCash;
import Persistence.ExpenseRepository;
import Persistence.IExpenseRepository;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseBootstrapper {

    static {
        IExpenseRepository repo = new ExpenseRepository();
        repo.save(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),new ExpenseType("Transportes"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),new ExpenseType("Alimentação"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),new ExpenseType("Vestuário"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0),new ExpenseType("Lazer"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Futebol", 2013, 3, 4, new BigDecimal(5.0),new ExpenseType("Lazer"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Flores", 2013, 3, 4, new BigDecimal(5.0),new ExpenseType("Lazer"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Café", 2013, 3, 4, new BigDecimal(5.0),new ExpenseType("Alimentação"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Roupa", 2013, 3, 4, new BigDecimal(5.0),new ExpenseType("Vestuário"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Lavandaria", 2013, 3, 4, new BigDecimal(5.0),new ExpenseType("Vestuário"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Roupa2012", 2012, 4, 3, new BigDecimal(5.0),new ExpenseType("Vestuário"), new PaymentMethodCash(" ")));
        repo.save(new Expense("Lavandaria2012", 2012, 3, 4, new BigDecimal(5.0),new ExpenseType("Vestuário"), new PaymentMethodCash(" ")));
        
    }
}

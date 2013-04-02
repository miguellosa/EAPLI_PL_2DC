/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.Expense;
import Model.ExpenseType;
import Persistence.ExpenseRepository;
import Persistence.IExpenseRepository;
import java.math.BigDecimal;

/**
 *
 * @author Paulo Gandra Sousa
 */
public class ExpenseBootstrapper { //  ver em casa!

    static {
        IExpenseRepository repo = new ExpenseRepository();
        
        ExpenseType et1=new ExpenseType("Alimentação");
        ExpenseType et2=new ExpenseType("Vestuário");
        ExpenseType et3=new ExpenseType("Transportes");
        ExpenseType et4=new ExpenseType("Lazer");
        
        
        repo.save(new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),et3));
        repo.save(new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),et1));
        repo.save(new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),et2));
        repo.save(new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0),et4));
    }
}

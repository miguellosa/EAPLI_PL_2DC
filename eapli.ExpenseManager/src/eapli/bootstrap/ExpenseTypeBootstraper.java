/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.ExpenseType;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseTypeRepository;

/**
 *
 * @author i100447
 */
public class ExpenseTypeBootstraper {
     static {
        IExpenseTypeRepository repo = new ExpenseTypeRepository();
        
        repo.save(new ExpenseType("Alimentação"));
        repo.save(new ExpenseType("Vestuário"));
        repo.save(new ExpenseType("Transportes"));
        repo.save(new ExpenseType("Lazer"));
        
     }
     
}

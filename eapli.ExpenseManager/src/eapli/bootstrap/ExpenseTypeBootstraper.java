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
        ExpenseTypeRepository.getInstance().save(new ExpenseType("Alimentação"));
        ExpenseTypeRepository.getInstance().save(new ExpenseType("Vestuário"));
        ExpenseTypeRepository.getInstance().save(new ExpenseType("Transportes"));
        ExpenseTypeRepository.getInstance().save(new ExpenseType("Lazer"));
        
     }
     
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.List;

/**
 *
 * @author i100447
 */
public interface IExpenseTypeRepository {
     void save(ExpenseType type);
     List<ExpenseType> getTypeRep();
}

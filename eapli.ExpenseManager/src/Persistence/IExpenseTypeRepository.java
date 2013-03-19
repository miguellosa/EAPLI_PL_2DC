/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;

/**
 *
 * @author i100447
 */
public interface IExpenseTypeRepository {
     void save(ExpenseType type);
  //  List<Expense> getAllExpenses();
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.List;

import Model.ExpenseType;

/**
 * 
 * @author i100447
 */
public interface IExpenseTypeRepository {
    ExpenseType save(ExpenseType expenseType);

    ExpenseType findForName(String key);

    List<ExpenseType> getTypeRep();
    
    //ExpeseType findOrCreate(String key,String description);
    
    //public List<ExpenseType> all();
}

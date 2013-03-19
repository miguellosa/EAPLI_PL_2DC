/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.ExpenseType;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author i100447
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository{
    
    private static List<ExpenseType> listExpenseType = new ArrayList<ExpenseType>();
    
    public ExpenseTypeRepository(){}
    
    public void save(ExpenseType type)
    {
        if (type==null)
        {
            throw new IllegalArgumentException();
        }
        listExpenseType.add(type);
    }
}

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
 * @author i110557
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository{
    
    private static List<ExpenseType> listExpenseType;
    
    private static ExpenseTypeRepository instance = null;
    
    private ExpenseTypeRepository(){
        listExpenseType = new ArrayList<ExpenseType>();
    }
    
    public static ExpenseTypeRepository getInstance(){
        if(instance == null)
            instance = new ExpenseTypeRepository();
        return instance;    
    }
            
    
    public void save(ExpenseType type)
    {
        if (type==null)
        {
            throw new IllegalArgumentException();
        } 
        listExpenseType.add(type);
    }
    public List<ExpenseType> getTypeRep(){
        return listExpenseType;
       
    }
}

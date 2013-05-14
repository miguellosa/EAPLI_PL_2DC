/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.inmemory;

import java.util.*;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;

/**
 * 
 * @author i110557
 */
public class ExpenseTypeRepository implements IExpenseTypeRepository {

    private static List<ExpenseType> listExpenseType;

    private static ExpenseTypeRepository instance = null;

    private ExpenseTypeRepository() {
	listExpenseType = new ArrayList<ExpenseType>();
    }

    public static ExpenseTypeRepository getInstance() {
	if (instance == null)
	    instance = new ExpenseTypeRepository();
	return instance;
    }

    @Override
    public ExpenseType save(ExpenseType type) {
	if (type == null)
	    throw new IllegalArgumentException();
	listExpenseType.add(type);

	return type;
    }

    @Override
    public List<ExpenseType> getTypeRep() {
	return listExpenseType;

    }

    @Override
    public ExpenseType findForName(String key) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Not supported yet.");
    }

}

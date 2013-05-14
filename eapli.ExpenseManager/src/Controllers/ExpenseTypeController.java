/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import java.util.List;

import Model.ExpenseType;
import Persistence.inmemory.ExpenseTypeRepository;
import Persistence.jpa.ExpenseTypeRepositoryImpl;

/**
 * 
 * @author Magano
 */
public class ExpenseTypeController extends BaseController {

    public ExpenseTypeController() {
    }

    public void RegisterExpenseType(String desc, String shortname) {
	ExpenseType expType = new ExpenseType(desc, shortname);
	ExpenseTypeRepositoryImpl repo = new ExpenseTypeRepositoryImpl();
	repo.save(expType);
    }

    public List<ExpenseType> getRegisterExpenseTypeList() {
	return ExpenseTypeRepository.getInstance().getTypeRep();
    }

}

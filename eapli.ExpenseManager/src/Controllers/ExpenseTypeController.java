/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Model.PaymentType;
import Persistence.*;
import java.util.List;

/**
 *
 * @author Magano
 */
public class ExpenseTypeController {

    
    public ExpenseTypeController() {
    }

    public void RegisterExpenseType(String desc) {
        ExpenseType expType = new ExpenseType(desc);
        IExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expType);
    }
    public List<ExpenseType> getRegisterExpenseTypeList(){
        IExpenseTypeRepository repo = new ExpenseTypeRepository();
        return repo.getTypeRep();
    }
    
}

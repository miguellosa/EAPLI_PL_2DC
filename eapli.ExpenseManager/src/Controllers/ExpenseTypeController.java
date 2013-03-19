/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.ExpenseType;
import Persistence.*;

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
}

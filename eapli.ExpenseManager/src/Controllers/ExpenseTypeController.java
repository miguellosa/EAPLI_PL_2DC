/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

/**
 *
 * @author Magano
 */
public class ExpenseTypeController {
    
    public ExpenseTypeController() {
    }
    
    public void RegisterExpenseType(){
        ExpenseType expType = new ExpenseType();
        ExpenseTypeRepository repo = new ExpenseTypeRepository();
        repo.save(expType);
    }
}

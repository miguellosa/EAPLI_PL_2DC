/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;
import Model.*;
import java.util.List;
/**
 *
 * @author i110557
 */
public interface IExpenseRepository {
    void save(Expense exp);
    List<Expense> getAllExpenses();      
}

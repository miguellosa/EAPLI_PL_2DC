/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import Persistence.IIncomeTypeRepository;

/**
 *
 * @author i090566
 */
public class IncomeTypeController {
    public IncomeTypeController() {}

    public void RegisterIncomeType(String description) {
        IncomeType incomeType = new IncomeType(description);
        IIncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(incomeType);
    }
}

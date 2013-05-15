/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Model.IncomeType;
import Persistence.IIncomeTypeRepository;
import Persistence.inmemory.IncomeTypeRepository;

/**
 *
 * @author i090566
 */
public class IncomeTypeController {
    public IncomeTypeController() {}

    public void RegisterIncomeType(String shortName, String description) {
        IncomeType incomeType = new IncomeType(shortName, description);
        IIncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(incomeType);
    }
}

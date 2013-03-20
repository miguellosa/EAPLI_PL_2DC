package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.IncomeRepository;
import java.util.Date;

public class IncomeRegisterController {

    public IncomeRegisterController() {
    }

    public void registerIncome(Double value, Date date, String description, IncomeType type ) {
        
        Income income = new Income(type, value, date, description);
        IncomeRepository repo = new IncomeRepository(); 
        repo.save(income);
        
    }
    
}

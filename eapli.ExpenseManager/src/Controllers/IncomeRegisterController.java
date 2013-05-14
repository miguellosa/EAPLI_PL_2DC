package Controllers;

import Model.Income;
import Model.IncomeType;
import Persistence.inmemory.IncomeRepository;

import java.math.BigDecimal;
import java.util.Date;

public class IncomeRegisterController {

    public IncomeRegisterController() {
    }

    public void registerIncome(BigDecimal value, Date date, String description, IncomeType type ) {
        
        Income income = new Income(type, value, date, description);
        IncomeRepository repo = new IncomeRepository(); 
        repo.save(income);
        
    }
    
}

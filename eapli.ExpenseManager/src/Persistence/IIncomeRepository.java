package Persistence;

import Model.Income;
import java.util.List;


public interface IIncomeRepository {
    
    void save (Income income);
    List<Income> getAllIncomes(); 
    
}

package Persistence.inmemory;

import Model.Expense;
import Model.Income;
import Persistence.IIncomeRepository;

import java.util.ArrayList;
import java.util.List;

public class IncomeRepository implements IIncomeRepository {

    private static List<Income> listIncome= new ArrayList<Income>();

    public IncomeRepository() {}
    
    public void save(Income income)
    {
        if (income==null) throw new IllegalArgumentException();
        listIncome.add(income);
      
    }
    
     public List<Income> getAllIncomes(){
        return listIncome;
    }
}

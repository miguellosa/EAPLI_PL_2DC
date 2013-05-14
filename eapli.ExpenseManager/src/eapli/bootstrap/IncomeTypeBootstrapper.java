package eapli.bootstrap;

import Model.IncomeType;
import Persistence.inmemory.IncomeTypeRepository;


public class IncomeTypeBootstrapper {
    
    static{
        IncomeTypeRepository repo = new IncomeTypeRepository();
        repo.save(new IncomeType("Salário"));
        repo.save(new IncomeType("Mesada"));
        repo.save(new IncomeType("Prestação de serviços"));
    }
    
}

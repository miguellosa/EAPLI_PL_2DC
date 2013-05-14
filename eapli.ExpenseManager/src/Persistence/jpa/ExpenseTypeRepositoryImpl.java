package Persistence.jpa;

import java.util.List;

import javax.persistence.*;

import Model.ExpenseType;
import Persistence.IExpenseTypeRepository;

public class ExpenseTypeRepositoryImpl implements IExpenseTypeRepository {

    @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence
	    .createEntityManagerFactory("eapli.expensesPU");

    protected EntityManager getEntityManager() {
	EntityManager entityManager = emf.createEntityManager();
	return entityManager;
    }

    EntityManager manager = getEntityManager();

    @Override
    public ExpenseType save(ExpenseType type) {
	manager.getTransaction().begin();
	manager.persist(type);
	manager.getTransaction().commit();
	manager.close();

	return type;
    }

    @Override
    public List<ExpenseType> getTypeRep() {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ExpenseType findForName(String key) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Not supported yet.");
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.jpa;

import Model.PaymentMean;
import Persistence.IPaymentMeanRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

/**
 *
 * @author 110047
 */
public class PaymentMeanRepositoryImpl implements IPaymentMeanRepository {
    
    @PersistenceUnit
    static protected EntityManagerFactory emf = Persistence
	    .createEntityManagerFactory("eapli.paymentMeanPU");

    protected EntityManager getEntityManager() {
	EntityManager entityManager = emf.createEntityManager();
	return entityManager;
    }

    EntityManager manager = getEntityManager();

    @Override
    public PaymentMean save(PaymentMean type) {
	manager.getTransaction().begin();
	manager.persist(type);
	manager.getTransaction().commit();
	manager.close();

	return type;
    }

    @Override
    public List<PaymentMean> getTypeRep() {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public PaymentMean findForName(String key) {
	// TODO Auto-generated method stub
	throw new UnsupportedOperationException("Not supported yet.");
    }

}

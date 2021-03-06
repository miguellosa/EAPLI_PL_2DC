/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.PersistenceFactory;
import Persistence.jpa.PaymentMeanRepositoryImpl;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Luis Mendes
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PaymentMean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    Long id;
    
    public PaymentMean(){}
    
    /*@Override
    public void save(){
        PaymentMeanRepositoryImpl repo = PersistenceFactory.buildPersistenceFactory().paymentMeanRepository();
        repo.save(this);
    }
    public static List(<PaymentMean> loadAll){
            PaymentMeanRepositoryImpl repo = PersistenceFactory.buildPersistenceFactory().paymentMeanRepository();
        return repo.all();
    }*/
    
    abstract public String getDescription();
    public abstract String toXml();
    public abstract String toCsv();
    
}

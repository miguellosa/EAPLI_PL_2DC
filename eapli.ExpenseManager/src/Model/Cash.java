/*
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistence.PersistenceFactory;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author 1100447
 */

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Cash extends PaymentMean {
   
    private String currency;
    public static final String EUR = "EUR";

    public Cash() {
    }

    public Cash(String currency) {
        this.currency = currency;
    }
    
    /*public static Cash loadEUR(){
        
        PaymentMeanRepository repo = PersistenceFactory.buildPersistence();
        return repo.getCash(EUR);
    }*/
    
    @Override
    public String toCsv(){
        return "Cash," + ",,,,," + currency + ",,";
    }
    
    @Override
    public String toXml(){
        return "<currency>" + currency + "</currency>";
    }
    
    @Override
    public String getDescription(){
        return "Cash " + currency;
    }
    
    
}

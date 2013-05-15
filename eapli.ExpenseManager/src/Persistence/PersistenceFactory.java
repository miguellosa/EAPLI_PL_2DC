/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import eapli.expensemanager.ExpenseManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Miguel
 */
public class PersistenceFactory {
    
    private PersistenceFactory(){
        
    }
    
    public static RepositoryFactory buildPersistenceFactory(){
        
        String factoryClassName = ExpenseManager.getApplicationProperties().getProperty("persistence.repositoryFactory");
        
        try{
           return (RepositoryFactory) Class.forName(factoryClassName).newInstance();
        } catch(ClassNotFoundException ex) {
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        } catch(InstantiationException ex) {
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE,null,ex);
        } catch(IllegalAccessException ex) {
            Logger.getLogger(PersistenceFactory.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }
        
        return null;
    }
    
}

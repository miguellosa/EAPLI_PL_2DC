/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;


import Model.PaymentMethodCash;
import Model.PaymentMethodCheck;
import Model.PaymentMethodCreditCard;
import Persistence.inmemory.PaymentMethodRepository;

/**
 *
 * @author Luis Mendes
 */
public class ExpenseMethodBootstrapper {
    
     static {
        PaymentMethodRepository  repo = new PaymentMethodRepository();
        repo.save(new PaymentMethodCash());
        repo.save(new PaymentMethodCheck());
        repo.save(new PaymentMethodCash());
     }
    
}

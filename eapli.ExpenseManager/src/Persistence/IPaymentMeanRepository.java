/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMean;
import java.util.List;

/**
 *
 * @author 1100447
 */
public interface IPaymentMeanRepository {
    

    PaymentMean save(PaymentMean type);

    PaymentMean findForName(String key);

    List<PaymentMean> getTypeRep();
}


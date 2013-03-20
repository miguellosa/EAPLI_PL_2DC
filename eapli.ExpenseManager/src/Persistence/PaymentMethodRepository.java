/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import java.util.ArrayList;
import java.util.List;
import Model.*;
/**
 *
 * @author Miguel
 */
public class PaymentMethodRepository implements IPaymentMethodRepository{
    
    private static List<PaymentMethod> listPaymentMethod= new ArrayList<PaymentMethod>();

    public PaymentMethodRepository() {}
    
    public void save(PaymentMethod pay)
    {
        if (pay==null) throw new IllegalArgumentException();
        listPaymentMethod.add(pay);
      
    }
}

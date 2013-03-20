/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence;

import Model.PaymentMethod;

/**
 *
 * @author Miguel
 */
public interface IPaymentMethodRepository {
    void save(PaymentMethod pay);
}

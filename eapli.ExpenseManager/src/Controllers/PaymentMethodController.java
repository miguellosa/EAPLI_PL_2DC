/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.*;
import Persistence.ExpenseTypeRepository;
import Persistence.IExpenseTypeRepository;
import Persistence.IPaymentMethodRepository;
import Persistence.PaymentMethodRepository;
import java.math.BigDecimal;

/**
 *
 * @author Miguel
 */
public class PaymentMethodController {
    
    public PaymentMethodController() {
    }

    
    public void RegisterPaymentMethodCash(String desc) {
        PaymentMethodCash payMethCash = new PaymentMethodCash(desc);
        IPaymentMethodRepository repo = new PaymentMethodRepository();
        repo.save(payMethCash);
    }
    
    public void RegisterPaymentMethodCheck(String desc, int num) {
        PaymentMethodCheck payMethCheck = new PaymentMethodCheck(desc, num);
        IPaymentMethodRepository repo = new PaymentMethodRepository();
        repo.save(payMethCheck);
    }
    
    public void RegisterPaymentMethodCreditCard(String desc, int num, String bank, BigDecimal plafon) {
        PaymentMethodCreditCard payMethCreditCard = new PaymentMethodCreditCard(desc, num, bank, plafon);
        IPaymentMethodRepository repo = new PaymentMethodRepository();
        repo.save(payMethCreditCard);
    }
    
    public void RegisterPaymentMethodDebitCard(String desc, int num, String bank) {
        PaymentMethodDebitCard payMethDebitCard = new PaymentMethodDebitCard(num, desc , bank);
        IPaymentMethodRepository repo = new PaymentMethodRepository();
        repo.save(payMethDebitCard);
    }
}

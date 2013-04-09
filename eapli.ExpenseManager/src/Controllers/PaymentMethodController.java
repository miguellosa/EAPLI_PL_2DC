/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;


import Model.*;
import Persistence.IExpenseTypeRepository;
import Persistence.IPaymentMethodRepository;
import Persistence.PaymentMethodRepository;
import java.math.BigDecimal;
import java.util.List;

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
    
    public List<PaymentMethod> getPaymentMethods(){
        IPaymentMethodRepository repo = new PaymentMethodRepository();
        return repo.getPaymentMehtodList();    
    }
    
   public PaymentMethod RegisterPaymentMethodCheckWithoutSave(String desc, int num) {
        PaymentMethodCheck payMethCheck = new PaymentMethodCheck(desc, num);
        return payMethCheck;
    }
/*
    public PaymentMethod getLastCheck(){
        int numberElem;
        IPaymentMethodRepository repo = new PaymentMethodRepository();
        numberElem = repo.getPaymentMehtodList().size();
        return repo.getPaymentMehtodList().get(numberElem-1);
    }
 */   
    public Boolean verifyIsCheck(PaymentMethod payToTest){
        if (payToTest.getPaymentMethodPaymentType() == PaymentType.Check){
            return true;
        }
        return false;
    }
}

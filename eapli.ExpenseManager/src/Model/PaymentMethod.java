/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Miguel
 */
public abstract class PaymentMethod {
    
    private String description;
    
    private PaymentType paymentType;
  
    public PaymentMethod(String description, PaymentType paymentType){
        this.description=description;
        this.paymentType=paymentType;
    }
    
   public String getPaymentMethodDescription(){
   
       return description;
   }
   
   public PaymentType getPaymentMethodPaymentType(){
   
       return paymentType;
   }
    
    
}

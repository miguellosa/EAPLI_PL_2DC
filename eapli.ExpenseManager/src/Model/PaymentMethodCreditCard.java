/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * This class allows you to create instances of
 * Credit Cards Payment Methods
 * @author Diogo Leite 1100570
 * @author João Machado 1100596
 */
public class PaymentMethodCreditCard extends PaymentMethod {

    private int identificationNumber;
    
    public PaymentMethodCreditCard (String descricao, int identificationNumber)
    {
        super(descricao, PaymentType.CreditCard);
        this.identificationNumber = identificationNumber;
    }

    /**
     * @return the identificationNumber
     */
    public int getNumeroIdentificacao() {
        return identificationNumber;
    }
    
}

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

    private int numeroIdentificacao;
    
    public PaymentMethodCreditCard (String descricao, int numeroIdentificacao)
    {
        super(descricao, PaymentType.CreditCard);
        this.numeroIdentificacao = numeroIdentificacao;
    }

    /**
     * @return the numeroIdentificacao
     */
    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }
    
}

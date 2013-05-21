/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistence.jpa;
import Model.CheckingAccount;
import Persistence.CheckingAccountRepository;
import java.util.Collection;
import java.util.Iterator;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author i110557
 */
public class CheckingAccountRepositoryImp extends JpaRepository<CheckingAccount, Long> implements CheckingAccountRepository{
    
    /** IllegalStateException Esta execução é uma runtime exception.
     * Como tal, apartir da versão 5.0 do J2SE não é necessário efectuar o
     * throws da excepção na declaração do método
     * @return
     */
    
    @Override
    public CheckingAccount theAccount(){
        Collection<CheckingAccount>accounts=super.findAll();
        
        //valida que o retorno da base de dados será sempre apenas um e só um objecto
        assert accounts.size()==1;
        
        //caso seja retornado mais que um objecto, então lançar uma exceção
        if(accounts.size()==1){
            throw new IllegalStateException();
        }
    //caso apenas tenha sido retornado um objecto, obter esse objecto e retorná-lo
        Iterator<CheckingAccount> iterator = accounts.iterator();
       
        return iterator.next();    
    }
    
    @Override
    public CheckingAccount save(CheckingAccount account){
        if(account==null){
            throw new IllegalArgumentException();
        }
        EntityManager em= getEntityManager();
        assert em!= null;
        EntityTransaction tx= em.getTransaction();
        tx.begin();
        if(account.hasId()){
            account=update(account);
        }else{
            account=create(account);
        }
        tx.commit();
        em.close();
        return account;
    }
    
 }
     

                  
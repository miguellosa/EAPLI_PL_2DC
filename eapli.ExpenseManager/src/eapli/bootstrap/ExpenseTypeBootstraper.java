/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import Model.ExpenseType;
import Persistence.inmemory.ExpenseTypeRepository;

/**
 * 
 * @author i100447
 */
public class ExpenseTypeBootstraper {

    static {
	ExpenseTypeRepository.getInstance().save(
		new ExpenseType("Alimentação", "Ali"));
	ExpenseTypeRepository.getInstance().save(
		new ExpenseType("Vestuário", "Ves"));
	ExpenseTypeRepository.getInstance().save(
		new ExpenseType("Transportes", "Tran"));
	ExpenseTypeRepository.getInstance().save(
		new ExpenseType("Lazer", "Laz"));

    }

}

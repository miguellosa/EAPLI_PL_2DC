/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eapli.bootstrap;

import java.math.BigDecimal;

import Model.*;
import Persistence.inmemory.ExpenseRepository;

/**
 * 
 * @author Paulo Gandra Sousa
 */
public class ExpenseBootstrapper {

    static {
	ExpenseRepository.getInstance().save(
		new Expense("Autocarro", 2013, 3, 4, new BigDecimal(2.4),
			new ExpenseType("Transportes", "Tran"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Almoço", 2013, 3, 5, new BigDecimal(12.4),
			new ExpenseType("Alimentação", "Ali"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Sapatilhas", 2013, 3, 4, new BigDecimal(123.4),
			new ExpenseType("Vestuário", "Ves"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Cinema", 2013, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Lazer", "Laz"), new PaymentMethodCash(
				" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Futebol", 2013, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Lazer", "Laz"), new PaymentMethodCash(
				" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Flores", 2013, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Lazer", "Laz"), new PaymentMethodCash(
				" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Café", 2013, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Alimentação", "Ali"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Roupa", 2013, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Vestuário", "Ves"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Lavandaria", 2013, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Vestuário", "Ves"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Roupa2012", 2012, 4, 3, new BigDecimal(5.0),
			new ExpenseType("Vestuário", "Ves"),
			new PaymentMethodCash(" ")));
	ExpenseRepository.getInstance().save(
		new Expense("Lavandaria2012", 2012, 3, 4, new BigDecimal(5.0),
			new ExpenseType("Vestuário", "Ves"),
			new PaymentMethodCash(" ")));

    }
}

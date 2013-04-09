/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.ExpenseRegisterController;
import Controllers.ExpenseTypeController;
import Controllers.PaymentMethodController;
import Model.ExpenseType;
import Model.PaymentMethod;

import eapli.util.Console;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI extends BaseUI {
    
    @Override
    public BaseController controller(){
        return null;
    }

    @Override
    public void show() {
        headline();
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("  Register an expense!  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop() {
        
        PaymentMethodController paymentMethod;
        ExpenseTypeController expenseType;
        ExpenseRegisterController controller;
        
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        System.out.println("Expense Type: ");
        expenseType = new ExpenseTypeController();
        List<ExpenseType> listExpenseTypePrint= new ArrayList<ExpenseType>();
        listExpenseTypePrint = expenseType.getRegisterExpenseTypeList();
        for (int i = 0; i<listExpenseTypePrint.size();i++){
            System.out.println(i+1 +" - "+ listExpenseTypePrint.get(i).getDescription());
        }
        int type = Console.readInteger("Select One:");           

        System.out.println("Method: ");
        paymentMethod = new PaymentMethodController();
        List<PaymentMethod> listPaymentMethodToPrint= new ArrayList<PaymentMethod>();
        listPaymentMethodToPrint = paymentMethod.getPaymentMethods();
        for (int i = 0; i<listPaymentMethodToPrint.size();i++){
            System.out.println(i+1 +" - "+ listPaymentMethodToPrint.get(i).getPaymentMethodDescription());
        }
        int selectedMethod = Console.readInteger("Select One:");
        

        if (paymentMethod.verifyIsCheck(listPaymentMethodToPrint.get(selectedMethod-1)) == true ){
            System.out.println("Create new check: ");
            int checkNumber = Console.readInteger("Check:Number: ");
            PaymentMethodController checkCreateController = new PaymentMethodController();
            controller = new ExpenseRegisterController();
            controller.registerExpense(what, date, amount,listExpenseTypePrint.get(type-1),checkCreateController.RegisterPaymentMethodCheckWithoutSave(what, checkNumber));
        } else {
            controller = new ExpenseRegisterController();
            controller.registerExpense(what, date, amount,listExpenseTypePrint.get(type-1),listPaymentMethodToPrint.get(selectedMethod-1));
        }
        
        System.out.println("expense recorded.");
    }
}

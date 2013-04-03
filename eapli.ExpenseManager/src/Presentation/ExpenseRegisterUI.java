/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

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
class ExpenseRegisterUI {
    public void mainLoop() {
        
        PaymentMethodController paymentMethod;
        ExpenseTypeController expenseType;
        
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
       
        //Falta listar ou escrever o tipo de despesa
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);

     //   String type = Console.readLine("Type:");
        


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

        
        ExpenseRegisterController controller = new ExpenseRegisterController();

        controller.registerExpense(what, date, amount,listExpenseTypePrint.get(type-1),listPaymentMethodToPrint.get(selectedMethod-1));

        
        System.out.println("expense recorded.");
    }
}

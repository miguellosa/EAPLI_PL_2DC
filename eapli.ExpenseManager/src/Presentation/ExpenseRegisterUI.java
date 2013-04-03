/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;
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
        
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
       
        //Falta listar ou escrever o tipo de despesa
        String n=""; 
        ExpenseType exp=new ExpenseType(n);
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        BigDecimal amount = new BigDecimal(value);
        String type = Console.readLine("Type:");
        paymentMethod = new PaymentMethodController();
        List<PaymentMethod> listPaymentMethodToPrint= new ArrayList<PaymentMethod>();
        listPaymentMethodToPrint = paymentMethod.getPaymentMethods();
        System.out.println("Method: ");
        for (int i = 0; i<listPaymentMethodToPrint.size();i++){
        
            System.out.println(i+1 +" - "+ listPaymentMethodToPrint.get(i));
        }
        
        ExpenseRegisterController controller = new ExpenseRegisterController();

        //controller.registerExpense(what, date, amount,exp);

        //controller.registerExpense(what, date, amount);

        
        System.out.println("expense recorded.");
    }
}

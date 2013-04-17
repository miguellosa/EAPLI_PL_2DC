/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.BaseController;
import Controllers.PaymentMethodController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Miguel
 */
public class PaymentMethodRegisterUI extends BaseUI {
    
     private BaseController controller = new BaseController(); 
    
    @Override
    public BaseController controller(){
        return controller;
    }

    @Override
    public void show() {
        headline();
        System.out.println("Semana: "+controller.showWeeklyExpenses()+"            |||            "+"Mês"+controller.getCurrentMonthExpenses());
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("  Register a payment method  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop() {
        final int CASH=1, CHECK=2, CREDITCARD=3, DEBITCARD=4, QUIT=0;
        String desc, bank;
        BigDecimal plafon;
        int num;
        PaymentMethodController controller = new PaymentMethodController();
        int option = Console.readInteger("Choose a Payment Type:\n1 - Cash\n2 - Check\n3 - Credit Card\n4 - Debit Card\n0 - Go back\n->");
        while (option != -1) {
            switch (option) {
                case QUIT:
                    /*return to MainMenu*/
                    return;
                case CASH:
                    desc = Console.readLine("Description: ");
                    controller.RegisterPaymentMethodCash(desc);
                    option=-1;
                    break;
                case CHECK:
                    desc = Console.readLine("Description: ");
                    controller.RegisterPaymentMethodCheck(desc);
                    option=-1;
                    break;
                case CREDITCARD:
                    desc = Console.readLine("Description: ");
                    bank = Console.readLine("Bank: ");
                    num = Console.readInteger("Credit Card ID number: ");
                    plafon = BigDecimal.valueOf(Console.readDouble("Plafon: "));
                    controller.RegisterPaymentMethodCreditCard(desc, num, bank, plafon);
                    option=-1;
                    break;
                case DEBITCARD:
                    desc = Console.readLine("Description: ");
                    bank = Console.readLine("Bank: ");
                    num = Console.readInteger("Debit Card ID number: ");
                    controller.RegisterPaymentMethodDebitCard(desc, num, bank);
                    option=-1;
                    break;
                default:
                    System.out.println("Choose a correct option!");
                    option = Console.readInteger("Choose a Payment Type:\n0 - Previous Menu\n"
                            + "1 - Cash\n2 - Check\n3 - Credit Card\n4 - Debit Card\n->");
            }
        }

        if (option != 0) {
            System.out.println("Payment Method recorded.");
        }
    }
}

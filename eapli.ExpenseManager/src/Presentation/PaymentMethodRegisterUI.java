/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseTypeController;
import Controllers.PaymentMethodController;
import eapli.util.Console;
import java.math.BigDecimal;

/**
 *
 * @author Miguel
 */
public class PaymentMethodRegisterUI extends BaseUI {

    @Override
    public void show() {
        headline();
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
        String desc, bank;
        BigDecimal plafon;
        int num;
        PaymentMethodController controller = new PaymentMethodController();
        System.out.println("Choose a Payment Type:\n1 - Cash\n2 - Check\n3 - Credit Card\n4 - Debit Card\n");
        int op = Console.readInteger("Choose a Payment Type:\n1 - Cash\n2 - Check\n3 - Credit Card\n4 - Debit Card\n->");
        while (op != -1) {
            switch (op) {
                case 0:
                    MainMenu mm = new MainMenu();
                    mm.mainLoop();
                    op=-1;
                    break;
                case 1:
                    desc = Console.readLine("Description: ");
                    controller.RegisterPaymentMethodCash(desc);
                    op=-1;
                    break;
                case 2:
                    desc = Console.readLine("Description: ");
                    num = Console.readInteger("Check ID number: ");
                    controller.RegisterPaymentMethodCheck(desc, num);
                    op=-1;
                    break;
                case 3:
                    desc = Console.readLine("Description: ");
                    bank = Console.readLine("Bank: ");
                    num = Console.readInteger("Credit Card ID number: ");
                    plafon = BigDecimal.valueOf(Console.readDouble("Plafon: "));
                    controller.RegisterPaymentMethodCreditCard(desc, num, bank, plafon);
                    op=-1;
                    break;
                case 4:
                    desc = Console.readLine("Description: ");
                    bank = Console.readLine("Bank: ");
                    num = Console.readInteger("Debit Card ID number: ");
                    controller.RegisterPaymentMethodDebitCard(desc, num, bank);
                    op=-1;
                    break;
                default:
                    System.out.println("Choose a correct option!");
                    op = Console.readInteger("Choose a Payment Type:\n0 - Previous Menu\n"
                            + "1 - Cash\n2 - Check\n3 - Credit Card\n4 - Debit Card\n->");
            }
        }

        if (op != 0) {
            System.out.println("Payment Method recorded.");
        }
    }
}

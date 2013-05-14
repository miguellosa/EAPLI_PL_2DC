/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.*;
import eapli.util.Console;

/**
 * 
 * @author Magano
 */
class ExpenseTypeUI extends BaseUI {

    private final BaseController controller = new BaseController();

    @Override
    public BaseController controller() {
	return controller;
    }

    @Override
    public void show() {
	headline();
	System.out.println("Semana: " + controller.showWeeklyExpenses()
		+ "            |||            " + "Mês: "
		+ controller.getCurrentMonthExpenses());
	mainLoop();
    }

    @Override
    protected void headline() {
	System.out.println("======================");
	System.out.println("  Register an expense type  ");
	System.out.println("======================\n");
    }

    @Override
    public void mainLoop() {

	String shortname = Console.readLine("shorname?");
	String desc = Console.readLine("Description:");

	ExpenseTypeController controller = new ExpenseTypeController();
	controller.RegisterExpenseType(desc, shortname);

	System.out.println("Expense type recorded.");
    }
}

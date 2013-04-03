package Presentation;

import Controllers.IncomeRegisterController;
import Model.IncomeType;
import Persistence.IncomeTypeRepository;
import eapli.util.Console;
import java.util.Date;
import java.util.List;

public class IncomeRegisterUI extends BaseUI {

    @Override
    public void show() {
        headline();
        mainLoop();
    }
    
    @Override
    protected void headline() {
        System.out.println("======================");
        System.out.println("  Register an income  ");
        System.out.println("======================\n");
    }

    @Override
    public void mainLoop() {

        List<IncomeType> incomeTypeRepo = IncomeTypeRepository.getListIncomeType();
        IncomeRegisterController controller = new IncomeRegisterController();
        int numeroTipo;


        String description = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");



        System.out.println("Income type list:\n\n");

        for (int i = 0; i < incomeTypeRepo.size(); i++) {
            System.out.println((i + 1) + " - " + incomeTypeRepo.get(i).getDescription() + "\n");
        }
        numeroTipo = Console.readInteger("Select income type from list:");
        numeroTipo--;

        while (numeroTipo < 0 || numeroTipo >= incomeTypeRepo.size()) {
            numeroTipo = Console.readInteger("Invalid option! Try again:");
            numeroTipo--;
        }
        
        controller.registerIncome(value, date, description, incomeTypeRepo.get(numeroTipo));
        
        System.out.println("Income registered with success!\n");


    }
}

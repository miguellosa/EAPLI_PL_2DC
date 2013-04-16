package ImportsExports;

import java.util.*;
import java.io.*;
import Model.Expense;
import Model.Income;

/**
 *
 * @author Miguel Ladeiro
 * @author Luis Alves
 */
public class ExportCSV {

    public void exportExpensesIncomesToCSV(List<Expense> listExp, List<Income> listInc) {

        try {
            OutputStream outputStream = new FileOutputStream("ExpensesControler.csv");
            Writer writer = new OutputStreamWriter(outputStream);

            //Código de exportação de csv
            writer.write("List of expenses and incomes between ...");
            writer.write("Expenses");
            writer.write("\n");
            for (int i = 0; i < listExp.size(); i++) {
                writer.write(listExp.get(i).toString());
                writer.write("\n");
            }
            //Escrita das listas com gastos e rendimentos

            writer.write("\n");
            writer.write("Incomes");
            writer.write("\n");

            for (int i = 0; i < listInc.size(); i++) {
                writer.write(listInc.get(i).toString());
                writer.write("\n");
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}

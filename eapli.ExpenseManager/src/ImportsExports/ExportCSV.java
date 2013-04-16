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

    public void exportExpensesIncomesToCSV(List<Expense> listExp, List<Income> listInc, Date db, Date de) {

        try {
            OutputStream outputStream = new FileOutputStream("ExpensesControler.csv");
            Writer writer = new OutputStreamWriter(outputStream);

            //Código de exportação de csv
            writer.write("List of expenses and incomes between " +db.toString()+ " and " +de.toString());
            writer.write("\n\nExpenses");
            writer.write("\n");
            writer.write("Description ; Amount ; Date \n");
            for (int i = 0; i < listExp.size(); i++) {
                writer.write(listExp.get(i).toStringCSV());
                writer.write("\n");
            }
            //Escrita das listas com gastos e rendimentos

            writer.write("\n\n");
            writer.write("Incomes\n\n");
            writer.write("Description ; Amount ; Income Type ; Date \n");
            writer.write("\n");
            
           
            for (int i = 0; i < listInc.size(); i++) {
                writer.write(listInc.get(i).toStringCSV());
                writer.write("\n");
            }
            
            writer.close();
            outputStream.close();
            
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}

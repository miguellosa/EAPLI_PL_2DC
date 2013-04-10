package ImportsExports;

import java.util.*;
import java.io.*;

/**
 *
 * @author Miguel Ladeiro
 * @author Luis Alves
 */

public class ExportCSV {

    public void exportExpensesIncomesToCSV() {
        
        try {
            OutputStream outputStream = new FileOutputStream("ExpensesControler.csv");
            Writer writer = new OutputStreamWriter(outputStream);
            
            //Código de exportação de csv
            writer.write("List of expenses and incomes between ...");
            writer.write("Expense");
            writer.write("\n");
            //Escrita das listas com gastos e rendimentos
                    
                  
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    }

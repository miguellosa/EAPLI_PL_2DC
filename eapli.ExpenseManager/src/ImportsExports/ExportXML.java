/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ImportsExports;

import Model.Expense;
import Model.Income;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;

/**
 *
 * @author i100447
 */
public class ExportXML {
    
    
     public void exportExpensesIncomesToXML(List<Expense> listExp, List<Income> listInc) {

        try {
            OutputStream outputStream = new FileOutputStream("ExpensesControler.xml");
            Writer writer = new OutputStreamWriter(outputStream);

            //Código de exportação de xml
            writer.write("<?xml version=\"1.0\"?>\n");
            writer.write("<Items>\n");
            writer.write("\t<Expenses>\n");
            
            for (int i = 0; i < listExp.size(); i++) {
                writer.write(listExp.get(i).toStringXML());
            }
            //Escrita das listas com gastos e rendimentos

            writer.write("\t<\\Expenses>\n");
            writer.write("\t<Incomes>\n");
         
            for (int i = 0; i < listInc.size(); i++) {
                writer.write(listInc.get(i).toStringXML());
            }
            
            writer.write("\t<\\Incomes>\n");
            writer.write("<\\Items>\n");
            
            writer.close();
            outputStream.close();
            
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}


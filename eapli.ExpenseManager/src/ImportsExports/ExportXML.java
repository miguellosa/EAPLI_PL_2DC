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
            writer.write("<?xml version=\"1.0\"?>");
            writer.write("<Items>");
            writer.write("<Expenses>");
            
            for (int i = 0; i < listExp.size(); i++) {
                writer.write(listExp.get(i).toStringXML());
            }
            //Escrita das listas com gastos e rendimentos

            writer.write("<\\Expenses>");
            writer.write("<Incomes>");
         
            for (int i = 0; i < listInc.size(); i++) {
                writer.write(listInc.get(i).toStringXML());
            }
            
            writer.write("<\\Incomes>");
            writer.write("<\\Items>");
            
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}


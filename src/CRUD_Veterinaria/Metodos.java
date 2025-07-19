/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD_Veterinaria;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;

/**
 *
 * @author mayno
 */
public class Metodos {
    
    public void limpiarCampos(JTextField... campos) {
        for (JTextField campo : campos) {
            campo.setText("");
        }//uso: limpiarDateChooser(txt_nombre);
    }
    
    public void limpiarDateChooser(JDateChooser... fechas) {
        for (JDateChooser fecha : fechas) {
            fecha.setDate(null);
        }//uso: limpiarDateChooser(jdcfecha_nom);
    }
    
    //Seleciona al primero
    public void limpiarComboBox(JComboBox<?>... combos) {
        for (JComboBox<?> combo : combos) {
            if (combo.getItemCount() > 0) {
                combo.setSelectedIndex(0); // selecciona el primer ítem
            } else {
                combo.setSelectedItem(null); // o lo deja sin selección
            }//uso: limpiarComboBox(combo_cliente);
        }
    }
    
    private void vaciarComboBox(JComboBox<?>... combos) {
        for (JComboBox<?> combo : combos) {
            combo.removeAllItems();
        }//uso: vaciarComboBox(combo_cliente);
    }
    
    //metodo para redimencionar anchos de columnas
    public void ajustarAnchoColumnas(JTable tabla, int anchoMaxPermitido) {
        for (int columna = 0; columna < tabla.getColumnCount(); columna++) {
            TableColumn tableColumn = tabla.getColumnModel().getColumn(columna);
            int anchoMaximo = 0;

            // Ancho del encabezado
            TableCellRenderer headerRenderer = tabla.getTableHeader().getDefaultRenderer();
            Component headerComp = headerRenderer.getTableCellRendererComponent(tabla, tableColumn.getHeaderValue(), false, false, 0, columna);
            anchoMaximo = headerComp.getPreferredSize().width;

            // Ancho de las celdas
            for (int fila = 0; fila < tabla.getRowCount(); fila++) {
                TableCellRenderer cellRenderer = tabla.getCellRenderer(fila, columna);
                Component c = tabla.prepareRenderer(cellRenderer, fila, columna);
                int ancho = c.getPreferredSize().width;
                anchoMaximo = Math.max(ancho, anchoMaximo);
            }

            // Margen extra
            anchoMaximo += 10;

            // Aplicar el límite máximo
            if (anchoMaximo > anchoMaxPermitido) {
                anchoMaximo = anchoMaxPermitido;
            }
            tableColumn.setPreferredWidth(anchoMaximo);
        }//uso: ajustarAnchoColumnas(jtable, 150);
    }   
}

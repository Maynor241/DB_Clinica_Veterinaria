package CRUD_Veterinaria;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;

public class factura_Vista extends javax.swing.JFrame {
    //nombre del cliente y txt buscar cliente
    DefaultComboBoxModel<String> modeloClientes = new DefaultComboBoxModel<>();    
    //nombre del empleado y txt buscar empleado
    DefaultComboBoxModel<String> modeloEmpleados = new DefaultComboBoxModel<>();
    //conexion
    conexion con=new conexion();
    
    public factura_Vista() {
        initComponents();
        deshabilitarPanel(jPanelM);
        deshabilitarPanel(jPanelP);
        setLocationRelativeTo(null);
        mostrarNumeroFactura();
        mostrarFecha();
        agregarFiltroDinamicoRecepcionistas();
        agregarFiltroDinamicoCliente();
        agregarEventoSeleccionCliente();
        agregarEventoSeleccionMascota();
        agregarEventoSeleccionConsulta();
        placeholder();
        configurarTablaTotales();
        cargarProductosEnCombo();
        configurarTablaProductos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtable_total = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btn_registrar_factura = new javax.swing.JButton();
        txt_num_factura = new javax.swing.JTextField();
        txt_nom_cliente = new javax.swing.JTextField();
        txt_fecha_dia = new javax.swing.JTextField();
        jPanelM = new javax.swing.JPanel();
        txt_diagnostico = new javax.swing.JTextField();
        txt_fecha = new javax.swing.JTextField();
        txt_precio = new javax.swing.JTextField();
        combo_mascota = new javax.swing.JComboBox<>();
        combo_consulta = new javax.swing.JComboBox<>();
        jPanelP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_producto = new javax.swing.JTable();
        combo_producto = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        btn_agregar_producto = new javax.swing.JButton();
        txt_precio_producto = new javax.swing.JTextField();
        combo_nom_empleado = new javax.swing.JComboBox<>();
        txt_nom_empleado = new javax.swing.JTextField();
        combo_nom_cliente = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Regreso Boton.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(207, 185, 151));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESAR FACTURAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtable_total.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Sub Total", "Impuesto", "Total"
            }
        ));
        jScrollPane2.setViewportView(jtable_total);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 290, 50));

        jButton1.setText("Imprimir Factura");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 410, 290, 50));

        btn_registrar_factura.setText("Guardar Factura");
        btn_registrar_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrar_facturaActionPerformed(evt);
            }
        });
        jPanel1.add(btn_registrar_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 290, 50));

        txt_num_factura.setEditable(false);
        txt_num_factura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_num_factura.setBorder(javax.swing.BorderFactory.createTitledBorder("No. Fcatura"));
        txt_num_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_num_facturaActionPerformed(evt);
            }
        });
        jPanel1.add(txt_num_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 105, 60));

        txt_nom_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txt_nom_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nom_clienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nom_clienteFocusLost(evt);
            }
        });
        txt_nom_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nom_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 200, 60));

        txt_fecha_dia.setEditable(false);
        txt_fecha_dia.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha"));
        jPanel1.add(txt_fecha_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 50, 105, 60));

        jPanelM.setBackground(new java.awt.Color(237, 232, 208));
        jPanelM.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        txt_diagnostico.setEditable(false);
        txt_diagnostico.setBorder(javax.swing.BorderFactory.createTitledBorder("Diagnostico"));

        txt_fecha.setEditable(false);
        txt_fecha.setBorder(javax.swing.BorderFactory.createTitledBorder("Fecha Consulta"));

        txt_precio.setEditable(false);
        txt_precio.setBorder(javax.swing.BorderFactory.createTitledBorder("Precio de la Consulta"));

        combo_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Mascotas"));

        combo_consulta.setBorder(javax.swing.BorderFactory.createTitledBorder("No. Consulta"));

        javax.swing.GroupLayout jPanelMLayout = new javax.swing.GroupLayout(jPanelM);
        jPanelM.setLayout(jPanelMLayout);
        jPanelMLayout.setHorizontalGroup(
            jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMLayout.createSequentialGroup()
                .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelMLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelMLayout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelMLayout.setVerticalGroup(
            jPanelMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(combo_mascota, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_diagnostico, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelM, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 360));

        jPanelP.setBackground(new java.awt.Color(237, 232, 208));
        jPanelP.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));

        jtable_producto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Cantidad", "Precio Unitario", "Sub Total"
            }
        ));
        jScrollPane1.setViewportView(jtable_producto);

        combo_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre Producto"));

        txt_cantidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Cantidad"));

        btn_agregar_producto.setText("Agregar Producto");
        btn_agregar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_productoActionPerformed(evt);
            }
        });

        txt_precio_producto.setBorder(javax.swing.BorderFactory.createTitledBorder("Total"));

        javax.swing.GroupLayout jPanelPLayout = new javax.swing.GroupLayout(jPanelP);
        jPanelP.setLayout(jPanelPLayout);
        jPanelPLayout.setHorizontalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btn_agregar_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                        .addComponent(txt_cantidad)
                        .addComponent(combo_producto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txt_precio_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelPLayout.setVerticalGroup(
            jPanelPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(combo_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_agregar_producto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_precio_producto, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        jPanel1.add(jPanelP, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, -1, 360));

        combo_nom_empleado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Recepcionista")));
        jPanel1.add(combo_nom_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 250, 60));

        txt_nom_empleado.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txt_nom_empleado.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_nom_empleadoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_nom_empleadoFocusLost(evt);
            }
        });
        txt_nom_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nom_empleadoActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nom_empleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 50, 200, 60));

        combo_nom_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre del Cliente"));
        combo_nom_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_nom_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(combo_nom_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 240, 60));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Regreso Boton.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 290, 60));

        jCheckBox1.setText("¿Incluir Consulta?");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jCheckBox2.setText("¿Agregar productos?");
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 170, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1300, 50));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 20, 450));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 150, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_registrar_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrar_facturaActionPerformed
        // TODO add your handling code here:
        String idFactura = txt_num_factura.getText().trim();
        String fechaEmisionStr = txt_fecha_dia.getText().trim(); // formato yyyy-MM-dd
        String nombreCliente = (String) combo_nom_cliente.getSelectedItem();
        String nombreEmpleado = (String) combo_nom_empleado.getSelectedItem();

        // Validaciones básicas
        if (idFactura.isEmpty() || fechaEmisionStr.isEmpty() || nombreCliente == null || nombreEmpleado == null) {
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos obligatorios.");
            return;
        }

        // Obtener subtotal, impuesto y total desde la jtable_total
        DefaultTableModel modeloTotales = (DefaultTableModel) jtable_total.getModel();
        if (modeloTotales.getRowCount() == 0) {
            JOptionPane.showMessageDialog(null, "No hay datos de total para registrar.");
            return;
        }

        double subtotal = Double.parseDouble(modeloTotales.getValueAt(0, 0).toString());
        double impuesto = 0.05; // fijo como porcentaje (5%)
        double total = Double.parseDouble(modeloTotales.getValueAt(0, 2).toString());

        try {
            Connection cn = con.Conectar();

            // Obtener ID de cliente
            String queryCliente = "SELECT id_cliente FROM cliente WHERE nombre = ?";
            PreparedStatement psCliente = cn.prepareStatement(queryCliente);
            psCliente.setString(1, nombreCliente);
            ResultSet rsCliente = psCliente.executeQuery();

            int idCliente = -1;
            if (rsCliente.next()) {
                idCliente = rsCliente.getInt("id_cliente");
            }
            rsCliente.close();
            psCliente.close();

            if (idCliente == -1) {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                return;
            }

            // Obtener ID de empleado
            String queryEmpleado = "SELECT id_empleado FROM empleado WHERE nombre = ?";
            PreparedStatement psEmpleado = cn.prepareStatement(queryEmpleado);
            psEmpleado.setString(1, nombreEmpleado);
            ResultSet rsEmpleado = psEmpleado.executeQuery();

            int idEmpleado = -1;
            if (rsEmpleado.next()) {
                idEmpleado = rsEmpleado.getInt("id_empleado");
            }
            rsEmpleado.close();
            psEmpleado.close();

            if (idEmpleado == -1) {
                JOptionPane.showMessageDialog(null, "Empleado no encontrado.");
                return;
            }

            // Insertar en tabla factura
            String insertFactura = "INSERT INTO factura (id_factura, fecha_emision, id_cliente, id_empleado, subtotal, impuesto, total) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement psFactura = cn.prepareStatement(insertFactura);
            psFactura.setString(1, idFactura);
            psFactura.setDate(2, java.sql.Date.valueOf(fechaEmisionStr)); // formato yyyy-MM-dd
            psFactura.setInt(3, idCliente);
            psFactura.setInt(4, idEmpleado);
            psFactura.setDouble(5, subtotal);
            psFactura.setDouble(6, impuesto);
            psFactura.setDouble(7, total);
            psFactura.executeUpdate();
            psFactura.close();

            // Si está activo el checkbox de consulta, registrar en detalle_factura_consulta
            if (jCheckBox1.isSelected()) {
                String mascota = (String) combo_mascota.getSelectedItem();
                String diagnostico = txt_diagnostico.getText().trim();
                String fechaConsultaStr = txt_fecha.getText().trim(); // formato yyyy-MM-dd
                double precioConsulta = Double.parseDouble(txt_precio.getText().trim());

                if (mascota == null || mascota.isEmpty() || diagnostico.isEmpty() || fechaConsultaStr.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Complete todos los campos de consulta.");
                    return;
                }

                String insertDetalle = "INSERT INTO detalle_factura_consulta (id_factura, nombre_mascota, precio_consulta, diagnostico, fecha_consulta) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement psDetalle = cn.prepareStatement(insertDetalle);
                psDetalle.setString(1, idFactura);
                psDetalle.setString(2, mascota);
                psDetalle.setDouble(3, precioConsulta);
                psDetalle.setString(4, diagnostico);
                psDetalle.setDate(5, java.sql.Date.valueOf(fechaConsultaStr)); // formato yyyy-MM-dd
                psDetalle.executeUpdate();
                psDetalle.close();
            }
            
            // Si está activo el checkbox de productos, guardar en detalle_factura_medicamento
            if (jCheckBox2.isSelected()) {
                DefaultTableModel modeloProductos = (DefaultTableModel) jtable_producto.getModel();

                if (modeloProductos.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No hay productos para registrar.");
                    return;
                }

                for (int i = 0; i < modeloProductos.getRowCount(); i++) {
                    String nombreProducto = modeloProductos.getValueAt(i, 0).toString();
                    int cantidad = Integer.parseInt(modeloProductos.getValueAt(i, 1).toString());
                    double precioUnitario = Double.parseDouble(modeloProductos.getValueAt(i, 2).toString());
                    double subtotalProducto = Double.parseDouble(modeloProductos.getValueAt(i, 3).toString());

                    // Buscar id_medicamento por nombre
                    String queryMedicamento = "SELECT id_medicamento FROM medicamentos WHERE nombre = ?";
                    PreparedStatement psMedicamento = cn.prepareStatement(queryMedicamento);
                    psMedicamento.setString(1, nombreProducto);
                    ResultSet rsMedicamento = psMedicamento.executeQuery();

                    int idMedicamento = -1;
                    if (rsMedicamento.next()) {
                        idMedicamento = rsMedicamento.getInt("id_medicamento");
                    }

                    rsMedicamento.close();
                    psMedicamento.close();

                    if (idMedicamento == -1) {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado: " + nombreProducto);
                        return;
                    }

                    // Insertar en detalle_factura_medicamento
                    String insertDetalleMedicamento = "INSERT INTO detalle_factura_medicamento (id_factura, id_medicamento, cantidad, precio_unitario, subtotal) VALUES (?, ?, ?, ?, ?)";
                    PreparedStatement psDetalle = cn.prepareStatement(insertDetalleMedicamento);
                    psDetalle.setString(1, idFactura);
                    psDetalle.setInt(2, idMedicamento);
                    psDetalle.setInt(3, cantidad);
                    psDetalle.setDouble(4, precioUnitario);
                    psDetalle.setDouble(5, subtotalProducto);
                    psDetalle.executeUpdate();
                    psDetalle.close();
                }
            }
            cn.close();
            JOptionPane.showMessageDialog(null, "Factura registrada correctamente.");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al registrar la factura.");
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Formato de fecha inválido. Use yyyy-MM-dd.");
        }
    }//GEN-LAST:event_btn_registrar_facturaActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
        //Bloque para Habilitar Panel de Consulta y sus Componetes
        if (jCheckBox1.isSelected()) {
            habilitarPanel(jPanelM);
        } else {
            deshabilitarPanel(jPanelM);
            combo_mascota.setSelectedIndex(0); // Limpia el combo
            actualizarTablaTotales(); // Actualiza totales si aún hay productos

            // Solo limpiar tabla total si productos también están desactivados
            if (!jCheckBox2.isSelected()) {
                DefaultTableModel modeloTotales = (DefaultTableModel) jtable_total.getModel();
                modeloTotales.setRowCount(0);
            }
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
        //Bloque para Habilitar Panel de Productos y sus Componetes
        if (jCheckBox2.isSelected()) {
            habilitarPanel(jPanelP);
        } else {
            deshabilitarPanel(jPanelP);
            combo_producto.setSelectedIndex(0);
            cargarProductosEnCombo();

            // Limpiar tabla de productos
            DefaultTableModel modeloProductos = (DefaultTableModel) jtable_producto.getModel();
            modeloProductos.setRowCount(0);

            // Limpiar subtotal productos
            txt_precio_producto.setText("");
            
            actualizarTablaTotales();

            // Solo limpiar tabla total si consultas también están desactivadas
            if (!jCheckBox1.isSelected()) {
                DefaultTableModel modeloTotales = (DefaultTableModel) jtable_total.getModel();
                modeloTotales.setRowCount(0);
            }
        }
        
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Menu_vista().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void combo_nom_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nom_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_nom_clienteActionPerformed
    //nombre del cliente y txt buscar cliente
    private void txt_nom_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_clienteActionPerformed

    private void txt_nom_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nom_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nom_empleadoActionPerformed

    private void txt_num_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_num_facturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_num_facturaActionPerformed

    private void txt_nom_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_clienteFocusGained
        // TODO add your handling code here:
        //este bloque mira que en el (txt_nom_cliente) se encuentre (Buscar cliente...) y si es asi lo borra
        if (txt_nom_cliente.getText().equals("Buscar cliente...")) {
            //Vacia la caja de texto(txt_nom_cliente)
            txt_nom_cliente.setText("");
            //todo lo que se escriba en (txt_nom_cliente)se ponen en letra Negra(BLACK)
            txt_nom_cliente.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_nom_clienteFocusGained

    private void txt_nom_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_clienteFocusLost
        // TODO add your handling code here:
        //este bloque verifica que el (txt_nom_cliente) este vacio con isEmpty y si es asi se ejecuta
        if (txt_nom_cliente.getText().isEmpty()) {
            //todo lo que se escriba en (txt_nom_cliente)se ponen en letra Gris(GRAY)
            txt_nom_cliente.setForeground(Color.GRAY);
            //Escribe en el (txt_nom_cliente) (Buscar cliente...) en color gris
            txt_nom_cliente.setText("Buscar cliente...");
        }
    }//GEN-LAST:event_txt_nom_clienteFocusLost

    private void txt_nom_empleadoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_empleadoFocusGained
        // TODO add your handling code here:
        if (txt_nom_empleado.getText().equals("Buscar Recepcionista...")) {
            txt_nom_empleado.setText("");
            txt_nom_empleado.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txt_nom_empleadoFocusGained

    private void txt_nom_empleadoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_nom_empleadoFocusLost
        // TODO add your handling code here:
        if (txt_nom_empleado.getText().isEmpty()) {
            txt_nom_empleado.setForeground(Color.GRAY);
            txt_nom_empleado.setText("Buscar Recepcionista...");
        }
    }//GEN-LAST:event_txt_nom_empleadoFocusLost

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void btn_agregar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_productoActionPerformed
        // TODO add your handling code here:
        String producto = (String) combo_producto.getSelectedItem();
        String cantidadTexto = txt_cantidad.getText().trim();

        // Validar entrada
        if (producto == null || producto.isEmpty() || producto.equals("No hay productos disponibles")) {
            JOptionPane.showMessageDialog(null, "Seleccione un producto válido.");
            return;
        }

        if (cantidadTexto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Ingrese una cantidad.");
            return;
        }

        int cantidad = 0;
        try {
            cantidad = Integer.parseInt(cantidadTexto);
            if (cantidad <= 0) {
                JOptionPane.showMessageDialog(null, "La cantidad debe ser mayor que 0.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cantidad debe ser un número válido.");
            return;
        }

        double precioUnitario = 0.0;

        // Buscar precio del producto desde la BD
        try {
            Connection cn = con.Conectar();
            String query = "SELECT precio_unitario FROM medicamentos WHERE nombre = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, producto);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                precioUnitario = rs.getDouble("precio_unitario");
            } else {
                JOptionPane.showMessageDialog(null, "Producto no encontrado en la base de datos.");
                return;
            }

            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener el precio del producto.");
            return;
        }

        double subtotal = precioUnitario * cantidad;

        // Agregar fila a la tabla
        DefaultTableModel modelo = (DefaultTableModel) jtable_producto.getModel();
        Object[] fila = {
            producto,
            cantidad,
            String.format("%.2f", precioUnitario),
            String.format("%.2f", subtotal)
        };
        modelo.addRow(fila);

        // (Opcional) Limpiar campos
        combo_producto.setSelectedIndex(0);
        txt_cantidad.setText("");

        // (Opcional) Actualizar subtotal general productos en txt_precio_producto
        actualizarSubtotalProductos();
    }//GEN-LAST:event_btn_agregar_productoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(factura_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new factura_Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregar_producto;
    private javax.swing.JButton btn_registrar_factura;
    private javax.swing.JComboBox<String> combo_consulta;
    private javax.swing.JComboBox<String> combo_mascota;
    private javax.swing.JComboBox<String> combo_nom_cliente;
    private javax.swing.JComboBox<String> combo_nom_empleado;
    private javax.swing.JComboBox<String> combo_producto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelM;
    private javax.swing.JPanel jPanelP;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jtable_producto;
    private javax.swing.JTable jtable_total;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_diagnostico;
    private javax.swing.JTextField txt_fecha;
    private javax.swing.JTextField txt_fecha_dia;
    private javax.swing.JTextField txt_nom_cliente;
    private javax.swing.JTextField txt_nom_empleado;
    private javax.swing.JTextField txt_num_factura;
    private javax.swing.JTextField txt_precio;
    private javax.swing.JTextField txt_precio_producto;
    // End of variables declaration//GEN-END:variables
    
    //Metodo para deshabilitar un panel y suscomponentes
    public void deshabilitarPanel(JPanel panel) {
        //este for recorre el panel que le des en el parametro
        for (Component c : panel.getComponents()) {
            //desabilta los componentes uno por uno
            c.setEnabled(false);
        }
    }
    
    //Metodo para habilitar un panel y suscomponentes
    public void habilitarPanel(JPanel panel) {
        //este for recorre el panel que le des en el parametro
        for (Component c : panel.getComponents()) {
            //habilita los componentes uno por uno
            c.setEnabled(true);
        }
    }
    
    private void agregarFiltroDinamicoCliente(){
        //buscar lo que pongo en txt
        txt_nom_cliente.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) {
            //Se dispara cuando se inserta texto
            filtrarClientes(); }
        @Override
        public void removeUpdate(DocumentEvent e) {
            //Se dispara cuando se elimina texto
            filtrarClientes(); }
        @Override
        public void changedUpdate(DocumentEvent e) {
            //Se dispara para cambios de atributos
            filtrarClientes(); }
        });
    }
    
    //metodo para filtrar los cliente en el como box
    private void filtrarClientes() {
        //guarda la informacion en (texto) y elimina los espacios del principio y final con .trim()
        String texto = txt_nom_cliente.getText().trim();
        if (texto.isEmpty()) {//se asegura que (texto) no este vacio
            return;
        }
        combo_nom_cliente.removeAllItems();//Elimina todo lo que había antes en la lista desplegable.
        try {
            // Conexion
            Connection cn = con.Conectar();
            //consulta
            String query = "SELECT nombre FROM cliente WHERE nombre LIKE ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, texto + "%"); // Busca nombres que comiencen con el texto
            ResultSet rs = ps.executeQuery();
            //crea una variable y la define como (false)
            boolean hayResultados = false;
            //entra en el while si encontro algo, si no pasa del while
            while (rs.next()) {
                //añade los nombres encontrados en el combo box
                combo_nom_cliente.addItem(rs.getString("nombre"));
                //comvierte la variable a true
                hayResultados = true;
            }
            //si antes entro en el while, la variable se comvierte a verdadera y la negaciondentro del if la comvierte a false y no se ejecuta
            if (!hayResultados) {
                combo_nom_cliente.addItem("No encontrado");
            }
            //cierra las conexiones
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            //muestra el erro en la consola
            e.printStackTrace();
            //muestra el erro en una ventana
            JOptionPane.showMessageDialog(null, "Error al buscar clientes: ");
        }
    }
    
    private void agregarFiltroDinamicoRecepcionistas(){
        txt_nom_empleado.getDocument().addDocumentListener(new DocumentListener() {
        @Override
        public void insertUpdate(DocumentEvent e) { 
            filtrarRecepcionistas(); }
        @Override
        public void removeUpdate(DocumentEvent e) { 
            filtrarRecepcionistas(); }
        @Override
        public void changedUpdate(DocumentEvent e) { 
            filtrarRecepcionistas(); }
        });
    }
    
    private void filtrarRecepcionistas() {
        String texto = txt_nom_empleado.getText().trim();
        if (texto.isEmpty()) {
            return;
        }
        combo_nom_empleado.removeAllItems();
        try {
            Connection cn = con.Conectar();
            String query = "SELECT e.nombre FROM cargo c " +
                     "JOIN empleado e ON c.id_empleado = e.id_empleado " +
                     "WHERE c.cargo = 'Recepcionista' AND e.nombre LIKE ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, texto + "%");
            ResultSet rs = ps.executeQuery();
            
            boolean hayResultados = false;
            while (rs.next()) {
                combo_nom_empleado.addItem(rs.getString("nombre"));
                hayResultados = true;
            }
            if (!hayResultados) {
                combo_nom_empleado.addItem("No encontrado");
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al buscar recepcionistas: ");
        }
    }
    
    private void mostrarNumeroFactura() {
        try {
            Connection cn = con.Conectar();
            PreparedStatement ps = cn.prepareStatement("SELECT MAX(id_factura) AS ultima_factura FROM factura");
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                //muestra la ultima factura mas 1
                int ultimaFactura = rs.getInt("ultima_factura");
                int siguienteFactura = ultimaFactura + 1;
                txt_num_factura.setText(String.valueOf(siguienteFactura));
            } else {
                txt_num_factura.setText("1"); // si no hay ninguna factura
            }
            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener número de factura");
        }
    }
    
    private void mostrarFecha() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        txt_fecha_dia.setText(fechaActual.format(formato));
    }
    
    //Metodo para mostrar en (txt_nom_cliente y txt_nom_empleado) (Buscar cliente... y Buscar Recepcionista...)por primera vez
    private void placeholder(){
        /* este codigo es por si uso un get para agarrar el texto del txt_nom_cliente
        String texto = txt_nom_cliente.getText();
        if (texto.equals("Buscar cliente...")) {
            texto = ""; // no buscar nada
        }*/
        txt_nom_cliente.setForeground(Color.GRAY);
        txt_nom_cliente.setText("Buscar cliente...");
        txt_nom_empleado.setForeground(Color.GRAY);
        txt_nom_empleado.setText("Buscar Recepcionista...");
    }

    private void agregarEventoSeleccionCliente() {
        combo_nom_cliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreCliente = (String) combo_nom_cliente.getSelectedItem();
                if (nombreCliente != null && !nombreCliente.equals("No encontrado")) {
                    cargarMascotasDeCliente(nombreCliente);
                } else {
                    combo_mascota.removeAllItems(); // limpia si no hay cliente válido
                }
            }
        });
    }

    private void cargarMascotasDeCliente(String nombreCliente) {
        combo_mascota.removeAllItems(); // Limpia antes de cargar nuevas mascotas

        try {
            Connection cn = con.Conectar();

            // Primero obtenemos el ID del cliente por su nombre
            String queryCliente = "SELECT id_cliente FROM cliente WHERE nombre = ?";
            PreparedStatement psCliente = cn.prepareStatement(queryCliente);
            psCliente.setString(1, nombreCliente);
            ResultSet rsCliente = psCliente.executeQuery();

            int idCliente = -1;
            if (rsCliente.next()) {
                idCliente = rsCliente.getInt("id_cliente");
            }
            rsCliente.close();
            psCliente.close();

            // Si no se encontró el cliente, salir
            if (idCliente == -1) {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
                return;
            }

            // Ahora buscamos las mascotas asociadas al cliente
            String queryMascotas = "SELECT nombre FROM mascota WHERE id_cliente = ?";
            PreparedStatement psMascotas = cn.prepareStatement(queryMascotas);
            psMascotas.setInt(1, idCliente);
            ResultSet rsMascotas = psMascotas.executeQuery();
            
            boolean hayMascotas = false;
            List<String> mascotas = new ArrayList<>();

            while (rsMascotas.next()) {
                mascotas.add(rsMascotas.getString("nombre"));
                hayMascotas = true;
            }

            rsMascotas.close();
            psMascotas.close();
            cn.close();

            if (hayMascotas) {
                combo_mascota.addItem(""); // <-- Ítem vacío como primera opción
                for (String m : mascotas) {
                    combo_mascota.addItem(m);
                }
                combo_mascota.setSelectedIndex(0); // <-- Selecciona el ítem vacío
            } else {
                combo_mascota.addItem("No hay mascotas registradas");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar mascotas del cliente.");
        }
    }
    
    private void agregarEventoSeleccionMascota() {
        combo_mascota.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreMascota = (String) combo_mascota.getSelectedItem();
                if (nombreMascota != null && !nombreMascota.isEmpty() && !nombreMascota.equals("No hay mascotas registradas")) {
                    cargarConsultasDeMascota(nombreMascota);
                } else {
                    combo_consulta.removeAllItems(); // limpia si no hay mascota válida
                }
            }
        });
    }
    
    private void cargarConsultasDeMascota(String nombreMascota) {
        combo_consulta.removeAllItems(); // Limpia antes de cargar nuevas consultas

        try {
            Connection cn = con.Conectar();

            // Obtener id_mascota por nombre
            String queryMascota = "SELECT id_mascota FROM mascota WHERE nombre = ?";
            PreparedStatement psMascota = cn.prepareStatement(queryMascota);
            psMascota.setString(1, nombreMascota);
            ResultSet rsMascota = psMascota.executeQuery();

            int idMascota = -1;
            if (rsMascota.next()) {
                idMascota = rsMascota.getInt("id_mascota");
            }
            rsMascota.close();
            psMascota.close();

            if (idMascota == -1) {
                JOptionPane.showMessageDialog(null, "Mascota no encontrada.");
                return;
            }

            // Buscar historial de consulta por id_mascota
            String queryHistorial = "SELECT id_consulta FROM historial_consulta WHERE id_mascota = ?";
            PreparedStatement psHistorial = cn.prepareStatement(queryHistorial);
            psHistorial.setInt(1, idMascota);
            ResultSet rsHistorial = psHistorial.executeQuery();

            List<String> consultas = new ArrayList<>();
            boolean hayConsultas = false;

            while (rsHistorial.next()) {
                consultas.add(rsHistorial.getString("id_consulta"));
                hayConsultas = true;
            }

            rsHistorial.close();
            psHistorial.close();
            cn.close();

            if (hayConsultas) {
                combo_consulta.addItem(""); // ítem vacío
                for (String idConsulta : consultas) {
                    combo_consulta.addItem(idConsulta);
                }
                combo_consulta.setSelectedIndex(0);
            } else {
                combo_consulta.addItem("No hay consultas registradas");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar historial de consultas.");
        }
    }
    
    private void agregarEventoSeleccionConsulta() {
        combo_consulta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idConsulta = (String) combo_consulta.getSelectedItem();
                if (idConsulta != null && !idConsulta.isEmpty() && !idConsulta.equals("No hay consultas registradas")) {
                    cargarDatosDeConsulta(idConsulta);
                } else {
                    txt_fecha.setText("");
                    txt_diagnostico.setText("");
                    txt_precio.setText("");
                }
            }
        });
    }

    private void cargarDatosDeConsulta(String idConsulta) {
        try {
            Connection cn = con.Conectar();

            String query = "SELECT fecha_historial_consulta, diagnostico, precio_consulta FROM historial_consulta WHERE id_consulta = ?";
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, idConsulta);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                txt_fecha.setText(rs.getString("fecha_historial_consulta"));
                txt_diagnostico.setText(rs.getString("diagnostico"));
                txt_precio.setText(rs.getString("precio_consulta"));
                actualizarTablaTotales();
            }

            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al obtener detalles de la consulta.");
        }
    }
    
    private void configurarTablaTotales() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Subtotal");
        modelo.addColumn("Impuesto");
        modelo.addColumn("Total");
        jtable_total.setModel(modelo);
    }

    
    private void actualizarTablaTotales() {
        double precioConsulta = 0.0;
        double subtotalProductos = 0.0;

        try {
            if (!txt_precio.getText().trim().isEmpty()) {
                precioConsulta = Double.parseDouble(txt_precio.getText().trim());
            }
            if (!txt_precio_producto.getText().trim().isEmpty()) {
                subtotalProductos = Double.parseDouble(txt_precio_producto.getText().trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: los precios deben ser números válidos.");
            return;
        }

        double subtotal = precioConsulta + subtotalProductos;
        double impuesto = subtotal * 0.05;
        double total = subtotal + impuesto;

        DefaultTableModel modelo = (DefaultTableModel) jtable_total.getModel();
        modelo.setRowCount(0);

        Object[] fila = new Object[3];
        fila[0] = String.format("%.2f", subtotal);
        fila[1] = "5%"; // Muestra el porcentaje
        fila[2] = String.format("%.2f", total);
        modelo.addRow(fila);
    }
    
    private void cargarProductosEnCombo() {
        combo_producto.removeAllItems(); // Limpia antes de llenar

        try {
            Connection cn = con.Conectar(); // Tu método para conectar
            String query = "SELECT nombre FROM medicamentos";
            PreparedStatement ps = cn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            combo_producto.addItem("");

            boolean hayProductos = false;
            while (rs.next()) {
                combo_producto.addItem(rs.getString("nombre"));
                hayProductos = true;
            }

            if (!hayProductos) {
                combo_producto.addItem("No hay productos disponibles");
            }

            rs.close();
            ps.close();
            cn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al cargar productos.");
        }
    }

    private void configurarTablaProductos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Producto");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio Unitario");
        modelo.addColumn("Subtotal");
        jtable_producto.setModel(modelo);
    }
    
    private void actualizarSubtotalProductos() {
        DefaultTableModel modelo = (DefaultTableModel) jtable_producto.getModel();
        double total = 0.0;

        for (int i = 0; i < modelo.getRowCount(); i++) {
            double subtotalFila = Double.parseDouble(modelo.getValueAt(i, 3).toString());
            total += subtotalFila;
        }

        txt_precio_producto.setText(String.format("%.2f", total));
        actualizarTablaTotales(); // Si quieres actualizar la tabla de totales también
    }
    
    private int obtenerIdDesdeNombre(String tabla, String campoId, String nombre, Connection cn) throws SQLException {
        String query = "SELECT " + campoId + " FROM " + tabla + " WHERE nombre = ?";
        PreparedStatement ps = cn.prepareStatement(query);
        ps.setString(1, nombre);
        ResultSet rs = ps.executeQuery();
        int id = -1;
        if (rs.next()) {
            id = rs.getInt(campoId);
        }
        rs.close();
        ps.close();
        return id;
    }
}
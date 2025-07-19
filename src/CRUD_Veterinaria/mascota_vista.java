package CRUD_Veterinaria;
import java.sql.*;
import java.text.ParseException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class mascota_vista extends javax.swing.JFrame {
    conexion con = new conexion();
    Connection cn = con.Conectar();
    Metodos me = new Metodos();
    public mascota_vista() {
        initComponents();
        setLocationRelativeTo(this);
        mostrardatos();
        configurarPermisosPorRol();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnbuscar_cliente = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtid_mascota = new javax.swing.JTextField();
        txtnombre_cliente = new javax.swing.JTextField();
        txtnombre_mascota = new javax.swing.JTextField();
        txtraza = new javax.swing.JTextField();
        txtespecie = new javax.swing.JTextField();
        btnregistrar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        txtidentidad_clientes = new javax.swing.JTextField();
        combosexo = new javax.swing.JComboBox<>();
        jdcfecha_nacimiento = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabledatos = new javax.swing.JTable();
        txtbuscar_mascota = new javax.swing.JTextField();
        btnbuscar_mascota = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(207, 185, 151));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro e Historial de Mascotas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(237, 232, 208));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Mascotas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnbuscar_cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar_cliente.setText("Buscar");
        btnbuscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnbuscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 35, 130, 130));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 480, 10));

        txtid_mascota.setEditable(false);
        txtid_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Id"));
        jPanel1.add(txtid_mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 114, 60));

        txtnombre_cliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtnombre_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_clienteActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 350, 65));

        txtnombre_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Nombre de la Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtnombre_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombre_mascotaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombre_mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 350, 60));

        txtraza.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Raza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrazaActionPerformed(evt);
            }
        });
        jPanel1.add(txtraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 480, 60));

        txtespecie.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especie", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtespecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtespecieActionPerformed(evt);
            }
        });
        jPanel1.add(txtespecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 480, 60));

        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 120, 50));

        btneliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btneliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 200, 50));

        btnactualizar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnactualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 140, 50));

        txtidentidad_clientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        txtidentidad_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidentidad_clientesActionPerformed(evt);
            }
        });
        jPanel1.add(txtidentidad_clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 350, 65));

        combosexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Hembra", "Macho" }));
        combosexo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel1.add(combosexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 180, 70));

        jdcfecha_nacimiento.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE NACIMIENTO"));
        jPanel1.add(jdcfecha_nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 280, 70));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 24, 500, 560));

        jPanel3.setBackground(new java.awt.Color(237, 232, 208));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Historial de la Mascota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtabledatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jtabledatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtabledatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtabledatos);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 660, 360));

        txtbuscar_mascota.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresa Nombre o ID"));
        txtbuscar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscar_mascotaActionPerformed(evt);
            }
        });
        jPanel3.add(txtbuscar_mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 260, 65));

        btnbuscar_mascota.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbuscar_mascota.setText("Buscar");
        btnbuscar_mascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar_mascotaActionPerformed(evt);
            }
        });
        jPanel3.add(btnbuscar_mascota, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, 133, 65));

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Regreso Boton.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        jPanel3.add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 120, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(554, 24, 680, 560));

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, 10, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnbuscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar_clienteActionPerformed
        String identidad = txtidentidad_clientes.getText();
        try {
            Connection cn = con.Conectar();
            
            PreparedStatement ps = cn.prepareStatement("SELECT nombre FROM cliente WHERE identidad = ?");
            ps.setString(1, identidad);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                txtnombre_cliente.setText(rs.getString("nombre"));
                me.limpiarCampos(txtespecie, txtnombre_mascota, txtraza, txtid_mascota);
                me.limpiarComboBox(combosexo);
                me.limpiarDateChooser(jdcfecha_nacimiento);
            } else {
                int resp = JOptionPane.showConfirmDialog(this, "Cliente no encontrado. ¿Deseas registrarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    new clientes_vista().setVisible(true);
                    this.dispose();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al buscar el cliente:\n" + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscar_clienteActionPerformed

    private void txtnombre_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_clienteActionPerformed

    private void txtnombre_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombre_mascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombre_mascotaActionPerformed

    private void txtrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrazaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrazaActionPerformed

    private void txtespecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtespecieActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_txtespecieActionPerformed
    
    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        
        // Obtener la fecha del JDateChooser
        java.util.Date fechaUtil = jdcfecha_nacimiento.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
        
        if (txtespecie.getText().trim().isEmpty() ||
            txtidentidad_clientes.getText().trim().isEmpty() ||
            //txtnombre_cliente.getText().trim().isEmpty() ||
            txtraza.getText().trim().isEmpty() ||
            txtnombre_mascota.getText().trim().isEmpty() ||
            combosexo.getSelectedItem().toString().equals("Seleccionar") ||
            fechaUtil == null) 
        {

            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }
        
        try {
            Connection cn = con.Conectar();
            
            String query1 = ("SELECT id_cliente FROM cliente WHERE identidad = ?");
            PreparedStatement ps1 = cn.prepareStatement(query1);
            ps1.setString(1, txtidentidad_clientes.getText());
            
            ResultSet rs = ps1.executeQuery();
            
            if (rs.next()) {
                int idCliente = rs.getInt("id_cliente");

                // 2. Insertar el cargo con el id_empleado obtenido
                String query2 = "INSERT INTO mascota (nombre, especie, raza, fecha_nacimiento, sexo, id_cliente) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement ps2 = cn.prepareStatement(query2);
                ps2.setString(1, txtnombre_mascota.getText());
                ps2.setString(2, txtespecie.getText());
                ps2.setString(3, txtraza.getText());
                ps2.setDate(4, fechaSQL);
                ps2.setString(5, combosexo.getSelectedItem().toString());
                ps2.setInt(6, idCliente);
                ps2.executeUpdate();
                JOptionPane.showMessageDialog(this, "Cargo registrado correctamente.");
                me.limpiarCampos(txtidentidad_clientes, txtid_mascota, txtnombre_cliente, txtid_mascota, txtnombre_mascota, txtespecie, txtraza);
                me.limpiarDateChooser(jdcfecha_nacimiento);
                me.limpiarComboBox(combosexo);
                mostrardatos();
                
            } else {
                int resp = JOptionPane.showConfirmDialog(this, "No se encontró un empleado con esa identidad. ¿Deseas registrarlo?", "Aviso", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    new empleado_vista().setVisible(true);
                    this.dispose();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar mascota: ");
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txtidentidad_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidentidad_clientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidentidad_clientesActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        btnregistrar.setEnabled(true);
        
        java.util.Date fechaUtil = jdcfecha_nacimiento.getDate();
        java.sql.Date fechaSQL = new java.sql.Date(fechaUtil.getTime());
        
        if (txtespecie.getText().trim().isEmpty() ||
            txtidentidad_clientes.getText().trim().isEmpty() ||
            //txtnombre_cliente.getText().trim().isEmpty() ||
            txtraza.getText().trim().isEmpty() ||
            txtnombre_mascota.getText().trim().isEmpty() ||
            combosexo.getSelectedItem().toString().equals("Seleccionar") ||
            fechaUtil == null) 
        {

            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return;
        }
                
        try {
            Connection cn = con.Conectar();

            // 1. Buscar el ID del empleado por identidad
            String query1 = "SELECT id_cliente FROM cliente WHERE identidad = ?";
            PreparedStatement ps1 = cn.prepareStatement(query1);
            ps1.setString(1, txtidentidad_clientes.getText());

            ResultSet rs = ps1.executeQuery();

            if (rs.next()) {
                int idCliente = rs.getInt("id_cliente");

                // 2. Hacer el UPDATE de mascota
                String query2 = "UPDATE mascota SET nombre = ?, especie = ?, raza = ?, fecha_nacimiento = ?, sexo = ?, id_cliente = ? WHERE id_mascota = ?";
                PreparedStatement ps2 = cn.prepareStatement(query2);
                // Asignar los valores del formulario
                ps2.setString(1, txtnombre_mascota.getText());
                ps2.setString(2, txtespecie.getText());
                ps2.setString(3, txtraza.getText());
                ps2.setDate(4, fechaSQL);
                ps2.setString(5, combosexo.getSelectedItem().toString());
                ps2.setInt(6, idCliente); 
                ps2.setString(7, txtid_mascota.getText());

                int filasAfectadas = ps2.executeUpdate();

                if (filasAfectadas > 0) {
                    JOptionPane.showMessageDialog(this, "Mascota actualizado correctamente.");
                    me.limpiarCampos(txtidentidad_clientes, txtnombre_cliente, txtnombre_mascota, txtespecie, txtraza);
                    me.limpiarDateChooser(jdcfecha_nacimiento);
                    me.limpiarComboBox(combosexo);
                    mostrardatos();
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo actualizar la Mascota.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró el cliente con la identidad ingresada.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al actualizar el mascota.");
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void jtabledatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtabledatosMouseClicked

        // Activar/desactivar botones
        btnregistrar.setEnabled(false);
        btnactualizar.setEnabled(true);
        
        if(Sesion.rolActual.equals("Recepcionista") || (Sesion.rolActual.equals("Veterinario"))){
            btneliminar.setEnabled(false);
        }
        
        int fila = this.jtabledatos.getSelectedRow();
    
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona una fila.");
            return;
        }
    
        // Obtener valores de la fila
        String[] datos = new String[8];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = this.jtabledatos.getValueAt(fila, i).toString();
        }
    
        // Asignar a los campos
        this.txtidentidad_clientes.setText(datos[0]);
        this.txtnombre_cliente.setText(datos[1]);
        this.txtid_mascota.setText(datos[2]);
        this.txtnombre_mascota.setText(datos[3]);
        this.txtespecie.setText(datos[4]);
        this.txtraza.setText(datos[5]);
        this.combosexo.setSelectedItem(datos[7]);
    
        // Convertir fecha si está presente
        if (!datos[6].equals("No especificada")) {
            try {
                this.jdcfecha_nacimiento.setDate(new java.text.SimpleDateFormat("yyyy-MM-dd").parse(datos[6]));
            }catch (ParseException e){
                this.jdcfecha_nacimiento.setDate(null);
                JOptionPane.showMessageDialog(this, "Error al cargar la fecha.");
            }
        } else {
            this.jdcfecha_nacimiento.setDate(null);
        }
        try (
         PreparedStatement ps = cn.prepareStatement("SELECT identidad FROM cliente WHERE id_cliente = ?")) {

        ps.setString(1, datos[0]); // ← ID del cliente
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            this.txtidentidad_clientes.setText(rs.getString("identidad"));
        } else {
            this.txtidentidad_clientes.setText("");
            JOptionPane.showMessageDialog(this, "Identidad del cliente no encontrada.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al buscar identidad del cliente.");
    }
    }//GEN-LAST:event_jtabledatosMouseClicked

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "¿ESTAS SEGURO DE ELIMINAR LA MASCOTA?","SALIR", JOptionPane.YES_NO_CANCEL_OPTION)==0){
            try{
                PreparedStatement ps=cn.prepareStatement("delete from mascota where id_mascota=?");
                ps.setString(1, txtid_mascota.getText());
                //ps devuelve 0 cuando se ejecuta correctamente y por eso se actualiza la tabla
                int indice = ps.executeUpdate();
                if(indice>0){
                    mostrardatos();
                }else{//no elimino nada por ende
                    JOptionPane.showMessageDialog(null,"No ha seleccionado la fila");
                }
                me.limpiarCampos(txtidentidad_clientes, txtid_mascota, txtnombre_cliente, txtid_mascota, txtnombre_mascota, txtespecie, txtraza);
                me.limpiarDateChooser(jdcfecha_nacimiento);
                me.limpiarComboBox(combosexo);
                btnregistrar.setEnabled(true);
                                               
            }catch(SQLException e){
                System.out.println("Error al eliminar datos"+e);
                
            }
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void txtbuscar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscar_mascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscar_mascotaActionPerformed

    private void btnbuscar_mascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar_mascotaActionPerformed
        
        String busqueda = txtbuscar_mascota.getText().trim();
        me.limpiarCampos(txtidentidad_clientes, txtid_mascota, txtnombre_cliente, txtid_mascota, txtnombre_mascota, txtespecie, txtraza);
        me.limpiarDateChooser(jdcfecha_nacimiento);
        me.limpiarComboBox(combosexo);
        btnregistrar.setEnabled(true);

        if (busqueda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingresa un nombre o ID de mascota para buscar.");
            mostrardatos();
            return;
        }

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Dueño");
        modelo.addColumn("ID");
        modelo.addColumn("Mascota");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Sexo");

        String query = "SELECT m.id_mascota, m.nombre, m.especie, m.raza, m.fecha_nacimiento, m.sexo, c.id_cliente, c.nombre " +
                       "FROM mascota m INNER JOIN cliente c ON c.id_cliente = m.id_cliente " +
                       "WHERE c.nombre LIKE ? OR CAST(m.id_mascota AS CHAR) LIKE ?";

        try {
            PreparedStatement ps = cn.prepareStatement(query);
            ps.setString(1, "%" + busqueda + "%");
            ps.setString(2, "%" + busqueda + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = new Object[8];
                fila[0] = rs.getInt("id_cliente");      // ID Cliente
                fila[1] = rs.getString("c.nombre");     // Dueño de la Mascota
                fila[2] = rs.getInt("id_mascota");      // ID Mascota
                fila[3] = rs.getString("m.nombre");     // Nombre de Mascota
                fila[4] = rs.getString("especie");      // Especie
                fila[5] = rs.getString("raza");         // Raza
                fila[6] = rs.getString("fecha_nacimiento") != null ? rs.getString("fecha_nacimiento") : "No especificada"; // Fecha Nacimiento
                fila[7] = rs.getString("sexo");         // Sexo
                modelo.addRow(fila);
            }

            jtabledatos.setModel(modelo);
            me.ajustarAnchoColumnas(jtabledatos, 150);
            if (modelo.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "No se encontraron mascotas con ese nombre o ID.");
                mostrardatos();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar: " + e.getMessage());
        }
    }//GEN-LAST:event_btnbuscar_mascotaActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        new Menu_vista().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

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
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mascota_vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mascota_vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnbuscar_cliente;
    private javax.swing.JButton btnbuscar_mascota;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> combosexo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private com.toedter.calendar.JDateChooser jdcfecha_nacimiento;
    private javax.swing.JTable jtabledatos;
    private javax.swing.JTextField txtbuscar_mascota;
    private javax.swing.JTextField txtespecie;
    private javax.swing.JTextField txtid_mascota;
    private javax.swing.JTextField txtidentidad_clientes;
    private javax.swing.JTextField txtnombre_cliente;
    private javax.swing.JTextField txtnombre_mascota;
    private javax.swing.JTextField txtraza;
    // End of variables declaration//GEN-END:variables

    private void mostrardatos() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Cliete");
        modelo.addColumn("Dueño");
        modelo.addColumn("ID");
        modelo.addColumn("Mascota");
        modelo.addColumn("Especie");
        modelo.addColumn("Raza");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Sexo");

        jtabledatos.setModel(modelo);

        String consultasql = "SELECT m.id_mascota, m.nombre, m.especie, m.raza, "
                           + "m.fecha_nacimiento, m.sexo, c.id_cliente, c.nombre "
                           + "FROM mascota m "
                           + "INNER JOIN cliente c ON c.id_cliente = m.id_cliente";

        try (Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql)) {
            while (rs.next()) {
                String[] data = new String[8];
                data[0] = rs.getString(7); // nombre del cliente
                data[1] = rs.getString(8); // nombre del cliente
                data[2] = rs.getString(1); // id_mascota
                data[3] = rs.getString(2); // nombre
                data[4] = rs.getString(3); // especie
                data[5] = rs.getString(4); // raza
                data[6] = rs.getString(5) != null ? rs.getString(5) : "No especificada"; // fecha_nacimiento
                data[7] = rs.getString(6); // sexo
                modelo.addRow(data);
                
                me.ajustarAnchoColumnas(jtabledatos, 150);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al mostrar datos: " + e.getMessage());
        }
    }

    private void configurarPermisosPorRol() {
        if (Sesion.rolActual.equalsIgnoreCase("Recepcionista")||(Sesion.rolActual.equalsIgnoreCase("Veterinario"))) {
            btneliminar.setEnabled(false); // ejemplo   
        }
    }
}
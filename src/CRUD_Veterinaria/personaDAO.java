package CRUD_Veterinaria;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class personaDAO {
    Metodos me=new Metodos();

    public boolean insertar(persona p, String nombre_tabla) {
        //.trim quita los espacios de una cadena de texto (Solo los de principio y final)
        //.isEmpty se asegura de que por lomenos se encuentre un caracter, en caso de no encontrarlo, ejecuta el if y para el metodo
        if (p.getNombre().trim().isEmpty() || p.getDireccion().trim().isEmpty() || p.getTelefono().trim().isEmpty()|| p.getCorreo().trim().isEmpty()|| p.getIdentidad().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return false;
        }

        //Si el valor es correcto ("cliente" o "empleado"), la negación lo vuelve falso y el if no se ejecuta.
        if (!nombre_tabla.equals("cliente") && !nombre_tabla.equals("empleado")) {
            JOptionPane.showMessageDialog(null, "Tabla no válida");
            //El return False para el metodo
            return false;
        }
        conexion con = new conexion();
        Connection cn = con.Conectar();
        //preparacion de la consulta SQL
        String query = "INSERT INTO " + nombre_tabla + " (nombre, identidad, telefono, direccion, correo) VALUES (?, ?, ?, ?, ?)";
        //preparar sentencias SQL seguras con valores que pueden cambiar.
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            //Agarra el get(variable) de la clase persona
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getIdentidad());
            ps.setString(3, p.getTelefono());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getCorreo());
            //Ejecuta la consulta SQL
            ps.execute();
            return true;//avisa que este método salió bien
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al insertar: " + e.getMessage());
            return false;
        }
    }

    public boolean actualizar(persona p, String nombre_tabla) {
        if (p.getNombre().trim().isEmpty() || p.getDireccion().trim().isEmpty() || p.getTelefono().trim().isEmpty()|| p.getCorreo().trim().isEmpty()|| p.getIdentidad().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, completa todos los campos requeridos.");
            return false;
        }
        
        if (!nombre_tabla.equals("cliente") && !nombre_tabla.equals("empleado")) {
            JOptionPane.showMessageDialog(null, "Tabla no válida");
            return false;
        }

        conexion con = new conexion();
        Connection cn = con.Conectar();
        
        //Aqui se obtiene el nombre del id que ocupe
        String campo_id;
        if (nombre_tabla.equals("cliente")) {
            campo_id = "id_cliente";
        } else {
            campo_id = "id_empleado";
        }
        String query = "UPDATE " + nombre_tabla + " SET nombre = ?, identidad = ?, telefono = ?, direccion = ?, correo = ? WHERE " + campo_id + " = ?";

        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getIdentidad());
            ps.setString(3, p.getTelefono());
            ps.setString(4, p.getDireccion());
            ps.setString(5, p.getCorreo());
            ps.setInt(6, p.getId_persona());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminar(int id, String nombre_tabla) {
        if (!nombre_tabla.equals("cliente") && !nombre_tabla.equals("empleado")) {
            JOptionPane.showMessageDialog(null, "Tabla no válida");
            return false;
        }
        if (id <= 0) {
            JOptionPane.showMessageDialog(null, "ID no válido para eliminar");
            return false;
        }
        conexion con = new conexion();
        Connection cn = con.Conectar();
        String campo_id;
        if(nombre_tabla.equals("cliente")){
            campo_id = "id_cliente";
        }else{
            campo_id = "id_empleado";
        }
        String query = "DELETE FROM " + nombre_tabla + " WHERE " + campo_id + " = ?";

        try (PreparedStatement ps = cn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar: " + e.getMessage());
            return false;
        }
    }

    public DefaultTableModel buscar(String texto, String nombre_tabla) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre y Apellido");
        modelo.addColumn("Identidad");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Correo");
        if (!nombre_tabla.equals("cliente") && !nombre_tabla.equals("empleado")) {
            JOptionPane.showMessageDialog(null, "Tabla no válida");
            return modelo;
        }
        conexion con = new conexion();
        Connection cn = con.Conectar();
        String campo_id;
        if(nombre_tabla.equals("cliente")){
            campo_id = "id_cliente";
        }else{
            campo_id = "id_empleado";
        }
        String query = "SELECT * FROM " + nombre_tabla + " WHERE nombre LIKE ? OR " + campo_id + " LIKE ?";
        try (PreparedStatement ps = cn.prepareStatement(query)) {
            //cualquier cantidad de caracteres (%)
            ps.setString(1, "%" + texto + "%");
            ps.setString(2, "%" + texto + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt(1);
                fila[1] = rs.getString(2);
                fila[2] = rs.getString(3);
                fila[3] = rs.getString(4);
                fila[4] = rs.getString(5);
                fila[5] = rs.getString(6);
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar: " + e.getMessage());
        }
        return modelo;
    }
}
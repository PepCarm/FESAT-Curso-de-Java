package modelo;

import java.sql.*;
import java.util.ArrayList;

public class DataBase {

    Connection conexion;
    String dBConexion = "jdbc:mysql://localhost/ventas";
    String usuario = "root";
    String clave = "";

    public DataBase() {

        try {
            conexion = DriverManager.getConnection(dBConexion, usuario, clave);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void agregarProducto(Producto producto) {

        try {
            PreparedStatement pS = conexion.prepareStatement(
                    "insert into producto (nombre,precio) values (?,?)");

            pS.setString(1, producto.getNombre());
            pS.setDouble(2, producto.getPrecio());

            pS.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void eliminarProducto(int codigo) {

        try {
            Statement s = conexion.createStatement();
            s.executeUpdate("delete from producto where codigo=" + codigo);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void modificarProducto(Producto producto) {

        try {
            PreparedStatement pS = conexion.prepareStatement(
                    "update producto set nombre=?,precio=? where codigo=?");

            pS.setString(1, producto.getNombre());
            pS.setDouble(2, producto.getPrecio());
            pS.setInt(3, producto.getCodigo());

            pS.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> lista = new ArrayList<>();
        try {
            Statement s = conexion.createStatement();
            ResultSet res = s.executeQuery(
                    "select * from producto order by nombre");
            while (res.next()) {
                Producto p = new Producto(
                        res.getInt("codigo"),
                        res.getString("nombre"),
                        res.getDouble("precio"));

                lista.add(p);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return lista;
    }

}

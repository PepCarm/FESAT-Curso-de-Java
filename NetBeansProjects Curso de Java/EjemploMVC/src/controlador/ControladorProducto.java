package controlador;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.DataBase;
import modelo.Producto;
import vista.VistaProducto;

public class ControladorProducto {

    private static VistaProducto vistaProducto = new VistaProducto();

    public static void mostrar() {

        vistaProducto.setVisible(true);
        DataBase db = new DataBase();
        ArrayList<Producto> productos = db.obtenerProductos();

        DefaultTableModel modelo = (DefaultTableModel) vistaProducto.getjTable1().getModel();
        modelo.setNumRows(0);
        for (Producto producto : productos) {
            Object[] fila = new Object[3];

            fila[0] = producto.getCodigo();
            fila[1] = producto.getNombre();
            fila[2] = producto.getPrecio();
            modelo.addRow(fila);

        }

    }

    public static void botonAgregar() {

        String nombre = vistaProducto.getjTextField2().getText();
        double precio = Double.parseDouble(
                vistaProducto.getjTextField3().getText());

        Producto producto = new Producto();
        producto.setNombre(nombre);
        producto.setPrecio(precio);

        DataBase db = new DataBase();
        db.agregarProducto(producto);

        mostrar();
    }

    public static void botonModificar() {

    }

    public static void botonEliminar() {

        int codigo = Integer.parseInt(
                vistaProducto.getjTextField1().getText());
        DataBase db = new DataBase();
        db.eliminarProducto(codigo);
        mostrar();

    }

}

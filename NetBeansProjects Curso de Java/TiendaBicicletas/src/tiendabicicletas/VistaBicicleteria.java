package tiendabicicletas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class VistaBicicleteria extends javax.swing.JFrame {

    public void mostrarBicicleterias(){ //Aca se coloca el try, las consultas 
        
        try {
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bicicleterias","root","1234");
            
            System.out.println("conexión exitosa");
            
            Statement consul1 = c.createStatement();
            
            ResultSet res = consul1.executeQuery("select * from bicicleteria"); //podemos escribir en may o min dentro de"".
            
            DefaultTableModel datosTabla = (DefaultTableModel) jTable1.getModel(); //Lo hago para poder ingresar los elemnetos a la tabla
            datosTabla.setNumRows(0); //Sirve para que no se repitan los valores ya ingresados.
            
            while(res.next()){
                Object[] filaTabla = new Object[3]; //Aca busco las columnas
                filaTabla [0]= res.getString("idBicicleteria");
                filaTabla [1]= res.getString("ganancias");
                filaTabla [2]= res.getString("cantVentas");
               
                datosTabla.addRow(filaTabla); // acalos agrego a la tabla.
                
            }  
            
        } catch (Exception e) {
            System.out.println("No pudo conectarse");
        }
    }
    
    public VistaBicicleteria() { // Aca es donde se colocan los metodos
        initComponents();
        
        mostrarBicicleterias();
        this.setLocationRelativeTo(null); //Centrar la ventana
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Biccicleterias Pepitos");
        setResizable(false);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Ganacias ", "Ventas"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ID");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ganacias");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ventas");

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton1)
                            .addComponent(jButton3))
                        .addGap(12, 12, 12)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jLabel3))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Boton Agregar
             
        try {
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bicicleterias","root","1234");
            
            PreparedStatement c1 = c.prepareStatement("insert into bicicleteria values (?,?,?)");
            c1.setString(1,jTextField1.getText());  //con estas lineas le pasamos los valores
            c1.setString(2,jTextField2.getText());
            c1.setString(3,jTextField3.getText());
            
            c1.executeUpdate(); //Ejecutar la actualización para que agregue los nuevos valores
            
            mostrarBicicleterias(); //Muestra la tabla, con los valores agregados
            
            jTextField1.setText(null); //para que una vez que los paso, me deje en blanco textfield
            jTextField2.setText(null);
            jTextField3.setText(null);
            
            
        } catch (Exception e) {
            System.out.println("No pudo conectarse");
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Boton Modificar
        
        try {
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bicicleterias","root","1234");
            
            PreparedStatement c1 = c.prepareStatement("update bicicleteria set ganancias = ?, cantVentas = ? where idBicicleteria = ?");
           //Si pongo la condición where me setea toda la tabla. Modifica los valores cuando el id es = algunos de los valores que estan en la tabla.
            c1.setString(1,jTextField2.getText());  //Hay que respetar el orden en el cual se cargan los datos
            c1.setString(2,jTextField3.getText());
            c1.setString(3,jTextField1.getText());
            
            c1.executeUpdate(); //Ejecutar la actualización para que agregue los nuevos valores
            
            mostrarBicicleterias(); //Muestra la tabla, con los valores agregados
            
            jTextField1.setText(null); //para que una vez que los paso, me deje en blanco textfield, si quiero lo puedo sacar 
            jTextField2.setText(null);
            jTextField3.setText(null);
            
            
        } catch (Exception e) {
            System.out.println("No pudo conectarse");
        }
               
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Boton Eliminar
        
        try {
            
            //Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/bicicleterias","root","1234");
            
            PreparedStatement c1 = c.prepareStatement("delete from bicicleteria where idBicicleteria = ?");
            c1.setString(1,jTextField1.getText());  //solo uso el tex1, pq de ahí tomo el dato que es un campo unico
                                                        //e irrepetible (PK)

            
            c1.executeUpdate(); //Ejecutar la actualización para que agregue los nuevos valores
            
            mostrarBicicleterias(); //Muestra la tabla, con los valores modificados
            
            jTextField1.setText(null); //para que una vez que los paso, me deje en blanco textfield
            jTextField2.setText(null);
            jTextField3.setText(null);
            
            
        } catch (Exception e) {
            System.out.println("No pudo conectarse");
        }        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // events mouse mouseClicked
        /* Retorna la fila selccionada y lo guardo pq retorna un entero.(1er paso)
        
        */
        int nroFila = jTable1.getSelectedRow();
        DefaultTableModel datos  = (DefaultTableModel) jTable1.getModel();
        
        if (nroFila >= 0) { // Ojo tener cuidado que empieza en indice en 0.
            
            String id_bicicleteria = datos.getValueAt(nroFila, 0).toString(); //retorna el valor que esta en x fila, x columna
            //y ese valor va a ir a parar a un String, me traigo el 1er valor y guardo en id _bici; así con todos los demás.
            String ganancias = datos.getValueAt(nroFila, 1).toString();
            String cant_ventas = datos.getValueAt(nroFila, 2).toString();
            
            jTextField1.setText(id_bicicleteria);//Al textfield1 le estoy seteeando lo que se selccione en l paso anterior
            jTextField2.setText(ganancias);
            jTextField3.setText(cant_ventas);
        }   
    }//GEN-LAST:event_jTable1MouseClicked
// La finalidad de esto es que cdo yo selecione una fila se carguen los datos que hay en las textfield correspondientes.
 
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
            java.util.logging.Logger.getLogger(VistaBicicleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBicicleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBicicleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBicicleteria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBicicleteria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

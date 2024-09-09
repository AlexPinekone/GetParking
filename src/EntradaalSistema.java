
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class EntradaalSistema extends javax.swing.JFrame {
    AccesoDB db = new AccesoDB();
    ResultSet res;
    Estado e = new Estado();
   
    
    
    /**
     * Creates new form EntradaalSistema
     */
    public EntradaalSistema() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon(getClass().getResource("Imagenes/GPv3.png"));
        ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(this.jLabel3.getWidth(),this.jLabel3.getHeight(),Image.SCALE_DEFAULT));
        this.jLabel3.setIcon(icon);
        

    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/v1.png"));


        return retValue;
    }

   

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbousuario = new javax.swing.JComboBox<>();
        pwdcontraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Endrada al Sistema");
        setIconImage(getIconImage());
        setResizable(false);

        jLabel1.setText("Tipo de Usuario :");

        cbousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Administrador" }));

        pwdcontraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwdcontraseñaActionPerformed(evt);
            }
        });

        jLabel2.setText("Contraseña :");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Terminator Two", 0, 24)); // NOI18N
        jLabel4.setText("Bienvenido a GET PARKING");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addComponent(pwdcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pwdcontraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pwdcontraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwdcontraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwdcontraseñaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int resp;
        
        resp=JOptionPane.showConfirmDialog(this,"¿Seguro de Salir?","Salida",JOptionPane.YES_NO_OPTION);
            if(resp==0)
                System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            
             Principal p;

            if(this.cbousuario.getSelectedItem()=="Empleado"){
                String contra= String.valueOf(this.pwdcontraseña.getPassword());
                if(contra.equals("12345")){
                    
           
            if (db.abrir()){
                String sql="update estado set esta = 'empleado'";
                db.operacionBD(sql);
                ResultSet sql1;
                sql1 = db.consulta(e.consultaEstado());
                try {
                    sql1.next();
                } catch (SQLException ex) {
                    Logger.getLogger(EntradaalSistema.class.getName()).log(Level.SEVERE, null, ex);
                }
                e.setDatos(sql1);

                db.cerrar();
                
            }else{
                JOptionPane.showMessageDialog(this,"Error de conexión a la BD");
            }
        
                
                   
                JOptionPane.showMessageDialog(this,"Bienvenido al Sistema ", "Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                p=  new Principal();
                p.setVisible(true);
                this.setVisible(false);
                
                    
                }else{
                    JOptionPane.showMessageDialog(this,"Ingrese la Contraseña Correcta");
                }
            }
            if(this.cbousuario.getSelectedItem()=="Administrador"){
                String con= String.valueOf(this.pwdcontraseña.getPassword());
                if(con.equals("123456")){
                    if (db.abrir()){
                         String sql="update estado set esta = 'administrador'";
                         db.operacionBD(sql);
                         ResultSet sql1;
                sql1 = db.consulta(e.consultaEstado());
                        try {
                            sql1.next();
                        } catch (SQLException ex) {
                            Logger.getLogger(EntradaalSistema.class.getName()).log(Level.SEVERE, null, ex);
                        }
                e.setDatos(sql1);

                db.cerrar();
                
            }else{
                JOptionPane.showMessageDialog(this,"Error de conexión a la BD");
            }
                
                   
                JOptionPane.showMessageDialog(this,"Bienvenido al Sistema Administrador ", "Bienvenido",JOptionPane.INFORMATION_MESSAGE);
                
                p = new Principal();
                p.setVisible(true);
                this.setVisible(false);
                
                
                }else{
                    JOptionPane.showMessageDialog(this,"Ingrese la Contraseña Correcta");
                }
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    

    
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
            java.util.logging.Logger.getLogger(EntradaalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaalSistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaalSistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbousuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pwdcontraseña;
    // End of variables declaration//GEN-END:variables
}

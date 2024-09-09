
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class EntradadeAuto extends javax.swing.JInternalFrame {
    AccesoDB db = new AccesoDB();
    Coche c = new Coche();
    ResultSet res,res1,res2,res3;
    Estacionamiento es = new Estacionamiento();
    
    

    
    public EntradadeAuto() {
        initComponents();
        Timer tiempo=new Timer(100, new EntradadeAuto.horas());
        tiempo.start();
        this.txtfecha.setText(fecha());
    }
    
    
    
    
    
    public static String fecha(){
        Date fecha = new Date();
        SimpleDateFormat forfe = new SimpleDateFormat("dd/MM/YYYY");
        return forfe.format(fecha);
    }
    
    class horas implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e){
            Date sistHora=new Date();
            String pmAm="hh:mm a";
            SimpleDateFormat format=new SimpleDateFormat(pmAm);
            Calendar hoy=Calendar.getInstance();
            txthora.setText(String.format(format.format(sistHora),hoy));      
        }  
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        txthora = new javax.swing.JTextField();
        btnedifecha = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtplaca = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtcolor = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtmodelo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setTitle("Entrada");

        jLabel1.setText("Fecha:");

        jLabel2.setText("Hora:");

        txtfecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtfecha.setEnabled(false);

        txthora.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txthora.setEnabled(false);

        btnedifecha.setText("Editar");
        btnedifecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnedifechaActionPerformed(evt);
            }
        });
        btnedifecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnedifechaKeyPressed(evt);
            }
        });

        jLabel3.setText("Lugar:");

        jLabel4.setText("Placa:");

        jLabel5.setText("Color:");

        jLabel6.setText("Marca:");

        jLabel7.setText("Modelo:");

        jButton1.setText("Listo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtplacaActionPerformed(evt);
            }
        });
        txtplaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtplacaKeyTyped(evt);
            }
        });

        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--- Lugares ---", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        txtcolor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcolor.setEnabled(false);

        txtmarca.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtmarca.setEnabled(false);

        txtmodelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtmodelo.setEnabled(false);

        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(147, 147, 147))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtfecha, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(txthora))
                        .addGap(18, 18, 18)
                        .addComponent(btnedifecha))
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtmodelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(txtmarca, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtcolor, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton3)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnedifecha))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txthora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtplaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtmodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnedifechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnedifechaActionPerformed
        this.txtfecha.setEnabled(true);
    }//GEN-LAST:event_btnedifechaActionPerformed

    private void btnedifechaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnedifechaKeyPressed
        
    }//GEN-LAST:event_btnedifechaKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        
        try {
            if(db.abrir()){
            ResultSet r1;
                r1=db.consulta("SELECT estado from estacionamiento where No_Lugar="+this.jComboBox1.getSelectedItem().toString());
                String re1;
                r1.next();
                es.setDatos(r1);
                re1=r1.getString("Estado");
                
                
                if(re1.equals("1")){
                    JOptionPane.showMessageDialog(this, "El lugar está ocupado");
                this.inicio();
                }
            }else{
                JOptionPane.showMessageDialog(this, "Error de Coneccion");
            }
            db.cerrar();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        
        
        if(this.txtplaca.getText().equals("")){
            
           JOptionPane.showMessageDialog(this, "Ingrese una Placa");
            
        }else{
            
            if(this.jComboBox1.getSelectedItem()=="--- Lugares ---"){
                
                 JOptionPane.showMessageDialog(this, "Seleccione un lugar");
                
            }else{
                if(this.txtfecha.getText().equals("")){
                JOptionPane.showMessageDialog(this, "El campo Fecha esta vacío");
            }else{
            
             try{
            
            c.setPlaca(txtplaca.getText());
            if (db.abrir()){
                
                res=db.consulta(c.consultaPlaca());
                
                if (res==null){
                    JOptionPane.showMessageDialog(this,"Error en la consulta");
                }else{
                    if (res.first()){
                        c.setDatos(res);
                        
                        JOptionPane.showMessageDialog(this,"Cliente Existente");
                        txtcolor.setText(c.getColor());
                        txtmarca.setText(c.getMarca());
                        txtmodelo.setText(c.getModelo());
                        txtcolor.setEnabled(false);
                        txtmarca.setEnabled(false);
                        txtmodelo.setEnabled(false);
                        
                        
                        
                    }else{
                        habilita();
                    }
                }
                db.cerrar();
            }else{
                JOptionPane.showMessageDialog(this,"Error de conexión a la BD");
            }
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        
        
        }
             
             
            }
            }
    }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtplacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplacaKeyTyped
        Character c=evt.getKeyChar();
        if(Character.isLetter(c))
            evt.setKeyChar(Character.toUpperCase(c));
        if (this.txtplaca.getText().length()== 12){
        evt.consume();
        }
    }//GEN-LAST:event_txtplacaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Principal prin = new Principal();
        try{
            if(this.txtplaca.getText().length()==0){    
                    JOptionPane.showMessageDialog(this, "Faltan Datos");
            }else{
                
                if (db.abrir()){
                c.setPlaca(this.txtplaca.getText());
                c.setColor(this.txtcolor.getText());
                c.setModelo(this.txtmodelo.getText());
                c.setMarca(this.txtmarca.getText());
                c.setFechae(this.txtfecha.getText());
                c.setHorae(this.txthora.getText());
                c.setHoras("0");
                
                
                
                if(this.jComboBox1.getSelectedItem().equals(this.jComboBox1.getSelectedIndex())){
                JOptionPane.showMessageDialog(this, "Ingrese un lugar");
                }else{
                    c.setNoLugar(Integer.parseInt(this.jComboBox1.getSelectedItem().toString()));
                    es.setNo_Lugar(Integer.parseInt(this.jComboBox1.getSelectedItem().toString()));
                    
                res1=db.consulta("select No_Lugar,Estado from estacionamiento where No_Lugar="+(this.jComboBox1.getSelectedItem().toString())+"and Estado=0");
                
                }
                if(es.getEstado()==1){
                    JOptionPane.showMessageDialog(this, "El lugar está ocupado");
                
                }else{
                if (db.operacionBD(c.insertar())){
                    if(db.operacionBD("update estacionamiento set Estado = 1 WHERE No_Lugar="+this.jComboBox1.getSelectedItem().toString())){
                     
                     
                        JOptionPane.showMessageDialog(this, "Datos Almacenado");
                        prin.actualizar();
                        inicio();
                        this.dispose();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "Error al almacenar los datos");
                }
                db.cerrar();
                        }
            }else{
                JOptionPane.showMessageDialog(this, "Error de conexión a la BD");
            }
            
            }
        }catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex.getMessage());
        }        

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtplacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtplacaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedifecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txthora;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtmodelo;
    private javax.swing.JTextField txtplaca;
    // End of variables declaration//GEN-END:variables

    public void habilita(){
        this.txtcolor.setEnabled(true);
        this.txtmarca.setEnabled(true);
        this.txtmodelo.setEnabled(true);
        
    }
    
    
    public void inicio(){
        fecha();
        txtplaca.setText("");
        txtcolor.setText("");
        txtmarca.setText("");
        txtmodelo.setText("");
        
        txtcolor.setEnabled(false);
        txtmarca.setEnabled(false);
        txtmodelo.setEnabled(false);
        txtplaca.setEnabled(true);
        txtfecha.setEnabled(false);
        this.jComboBox1.setSelectedIndex(0);
        
        
    }


}

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class Principal extends javax.swing.JFrame {
    AccesoDB db = new AccesoDB();
    SalidadeAuto sa = new SalidadeAuto();
    EntradadeAuto ea = new EntradadeAuto();
    EntradaalSistema es = new EntradaalSistema();
    Estado e = new Estado();
    ResultSet resa;
    Estacionamiento est = new Estacionamiento();
    Estadisticas et = new Estadisticas();


    public Principal() {
        initComponents();
        t1 = new Timer(10, accion1);
        t2 = new Timer(10, accion2);
        t3 = new Timer(10, accion3);
        t4 = new Timer(10, accion4);
        t5 = new Timer(10, accion5);
        t6 = new Timer(10, accion6);
        t7 = new Timer(10, accion7);
        t8 = new Timer(10, accion8);
        t9 = new Timer(10, accion9);
        t10 = new Timer(10, accion10);
        t11 = new Timer(10, accion11);
        t12 = new Timer(10, accion12);
        t13 = new Timer(10, accion13);
        t14 = new Timer(10, accion14);
        t15 = new Timer(10, accion15);
        
        try{
        if (db.abrir()){
            
                resa=db.consulta(e.consultaEstado());
                resa.next();
                e.setDatos(resa);
                db.cerrar();
        
                if(e.getEsta().equals("empleado")){
                this.mnuestadisticas.setEnabled(false);
                }else{
                 this.mnuestadisticas.setEnabled(true);
                 }

                
                
            }else{
                JOptionPane.showMessageDialog(this,"Error de conexión a la BD");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
            
        
        
        
        ImageIcon img = new ImageIcon(getClass().getResource("Imagenes/Estv2.png"));
        ImageIcon icon = new ImageIcon(img.getImage().getScaledInstance(this.lblestacionamientoimg.getWidth(),this.lblestacionamientoimg.getHeight(),Image.SCALE_DEFAULT));
        this.lblestacionamientoimg.setIcon(icon);
        
        ImageIcon img1 = new ImageIcon(getClass().getResource("Imagenes/vertical.png"));
        ImageIcon icon1 = new ImageIcon(img1.getImage().getScaledInstance(this.lbllugar1.getWidth(),this.lbllugar1.getHeight(),Image.SCALE_DEFAULT));
        this.lbllugar1.setIcon(icon1);this.lbllugar1.setEnabled(false);
        this.lbllugar2.setIcon(icon1);this.lbllugar2.setEnabled(false);
        this.lbllugar3.setIcon(icon1);this.lbllugar3.setEnabled(false);
        this.lbllugar4.setIcon(icon1);this.lbllugar4.setEnabled(false);
        this.lbllugar5.setIcon(icon1);this.lbllugar5.setEnabled(false);
        this.lbllugar6.setIcon(icon1);this.lbllugar6.setEnabled(false);
        this.lbllugar7.setIcon(icon1);this.lbllugar7.setEnabled(false);
        this.lbllugar8.setIcon(icon1);this.lbllugar8.setEnabled(false);
        this.lbllugar9.setIcon(icon1);this.lbllugar9.setEnabled(false);
        
        ImageIcon img2 = new ImageIcon(getClass().getResource("Imagenes/horizontal.png"));
        ImageIcon icon2 = new ImageIcon(img2.getImage().getScaledInstance(this.lbllugar10.getWidth(),this.lbllugar10.getHeight(),Image.SCALE_DEFAULT));
        this.lbllugar10.setIcon(icon2);this.lbllugar10.setEnabled(false);
        this.lbllugar11.setIcon(icon2);this.lbllugar11.setEnabled(false);
        this.lbllugar12.setIcon(icon2);this.lbllugar12.setEnabled(false);
        
        ImageIcon img3 = new ImageIcon(getClass().getResource("Imagenes/preferente.png"));
        ImageIcon icon3 = new ImageIcon(img3.getImage().getScaledInstance(this.lbllugar13.getWidth(),this.lbllugar1.getHeight(),Image.SCALE_DEFAULT));
        this.lbllugar13.setIcon(icon3);this.lbllugar13.setEnabled(false);
        this.lbllugar14.setIcon(icon3);this.lbllugar14.setEnabled(false);
        this.lbllugar15.setIcon(icon3);this.lbllugar15.setEnabled(false);
        
        this.setLocationRelativeTo(null);
        this.desktopPane.add(ea);
        this.desktopPane.add(sa);
        
        
        
        
        try {
            if(db.abrir()){
                ResultSet r1;
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=1");
                String re1; 
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar1.setEnabled(true);
                    t1.start();
                }else{
                    this.lbllugar1.setEnabled(false);
                    t1.stop();
                }
                
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=2");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar2.setEnabled(true);
                    t2.start();
                }else{
                    this.lbllugar2.setEnabled(false);
                    t2.stop();
                }
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=3");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar3.setEnabled(true);
                    t3.start();
                }else{
                    this.lbllugar3.setEnabled(false);
                    t3.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=4");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar4.setEnabled(true);
                    t4.start();
                }else{
                    this.lbllugar4.setEnabled(false);
                    t4.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=5");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar5.setEnabled(true);
                    t5.start();
                }else{
                    this.lbllugar5.setEnabled(false);
                    t5.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=6");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar6.setEnabled(true);
                    t6.start();
                }else{
                    this.lbllugar6.setEnabled(false);
                    t6.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=7");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar7.setEnabled(true);
                    t7.start();
                }else{
                    this.lbllugar7.setEnabled(false);
                    t7.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=8");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar8.setEnabled(true);
                    t8.start();
                }else{
                    this.lbllugar8.setEnabled(false);
                    t8.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=9");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar9.setEnabled(true);
                    t9.start();
                }else{
                    this.lbllugar9.setEnabled(false);
                    t9.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=10");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar10.setEnabled(true);
                    t10.start();
                }else{
                    this.lbllugar10.setEnabled(false);
                    t10.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=11");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar11.setEnabled(true);
                    t11.start();
                }else{
                    this.lbllugar11.setEnabled(false);
                    t11.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=12");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar12.setEnabled(true);
                    t12.start();
                }else{
                    this.lbllugar12.setEnabled(false);
                    t12.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=13");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar13.setEnabled(true);
                    t13.start();
                }else{
                    this.lbllugar13.setEnabled(false);
                    t13.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=14");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar14.setEnabled(true);
                    t14.start();
                }else{
                    this.lbllugar14.setEnabled(false);
                    t14.stop();
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=15");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar15.setEnabled(true);
                    t15.start();
                }else{
                    this.lbllugar15.setEnabled(false);
                    t15.stop();
                }
                
                
            }
            db.cerrar();
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
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

        desktopPane = new javax.swing.JDesktopPane();
        lbllugar1 = new javax.swing.JLabel();
        lbllugar2 = new javax.swing.JLabel();
        lbllugar3 = new javax.swing.JLabel();
        lbllugar4 = new javax.swing.JLabel();
        lbllugar5 = new javax.swing.JLabel();
        lbllugar6 = new javax.swing.JLabel();
        lbllugar7 = new javax.swing.JLabel();
        lbllugar8 = new javax.swing.JLabel();
        lbllugar9 = new javax.swing.JLabel();
        lbllugar10 = new javax.swing.JLabel();
        lbllugar11 = new javax.swing.JLabel();
        lbllugar12 = new javax.swing.JLabel();
        lbllugar13 = new javax.swing.JLabel();
        lbllugar14 = new javax.swing.JLabel();
        lbllugar15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblestacionamientoimg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        mnuestadisticas = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estacionamiento Cool ");
        setIconImage(getIconImage());
        setResizable(false);

        desktopPane.add(lbllugar1);
        lbllugar1.setBounds(50, 190, 105, 130);
        desktopPane.add(lbllugar2);
        lbllugar2.setBounds(170, 190, 105, 130);
        desktopPane.add(lbllugar3);
        lbllugar3.setBounds(290, 190, 105, 130);
        desktopPane.add(lbllugar4);
        lbllugar4.setBounds(412, 190, 105, 130);
        desktopPane.add(lbllugar5);
        lbllugar5.setBounds(535, 190, 105, 130);
        desktopPane.add(lbllugar6);
        lbllugar6.setBounds(657, 190, 105, 130);
        desktopPane.add(lbllugar7);
        lbllugar7.setBounds(778, 190, 105, 130);
        desktopPane.add(lbllugar8);
        lbllugar8.setBounds(900, 190, 105, 130);
        desktopPane.add(lbllugar9);
        lbllugar9.setBounds(1020, 190, 105, 130);
        desktopPane.add(lbllugar10);
        lbllugar10.setBounds(890, 460, 180, 85);
        desktopPane.add(lbllugar11);
        lbllugar11.setBounds(890, 558, 180, 85);
        desktopPane.add(lbllugar12);
        lbllugar12.setBounds(890, 655, 180, 85);
        desktopPane.add(lbllugar13);
        lbllugar13.setBounds(100, 655, 190, 85);
        desktopPane.add(lbllugar14);
        lbllugar14.setBounds(100, 558, 190, 85);
        desktopPane.add(lbllugar15);
        lbllugar15.setBounds(100, 463, 190, 85);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel1);
        jLabel1.setBounds(60, 350, 90, 30);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel2);
        jLabel2.setBounds(180, 350, 90, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel3);
        jLabel3.setBounds(300, 350, 90, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel4);
        jLabel4.setBounds(420, 350, 90, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel5);
        jLabel5.setBounds(540, 350, 90, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel6);
        jLabel6.setBounds(660, 350, 90, 30);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel8);
        jLabel8.setBounds(910, 350, 90, 30);

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel7);
        jLabel7.setBounds(780, 350, 90, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel9);
        jLabel9.setBounds(1030, 350, 90, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel10);
        jLabel10.setBounds(780, 490, 90, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel11);
        jLabel11.setBounds(780, 590, 90, 30);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel12);
        jLabel12.setBounds(780, 690, 90, 30);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel13);
        jLabel13.setBounds(300, 690, 90, 30);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel14);
        jLabel14.setBounds(300, 590, 90, 30);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(jLabel15);
        jLabel15.setBounds(300, 490, 90, 30);

        lblestacionamientoimg.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        desktopPane.add(lblestacionamientoimg);
        lblestacionamientoimg.setBounds(30, 50, 1110, 710);

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        desktopPane.add(jButton1);
        jButton1.setBounds(40, 10, 100, 28);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Autos");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Entra");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Sale");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        menuBar.add(fileMenu);

        mnuestadisticas.setMnemonic('e');
        mnuestadisticas.setText("Estadisticas");
        mnuestadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuestadisticasActionPerformed(evt);
            }
        });

        jMenuItem4.setText("Fechas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnuestadisticas.add(jMenuItem4);

        menuBar.add(mnuestadisticas);

        jMenu1.setText("Ayuda");

        jMenuItem2.setText("Manual del Usuario");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Manual del Programador");
        jMenu1.add(jMenuItem3);

        menuBar.add(jMenu1);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Salir");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Del Sistema");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        jMenuItem1.setText("Del Programa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu.add(jMenuItem1);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 785, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Timer t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    private int h1,h2,h3,h4,h5,h6,h7,h8,h9,h10,h11,h12,h13,h14,h15,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,
            s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,cs1,cs2,cs3,cs4,cs5,cs6,cs7,cs8,cs9,cs10,cs11,cs12,cs13,cs14,cs15;
    
    
    private ActionListener accion1 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs1++;if(cs1==100){cs1=0;++s1;}if(s1==60){s1=0;++m1;}if(m1==60){m1=0;++h1;}
        actualizarLabel1();}
    };
    
    
    private ActionListener accion2 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs2++;if(cs2==100){cs2=0;++s2;}if(s2==60){s2=0;++m2;}if(m2==60){m2=0;++h2;}
        actualizarLabel2();}
    };
    
    private ActionListener accion3 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs3++;if(cs3==100){cs3=0;++s3;}if(s3==60){s3=0;++m3;}if(m3==60){m3=0;++h3;}
        actualizarLabel3();}
    };
    
    private ActionListener accion4 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs4++;if(cs4==100){cs4=0;++s4;}if(s4==60){s4=0;++m4;}if(m4==60){m4=0;++h4;}
        actualizarLabel4();}
    };
    
    private ActionListener accion5 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs5++;if(cs5==100){cs5=0;++s5;}if(s5==60){s5=0;++m5;}if(m5==60){m5=0;++h5;}
        actualizarLabel5();}
    };
    
    private ActionListener accion6 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs6++;if(cs6==100){cs6=0;++s6;}if(s6==60){s6=0;++m6;}if(m6==60){m6=0;++h6;}
        actualizarLabel6();}
    };
    
    private ActionListener accion7 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs7++;if(cs7==100){cs7=0;++s7;}if(s7==60){s7=0;++m7;}if(m7==60){m7=0;++h7;}
        actualizarLabel7();}
    };
    
    private ActionListener accion8 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs8++;if(cs8==100){cs8=0;++s8;}if(s8==60){s8=0;++m8;}if(m8==60){m8=0;++h8;}
        actualizarLabel8();}
    };
    
    private ActionListener accion9 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs9++;if(cs9==100){cs9=0;++s9;}if(s9==60){s9=0;++m9;}if(m9==60){m9=0;++h9;}
        actualizarLabel9();}
    };
    
    private ActionListener accion10 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs10++;if(cs10==100){cs10=0;++s10;}if(s10==60){s10=0;++m10;}if(m10==60){m10=0;++h10;}
        actualizarLabel10();}
    };
    
    private ActionListener accion11 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs11++;if(cs11==100){cs11=0;++s11;}if(s11==60){s11=0;++m11;}if(m11==60){m11=0;++h11;}
        actualizarLabel11();}
    };
    
    private ActionListener accion12 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs12++;if(cs12==100){cs12=0;++s12;}if(s12==60){s12=0;++m12;}if(m12==60){m12=0;++h12;}
        actualizarLabel12();}
    };
    
    private ActionListener accion13 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs13++;if(cs13==100){cs13=0;++s13;}if(s13==60){s13=0;++m13;}if(m13==60){m13=0;++h13;}
        actualizarLabel13();}
    };
    
    private ActionListener accion14 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs14++;if(cs14==100){cs14=0;++s14;}if(s14==60){s14=0;++m14;}if(m14==60){m14=0;++h14;}
        actualizarLabel14();}
    };
    
    private ActionListener accion15 = new ActionListener(){
       
        @Override
        public void actionPerformed(ActionEvent ae) {
        cs15++;if(cs15==100){cs15=0;++s15;}if(s15==60){s15=0;++m15;}if(m15==60){m15=0;++h15;}
        actualizarLabel15();}
    };
    

    
    public void actualizarLabel1(){
        String Tiempo=(h1<=9?"0":"")+h1+":"+(m1<=9?"0":"")+m1+":"+(s1<=9?"0":"")+s1;
        this.jLabel1.setText(Tiempo);
    }
    
    
    public void actualizarLabel2(){
        String Tiempo=(h2<=9?"0":"")+h2+":"+(m2<=9?"0":"")+m2+":"+(s2<=9?"0":"")+s2;
        this.jLabel2.setText(Tiempo);
    }
    
    
    public void actualizarLabel3(){
        String Tiempo=(h3<=9?"0":"")+h3+":"+(m3<=9?"0":"")+m3+":"+(s3<=9?"0":"")+s3;
        this.jLabel3.setText(Tiempo);
    }
    
    
    public void actualizarLabel4(){
        String Tiempo=(h4<=9?"0":"")+h4+":"+(m4<=9?"0":"")+m4+":"+(s4<=9?"0":"")+s4;
        this.jLabel4.setText(Tiempo);
    }
    
    
    public void actualizarLabel5(){
        String Tiempo=(h5<=9?"0":"")+h5+":"+(m5<=9?"0":"")+m5+":"+(s5<=9?"0":"")+s5;
        this.jLabel5.setText(Tiempo);
    }
    
    
    public void actualizarLabel6(){
        String Tiempo=(h6<=9?"0":"")+h6+":"+(m6<=9?"0":"")+m6+":"+(s6<=9?"0":"")+s6;
        this.jLabel6.setText(Tiempo);
    }
    
    
    public void actualizarLabel7(){
        String Tiempo=(h7<=9?"0":"")+h7+":"+(m7<=9?"0":"")+m7+":"+(s7<=9?"0":"")+s7;
        this.jLabel7.setText(Tiempo);
    }
    
    
    public void actualizarLabel8(){
        String Tiempo=(h8<=9?"0":"")+h8+":"+(m8<=9?"0":"")+m8+":"+(s8<=9?"0":"")+s8;
        this.jLabel8.setText(Tiempo);
    }
    
    
    public void actualizarLabel9(){
        String Tiempo=(h9<=9?"0":"")+h9+":"+(m9<=9?"0":"")+m9+":"+(s9<=9?"0":"")+s9;
        this.jLabel9.setText(Tiempo);
    }
    
    public void actualizarLabel10(){
        String Tiempo=(h10<=9?"0":"")+h10+":"+(m10<=9?"0":"")+m10+":"+(s10<=9?"0":"")+s10;
        this.jLabel10.setText(Tiempo);
    }
    
    public void actualizarLabel11(){
        String Tiempo=(h11<=9?"0":"")+h11+":"+(m11<=9?"0":"")+m11+":"+(s11<=9?"0":"")+s11;
        this.jLabel11.setText(Tiempo);
    }
    
    public void actualizarLabel12(){
        String Tiempo=(h12<=9?"0":"")+h12+":"+(m12<=9?"0":"")+m12+":"+(s12<=9?"0":"")+s12;
        this.jLabel12.setText(Tiempo);
    }
    
    public void actualizarLabel13(){
        String Tiempo=(h13<=9?"0":"")+h13+":"+(m13<=9?"0":"")+m13+":"+(s13<=9?"0":"")+s13;
        this.jLabel13.setText(Tiempo);
    }
    
    public void actualizarLabel14(){
        String Tiempo=(h14<=9?"0":"")+h14+":"+(m14<=9?"0":"")+m14+":"+(s14<=9?"0":"")+s14;
        this.jLabel14.setText(Tiempo);
    }
    
    public void actualizarLabel15(){
        String Tiempo=(h15<=9?"0":"")+h15+":"+(m15<=9?"0":"")+m15+":"+(s15<=9?"0":"")+s15;
        this.jLabel15.setText(Tiempo);
    }
    
    
    
    
    
    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
        if(!(ea.isVisible())){
        ea=new EntradadeAuto();
        this.desktopPane.add(ea);
        ea.setVisible(true);    
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        es.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        if(!(sa.isVisible())){
        sa=new SalidadeAuto();
        this.desktopPane.add(sa);
        sa.setVisible(true);    
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void mnuestadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuestadisticasActionPerformed
        
    }//GEN-LAST:event_mnuestadisticasActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        if(!(et.isVisible())){
        et=new Estadisticas();
        this.desktopPane.add(et);
        et.setVisible(true);    
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.actualizar();
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblestacionamientoimg;
    private javax.swing.JLabel lbllugar1;
    private javax.swing.JLabel lbllugar10;
    private javax.swing.JLabel lbllugar11;
    private javax.swing.JLabel lbllugar12;
    private javax.swing.JLabel lbllugar13;
    private javax.swing.JLabel lbllugar14;
    private javax.swing.JLabel lbllugar15;
    private javax.swing.JLabel lbllugar2;
    private javax.swing.JLabel lbllugar3;
    private javax.swing.JLabel lbllugar4;
    private javax.swing.JLabel lbllugar5;
    private javax.swing.JLabel lbllugar6;
    private javax.swing.JLabel lbllugar7;
    private javax.swing.JLabel lbllugar8;
    private javax.swing.JLabel lbllugar9;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu mnuestadisticas;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

    
    
    public void actualizar(){
        
        try {
            if(db.abrir()){
                ResultSet r1;
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=1");
                String re1; 
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar1.setEnabled(true);
                    t1.start();
                }else{
                    this.lbllugar1.setEnabled(false);
                    t1.stop();
                    
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel1.getText()+"' where coche.no_lugar = 1 and coche.Tiempo = '00:00:00'")){
                        
                        h1=0;
                        m1=0;
                        s1=0;
                        cs1=0;
                        actualizarLabel1();
                        jLabel1.setText("");
                        
                    }else{
                        
                    }
                    
                }
                
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=2");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar2.setEnabled(true);
                    t2.start();
                }else{
                    this.lbllugar2.setEnabled(false);
                    t2.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel2.getText()+"' where coche.no_lugar = 2 and coche.Tiempo = '00:00:00'")){
                        h2=0;
                        m2=0;
                        s2=0;
                        cs2=0;
                        actualizarLabel2();
                        jLabel2.setText("");
                    }else{
                        
                    }
                    
                }
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=3");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar3.setEnabled(true);
                    t3.start();
                }else{
                    this.lbllugar3.setEnabled(false);
                    t3.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel3.getText()+"' where coche.no_lugar = 3 and coche.Tiempo = '00:00:00'")){
                        h3=0;
                        m3=0;
                        s3=0;
                        cs3=0;
                        actualizarLabel3();
                        jLabel3.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=4");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar4.setEnabled(true);
                    t4.start();
                }else{
                    this.lbllugar4.setEnabled(false);
                    t4.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel4.getText()+"' where coche.no_lugar = 4 and coche.Tiempo = '00:00:00'")){
                        h4=0;
                        m4=0;
                        s4=0;
                        cs4=0;
                        actualizarLabel4();
                        jLabel4.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=5");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar5.setEnabled(true);
                    t5.start();
                }else{
                    this.lbllugar5.setEnabled(false);
                    t5.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel5.getText()+"' where coche.no_lugar = 5 and coche.Tiempo = '00:00:00'")){
                        h5=0;
                        m5=0;
                        s5=0;
                        cs5=0;
                        actualizarLabel5();
                        jLabel5.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=6");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar6.setEnabled(true);
                    t6.start();
                }else{
                    this.lbllugar6.setEnabled(false);
                    t6.stop();
                    
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel6.getText()+"' where coche.no_lugar = 6 and coche.Tiempo = '00:00:00'")){
                        h6=0;
                        m6=0;
                        s6=0;
                        cs6=0;
                        actualizarLabel6();
                        jLabel6.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=7");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar7.setEnabled(true);
                    t7.start();
                }else{
                    this.lbllugar7.setEnabled(false);
                    t7.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel7.getText()+"' where coche.no_lugar = 7 and coche.Tiempo = '00:00:00'")){
                        h7=0;
                        m7=0;
                        s7=0;
                        cs7=0;
                        actualizarLabel7();
                        jLabel7.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=8");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar8.setEnabled(true);
                    t8.start();
                }else{
                    this.lbllugar8.setEnabled(false);
                    t8.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel8.getText()+"' where coche.no_lugar = 8 and coche.Tiempo = '00:00:00'")){
                        h8=0;
                        m8=0;
                        s8=0;
                        cs8=0;
                        actualizarLabel8();
                        jLabel8.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=9");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar9.setEnabled(true);
                    t9.start();
                }else{
                    this.lbllugar9.setEnabled(false);
                    t9.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel9.getText()+"' where coche.no_lugar = 9 and coche.Tiempo = '00:00:00'")){
                        h9=0;
                        m9=0;
                        s9=0;
                        cs9=0;
                        actualizarLabel9();
                        jLabel9.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=10");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar10.setEnabled(true);
                    t10.start();
                }else{
                    this.lbllugar10.setEnabled(false);
                    t10.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel10.getText()+"' where coche.no_lugar = 10 and coche.Tiempo = '00:00:00'")){
                        h10=0;
                        m10=0;
                        s10=0;
                        cs10=0;
                        actualizarLabel10();
                        jLabel10.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=11");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar11.setEnabled(true);
                    t11.start();
                }else{
                    this.lbllugar11.setEnabled(false);
                    t11.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel11.getText()+"' where coche.no_lugar = 11 and coche.Tiempo = '00:00:00'")){
                        h11=0;
                        m11=0;
                        s11=0;
                        cs11=0;
                        actualizarLabel11();
                        jLabel11.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=12");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar12.setEnabled(true);
                    t12.start();
                }else{
                    this.lbllugar12.setEnabled(false);
                    t12.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel12.getText()+"' where coche.no_lugar = 12 and coche.Tiempo = '00:00:00'")){
                        h12=0;
                        m12=0;
                        s12=0;
                        cs12=0;
                        actualizarLabel12();
                        jLabel12.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=13");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar13.setEnabled(true);
                    t13.start();
                }else{
                    this.lbllugar13.setEnabled(false);
                    t13.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel13.getText()+"' where coche.no_lugar = 13 and coche.Tiempo = '00:00:00'")){
                        h13=0;
                        m13=0;
                        s13=0;
                        cs13=0;
                        actualizarLabel13();
                        jLabel13.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=14");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar14.setEnabled(true);
                    t14.start();
                }else{
                    this.lbllugar14.setEnabled(false);
                    t14.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel14.getText()+"' where coche.no_lugar = 14 and coche.Tiempo = '00:00:00'")){
                        h14=0;
                        m14=0;
                        s14=0;
                        cs14=0;
                        actualizarLabel14();
                        jLabel14.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                r1=db.consulta("select Estado from estacionamiento where No_Lugar=15");
                r1.next();
                est.setDatos(r1);
                re1=r1.getString("Estado");
                if(re1.equals("1")){
                    this.lbllugar15.setEnabled(true);
                    t15.start();
                }else{
                    this.lbllugar15.setEnabled(false);
                    t15.stop();
                    
                    if(db.operacionBD("UPDATE coche SET Tiempo = '"+jLabel15.getText()+"' where coche.no_lugar = 15 and coche.Tiempo = '00:00:00'")){
                        h15=0;
                        m15=0;
                        s15=0;
                        cs15=0;
                        actualizarLabel15();
                        jLabel15.setText("");
                    }else{
                        
                    }
                    
                }
                
                
                
                
            }
            db.cerrar();
            
            } catch (SQLException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        this.lbllugar1.updateUI();
        this.update(this.getGraphics());
        SwingUtilities.updateComponentTreeUI(this);
        this.revalidate();
        repaint();
    }
}

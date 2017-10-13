package com.jrdeveloper.src.view;

import com.jrdeveloper.src.model.EmpleadoDao;
import com.jrdeveloper.src.model.EmpleadoVo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VistaPrincipal extends JFrame {

    int xx; //Variable x para guardar informacion de posicion de la ventana 
    int xy;//Variable y para guardar informacion de posicion de la ventana

    public VistaPrincipal() {
        initComponents();
        iniciarDatosIniciales();//Inicio los datos con los que arranca la aplicacion
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        lblEspacio = new javax.swing.JLabel();
        lblSubtitulo = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        btnSalir = new javax.swing.JLabel();
        btnEmpleados = new javax.swing.JLabel();
        btnTiendas = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JLabel();
        btnProductos = new javax.swing.JLabel();
        lblPag = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblBorde = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        btnInstagram = new javax.swing.JButton();
        btnTwitter = new javax.swing.JButton();
        btnYoutube = new javax.swing.JButton();
        btnGithub = new javax.swing.JButton();
        home = new javax.swing.JPanel();
        panelEmpleados = new javax.swing.JPanel();
        panelDatos = new javax.swing.JPanel();
        lblNombreEmpleado = new javax.swing.JLabel();
        lblApellidoEmpleado = new javax.swing.JLabel();
        lblCedulaEmpleado = new javax.swing.JLabel();
        lblEdadEmpleado = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        txtApellidoEmpleado = new javax.swing.JTextField();
        txtEdadEmpleado = new javax.swing.JTextField();
        txtCedulaEmpleado = new javax.swing.JTextField();
        btnRegistrarEmpleado = new javax.swing.JButton();
        btnActualizarEmpleado = new javax.swing.JButton();
        btnConsultarEmpleado = new javax.swing.JButton();
        btnEliminarEmpleado = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEmpleados = new javax.swing.JTable();
        panelTiendas = new javax.swing.JPanel();
        panelDatos1 = new javax.swing.JPanel();
        lblNumeroTienda = new javax.swing.JLabel();
        lblUbicacionTienda = new javax.swing.JLabel();
        lblTipoTIenda = new javax.swing.JLabel();
        txtNumeroTienda = new javax.swing.JTextField();
        txtUbicacionTienda = new javax.swing.JTextField();
        txtTipoTienda = new javax.swing.JTextField();
        btnRegistrarTienda = new javax.swing.JButton();
        btnActualizarTienda = new javax.swing.JButton();
        btnConsultarTienda = new javax.swing.JButton();
        btnEliminarTienda = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableTiendas = new javax.swing.JTable();
        panelProveedores = new javax.swing.JPanel();
        panelDatos2 = new javax.swing.JPanel();
        lblNombreProveedor = new javax.swing.JLabel();
        lblUbicacionProveedor = new javax.swing.JLabel();
        lblCodigoProveedor = new javax.swing.JLabel();
        txtNombreProveedor = new javax.swing.JTextField();
        txtUbicacionProveedor = new javax.swing.JTextField();
        txtCodigoProveedor = new javax.swing.JTextField();
        btnRegistrarProveedores = new javax.swing.JButton();
        btnActualizarProveedores = new javax.swing.JButton();
        btnConsultarProveedores = new javax.swing.JButton();
        btnEliminarProveedores = new javax.swing.JButton();
        txtMercanciaProveedor = new javax.swing.JTextField();
        lblMercanciaProveedor = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableProveedores = new javax.swing.JTable();
        panelProductos = new javax.swing.JPanel();
        panelDatos3 = new javax.swing.JPanel();
        lblNombreProducto = new javax.swing.JLabel();
        lblDisponibleProducto = new javax.swing.JLabel();
        lblCodigoInternoProducto = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        txtDisponibleProducto = new javax.swing.JTextField();
        txtCodigoInternoProducto = new javax.swing.JTextField();
        btnRegistrarProducto = new javax.swing.JButton();
        btnActualizarProducto = new javax.swing.JButton();
        btnConsultarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        txtCodigoExternoProducto = new javax.swing.JTextField();
        lblCodigoExternoProducto = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        main.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(1, 198, 83));
        header.setPreferredSize(new java.awt.Dimension(838, 200));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        lblSubtitulo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblSubtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblSubtitulo.setText("Junior Garcia UI");

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Retail Swing Consulter");

        btnSalir.setBackground(new java.awt.Color(0, 150, 62));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalir.setText("X");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setOpaque(true);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });

        btnEmpleados.setBackground(new java.awt.Color(0, 150, 62));
        btnEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEmpleados.setText("Empleados");
        btnEmpleados.setOpaque(true);
        btnEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpleadosMouseClicked(evt);
            }
        });

        btnTiendas.setBackground(new java.awt.Color(1, 198, 83));
        btnTiendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTiendas.setForeground(new java.awt.Color(255, 255, 255));
        btnTiendas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnTiendas.setText("Tiendas");
        btnTiendas.setOpaque(true);
        btnTiendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTiendasMouseClicked(evt);
            }
        });

        btnProveedores.setBackground(new java.awt.Color(1, 198, 83));
        btnProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProveedores.setText("Proveedores");
        btnProveedores.setOpaque(true);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseClicked(evt);
            }
        });

        btnProductos.setBackground(new java.awt.Color(1, 198, 83));
        btnProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnProductos.setText("Productos");
        btnProductos.setOpaque(true);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductosMouseClicked(evt);
            }
        });

        lblPag.setBackground(new java.awt.Color(0, 150, 62));
        lblPag.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblPag.setForeground(new java.awt.Color(255, 255, 255));
        lblPag.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPag.setText("www.jrdeveloper.com.ve");
        lblPag.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblPag.setOpaque(true);
        lblPag.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPagMouseClicked(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 150, 62));
        jSeparator1.setForeground(new java.awt.Color(0, 150, 62));

        lblBorde.setBackground(new java.awt.Color(0, 150, 62));
        lblBorde.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblBorde.setForeground(new java.awt.Color(255, 255, 255));
        lblBorde.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBorde.setOpaque(true);
        lblBorde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBordeMouseClicked(evt);
            }
        });

        btnMin.setBackground(new java.awt.Color(0, 150, 62));
        btnMin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMin.setForeground(new java.awt.Color(255, 255, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("-");
        btnMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMin.setOpaque(true);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
        });

        btnInstagram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/instagram-01.png"))); // NOI18N
        btnInstagram.setBorder(null);
        btnInstagram.setBorderPainted(false);
        btnInstagram.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInstagram.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/instagramHover.png"))); // NOI18N

        btnTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/twitter-01.png"))); // NOI18N
        btnTwitter.setBorder(null);
        btnTwitter.setBorderPainted(false);
        btnTwitter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTwitter.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/twitterHover-01.png"))); // NOI18N

        btnYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/youtube-01.png"))); // NOI18N
        btnYoutube.setBorder(null);
        btnYoutube.setBorderPainted(false);
        btnYoutube.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnYoutube.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/youtubeHover-01.png"))); // NOI18N

        btnGithub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/github-01.png"))); // NOI18N
        btnGithub.setBorder(null);
        btnGithub.setBorderPainted(false);
        btnGithub.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGithub.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/jrdeveloper/resources/githubHover-01.png"))); // NOI18N

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblEspacio)
                .addGap(60, 60, 60)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSubtitulo)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInstagram, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnTwitter, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnYoutube, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(lblBorde, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(headerLayout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPag, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)))
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGithub))))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnMin))
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnInstagram)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTwitter)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(lblSubtitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTiendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(btnYoutube)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGithub)
                        .addGap(0, 39, Short.MAX_VALUE))))
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(lblPag, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94)
                .addComponent(lblEspacio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(lblBorde, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        home.setLayout(new java.awt.CardLayout());

        panelEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        panelEmpleados.setPreferredSize(new java.awt.Dimension(910, 300));
        panelEmpleados.setLayout(new java.awt.BorderLayout(5, 0));

        lblNombreEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreEmpleado.setText("Nombre:");

        lblApellidoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblApellidoEmpleado.setText("Apellido:");

        lblCedulaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCedulaEmpleado.setText("Cédula:");

        lblEdadEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEdadEmpleado.setText("Edad:");

        txtNombreEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });

        txtApellidoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtEdadEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCedulaEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnRegistrarEmpleado.setBackground(new java.awt.Color(0, 150, 62));
        btnRegistrarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEmpleado.setText("REGISTRAR");
        btnRegistrarEmpleado.setBorderPainted(false);
        btnRegistrarEmpleado.setFocusable(false);
        btnRegistrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmpleadoActionPerformed(evt);
            }
        });

        btnActualizarEmpleado.setBackground(new java.awt.Color(0, 150, 62));
        btnActualizarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarEmpleado.setText("ACTUALIZAR");
        btnActualizarEmpleado.setBorderPainted(false);
        btnActualizarEmpleado.setFocusable(false);
        btnActualizarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEmpleadoActionPerformed(evt);
            }
        });

        btnConsultarEmpleado.setBackground(new java.awt.Color(0, 150, 62));
        btnConsultarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarEmpleado.setText("CONSULTAR");
        btnConsultarEmpleado.setBorderPainted(false);
        btnConsultarEmpleado.setFocusable(false);
        btnConsultarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarEmpleadoActionPerformed(evt);
            }
        });

        btnEliminarEmpleado.setBackground(new java.awt.Color(222, 93, 83));
        btnEliminarEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarEmpleado.setText("ELIMINAR");
        btnEliminarEmpleado.setBorderPainted(false);
        btnEliminarEmpleado.setFocusable(false);
        btnEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEmpleadoActionPerformed(evt);
            }
        });

        lblInfo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(0, 93, 83));
        lblInfo.setText("Ingrese Campos Válidos");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(lblApellidoEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosLayout.createSequentialGroup()
                                .addComponent(lblNombreEmpleado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCedulaEmpleado)
                            .addComponent(lblEdadEmpleado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184, Short.MAX_VALUE)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnConsultarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(panelDatosLayout.createSequentialGroup()
                        .addComponent(lblInfo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreEmpleado)
                        .addComponent(lblEdadEmpleado)
                        .addComponent(txtNombreEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEdadEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarEmpleado))
                    .addComponent(btnConsultarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoEmpleado)
                    .addComponent(lblCedulaEmpleado)
                    .addComponent(txtApellidoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedulaEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarEmpleado)
                    .addComponent(btnEliminarEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfo)
                .addGap(11, 11, 11))
        );

        panelEmpleados.add(panelDatos, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        tableEmpleados.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableEmpleados.setForeground(new java.awt.Color(51, 51, 51));
        tableEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nombre", "Apellido", "Edad", "Cédula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableEmpleados.setGridColor(new java.awt.Color(255, 255, 255));
        tableEmpleados.setRowHeight(20);
        tableEmpleados.setSelectionBackground(new java.awt.Color(1, 198, 83));
        tableEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableEmpleadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableEmpleados);

        panelEmpleados.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        home.add(panelEmpleados, "card3");

        panelTiendas.setBackground(new java.awt.Color(255, 255, 255));
        panelTiendas.setPreferredSize(new java.awt.Dimension(910, 523));
        panelTiendas.setLayout(new java.awt.BorderLayout());

        lblNumeroTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNumeroTienda.setText("Número:");

        lblUbicacionTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUbicacionTienda.setText("Ubicación:");

        lblTipoTIenda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTipoTIenda.setText("Tipo:");

        txtNumeroTienda.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNumeroTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTiendaActionPerformed(evt);
            }
        });

        txtUbicacionTienda.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtTipoTienda.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnRegistrarTienda.setBackground(new java.awt.Color(0, 150, 62));
        btnRegistrarTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarTienda.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarTienda.setText("REGISTRAR");
        btnRegistrarTienda.setBorderPainted(false);
        btnRegistrarTienda.setFocusable(false);
        btnRegistrarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarTiendaActionPerformed(evt);
            }
        });

        btnActualizarTienda.setBackground(new java.awt.Color(0, 150, 62));
        btnActualizarTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizarTienda.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTienda.setText("ACTUALIZAR");
        btnActualizarTienda.setBorderPainted(false);
        btnActualizarTienda.setFocusable(false);
        btnActualizarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTiendaActionPerformed(evt);
            }
        });

        btnConsultarTienda.setBackground(new java.awt.Color(0, 150, 62));
        btnConsultarTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultarTienda.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarTienda.setText("CONSULTAR");
        btnConsultarTienda.setBorderPainted(false);
        btnConsultarTienda.setFocusable(false);
        btnConsultarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarTiendaActionPerformed(evt);
            }
        });

        btnEliminarTienda.setBackground(new java.awt.Color(222, 93, 83));
        btnEliminarTienda.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarTienda.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarTienda.setText("ELIMINAR");
        btnEliminarTienda.setBorderPainted(false);
        btnEliminarTienda.setFocusable(false);
        btnEliminarTienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTiendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatos1Layout = new javax.swing.GroupLayout(panelDatos1);
        panelDatos1.setLayout(panelDatos1Layout);
        panelDatos1Layout.setHorizontalGroup(
            panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos1Layout.createSequentialGroup()
                        .addComponent(lblUbicacionTienda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUbicacionTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatos1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNumeroTienda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNumeroTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(lblTipoTIenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTipoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarTienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTienda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        panelDatos1Layout.setVerticalGroup(
            panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumeroTienda)
                        .addComponent(lblTipoTIenda)
                        .addComponent(txtNumeroTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTipoTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarTienda))
                    .addComponent(btnConsultarTienda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUbicacionTienda)
                    .addComponent(txtUbicacionTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarTienda)
                    .addComponent(btnEliminarTienda))
                .addGap(39, 39, 39))
        );

        panelTiendas.add(panelDatos1, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(null);

        tableTiendas.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableTiendas.setForeground(new java.awt.Color(51, 51, 51));
        tableTiendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"00", "Oficinas", "Av. Uslar Valencia"},
                {"02", "Express", "Av. Michelena Valencia"},
                {"03", "Mediana", "CC. La Granja Naguanagua"},
                {"15", "Grande", "San Diego Valencia"}
            },
            new String [] {
                "Número", "Tipo", "Ubicación"
            }
        ));
        tableTiendas.setGridColor(new java.awt.Color(255, 255, 255));
        tableTiendas.setRowHeight(20);
        tableTiendas.setSelectionBackground(new java.awt.Color(1, 198, 83));
        jScrollPane2.setViewportView(tableTiendas);

        panelTiendas.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        home.add(panelTiendas, "card3");

        panelProveedores.setBackground(new java.awt.Color(255, 255, 255));
        panelProveedores.setPreferredSize(new java.awt.Dimension(910, 300));
        panelProveedores.setLayout(new java.awt.BorderLayout());

        lblNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreProveedor.setText("Nombre:");

        lblUbicacionProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUbicacionProveedor.setText("Ubicación:");

        lblCodigoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoProveedor.setText("Código:");

        txtNombreProveedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNombreProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProveedorActionPerformed(evt);
            }
        });

        txtUbicacionProveedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCodigoProveedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnRegistrarProveedores.setBackground(new java.awt.Color(0, 150, 62));
        btnRegistrarProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProveedores.setText("REGISTRAR");
        btnRegistrarProveedores.setBorderPainted(false);
        btnRegistrarProveedores.setFocusable(false);
        btnRegistrarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProveedoresActionPerformed(evt);
            }
        });

        btnActualizarProveedores.setBackground(new java.awt.Color(0, 150, 62));
        btnActualizarProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizarProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProveedores.setText("ACTUALIZAR");
        btnActualizarProveedores.setBorderPainted(false);
        btnActualizarProveedores.setFocusable(false);
        btnActualizarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProveedoresActionPerformed(evt);
            }
        });

        btnConsultarProveedores.setBackground(new java.awt.Color(0, 150, 62));
        btnConsultarProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultarProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarProveedores.setText("CONSULTAR");
        btnConsultarProveedores.setBorderPainted(false);
        btnConsultarProveedores.setFocusable(false);
        btnConsultarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProveedoresActionPerformed(evt);
            }
        });

        btnEliminarProveedores.setBackground(new java.awt.Color(222, 93, 83));
        btnEliminarProveedores.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProveedores.setText("ELIMINAR");
        btnEliminarProveedores.setBorderPainted(false);
        btnEliminarProveedores.setFocusable(false);
        btnEliminarProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProveedoresActionPerformed(evt);
            }
        });

        txtMercanciaProveedor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblMercanciaProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMercanciaProveedor.setText("Mercancía:");

        javax.swing.GroupLayout panelDatos2Layout = new javax.swing.GroupLayout(panelDatos2);
        panelDatos2.setLayout(panelDatos2Layout);
        panelDatos2Layout.setHorizontalGroup(
            panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos2Layout.createSequentialGroup()
                        .addComponent(lblUbicacionProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUbicacionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatos2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblNombreProveedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigoProveedor)
                    .addComponent(lblMercanciaProveedor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMercanciaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        panelDatos2Layout.setVerticalGroup(
            panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreProveedor)
                        .addComponent(lblCodigoProveedor)
                        .addComponent(txtNombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCodigoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarProveedores))
                    .addComponent(btnConsultarProveedores))
                .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUbicacionProveedor)
                            .addComponent(txtUbicacionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarProveedores)
                            .addComponent(btnEliminarProveedores))
                        .addGap(39, 39, 39))
                    .addGroup(panelDatos2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMercanciaProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMercanciaProveedor))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelProveedores.add(panelDatos2, java.awt.BorderLayout.PAGE_START);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(null);

        tableProveedores.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableProveedores.setForeground(new java.awt.Color(51, 51, 51));
        tableProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Tubrica", "T01V15", "Caracas", "Plomería"},
                {"GoLight", "GL01X7", "Valencia", "Electricidad e Iluminación"},
                {"Flamenko", "FL01X8", "Maracaibo", "Pinturas y Decoración"},
                {"AeroCloset", "AE01V8", "Maracay", "Mueblería"}
            },
            new String [] {
                "Nombre", "Código", "Ubicación", "Mercancía"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProveedores.setGridColor(new java.awt.Color(255, 255, 255));
        tableProveedores.setRowHeight(20);
        tableProveedores.setSelectionBackground(new java.awt.Color(1, 198, 83));
        jScrollPane3.setViewportView(tableProveedores);

        panelProveedores.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        home.add(panelProveedores, "card3");

        panelProductos.setBackground(new java.awt.Color(255, 255, 255));
        panelProductos.setPreferredSize(new java.awt.Dimension(910, 300));
        panelProductos.setLayout(new java.awt.BorderLayout());

        lblNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombreProducto.setText("Nombre:");

        lblDisponibleProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDisponibleProducto.setText("Disponible:");

        lblCodigoInternoProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoInternoProducto.setText("Código Interno:");

        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });

        txtDisponibleProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        txtCodigoInternoProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        btnRegistrarProducto.setBackground(new java.awt.Color(0, 150, 62));
        btnRegistrarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRegistrarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarProducto.setText("REGISTRAR");
        btnRegistrarProducto.setBorderPainted(false);
        btnRegistrarProducto.setFocusable(false);
        btnRegistrarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarProductoActionPerformed(evt);
            }
        });

        btnActualizarProducto.setBackground(new java.awt.Color(0, 150, 62));
        btnActualizarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnActualizarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarProducto.setText("ACTUALIZAR");
        btnActualizarProducto.setBorderPainted(false);
        btnActualizarProducto.setFocusable(false);
        btnActualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProductoActionPerformed(evt);
            }
        });

        btnConsultarProducto.setBackground(new java.awt.Color(0, 150, 62));
        btnConsultarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConsultarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultarProducto.setText("CONSULTAR");
        btnConsultarProducto.setBorderPainted(false);
        btnConsultarProducto.setFocusable(false);
        btnConsultarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(222, 93, 83));
        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("ELIMINAR");
        btnEliminarProducto.setBorderPainted(false);
        btnEliminarProducto.setFocusable(false);
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        txtCodigoExternoProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        lblCodigoExternoProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCodigoExternoProducto.setText("Código Externo:");

        javax.swing.GroupLayout panelDatos3Layout = new javax.swing.GroupLayout(panelDatos3);
        panelDatos3.setLayout(panelDatos3Layout);
        panelDatos3Layout.setHorizontalGroup(
            panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDisponibleProducto)
                    .addComponent(lblNombreProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDisponibleProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCodigoExternoProducto)
                    .addComponent(lblCodigoInternoProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoExternoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoInternoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnConsultarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        panelDatos3Layout.setVerticalGroup(
            panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatos3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombreProducto)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarProducto))
                    .addComponent(btnConsultarProducto)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodigoInternoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCodigoInternoProducto)))
                .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatos3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDisponibleProducto)
                            .addComponent(txtDisponibleProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarProducto)
                            .addComponent(btnEliminarProducto))
                        .addGap(39, 39, 39))
                    .addGroup(panelDatos3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelDatos3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCodigoExternoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCodigoExternoProducto))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        panelProductos.add(panelDatos3, java.awt.BorderLayout.PAGE_START);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(null);

        tableProductos.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tableProductos.setForeground(new java.awt.Color(51, 51, 51));
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Bombillo Fluorescente 15W", "2215787", "BF1234", "30"},
                {"Codo 1/4\"", "1824596", "CT1234", "150"},
                {"Pintura Clase C", "Flamuko", "1423587", "FL1234"},
                {"Pintura Clase A", "Venezolana de Pinturas", "VP1234", "268"}
            },
            new String [] {
                "Nombre", "Código Interno", "Código Externo", "Disponible"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tableProductos.setRowHeight(20);
        tableProductos.setSelectionBackground(new java.awt.Color(1, 198, 83));
        jScrollPane4.setViewportView(tableProductos);

        panelProductos.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        home.add(panelProductos, "card3");

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(main, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 536));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        // Si el click es presionado guardo posicion inicial en X e Y
        xx = evt.getX(); //Posicion del X respecto de la ventana
        xy = evt.getY(); //Posicion del Y respecto de la ventana
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        // Si el mouse es presionado y deslizado, muevo la ventana
        int x = evt.getXOnScreen();//Posicion del X respecto de la pantalla
        int y = evt.getYOnScreen();//Posicion del Y respecto de la ventana
        this.setLocation(x - xx, y - xy);//Muevo el Frame diferenciado las posiciones
    }//GEN-LAST:event_headerMouseDragged

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // Cerrar la aplicacion
        System.exit(0);
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpleadosMouseClicked
        // intercambio colores de botones
        setLblColor(btnEmpleados);
        resetLblColor(btnTiendas);
        resetLblColor(btnProductos);
        resetLblColor(btnProveedores);
        //cambio al panel correspondiente
        panelEmpleados.setVisible(true);
        panelTiendas.setVisible(false);
        panelProveedores.setVisible(false);
        panelProductos.setVisible(false);

    }//GEN-LAST:event_btnEmpleadosMouseClicked

    private void btnTiendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTiendasMouseClicked
        // intercambio colores de botones
        setLblColor(btnTiendas);
        resetLblColor(btnEmpleados);
        resetLblColor(btnProductos);
        resetLblColor(btnProveedores);
        //cambio al panel correspondiente
        panelTiendas.setVisible(true);
        panelEmpleados.setVisible(false);
        panelProveedores.setVisible(false);
        panelProductos.setVisible(false);
    }//GEN-LAST:event_btnTiendasMouseClicked

    private void btnProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseClicked
        //Intercambio colores de botones
        setLblColor(btnProveedores);
        resetLblColor(btnEmpleados);
        resetLblColor(btnProductos);
        resetLblColor(btnTiendas);
        //cambio al panel correspondiente
        panelProveedores.setVisible(true);
        panelEmpleados.setVisible(false);
        panelTiendas.setVisible(false);
        panelProductos.setVisible(false);
    }//GEN-LAST:event_btnProveedoresMouseClicked

    private void btnProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseClicked
        //intercambio de colores
        setLblColor(btnProductos);
        resetLblColor(btnEmpleados);
        resetLblColor(btnTiendas);
        resetLblColor(btnProveedores);
        //cambio al panel correspondiente
        panelProductos.setVisible(true);
        panelEmpleados.setVisible(false);
        panelTiendas.setVisible(false);
        panelProveedores.setVisible(false);
    }//GEN-LAST:event_btnProductosMouseClicked

    private void lblPagMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagMouseClicked
    }//GEN-LAST:event_lblPagMouseClicked

    private void lblBordeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBordeMouseClicked
    }//GEN-LAST:event_lblBordeMouseClicked

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(ICONIFIED);//Metodo para minimizar la ventana
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnRegistrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmpleadoActionPerformed
        //Captura de datos de los TextField
        EmpleadoVo miEmpleado = new EmpleadoVo();//Objeto de tipo Valores del empleado
        EmpleadoDao miEmpleadoBD = new EmpleadoDao();//Acceso a para registrar el empleado en la BD
        DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
        Object[] datosFila = new Object[4];

        /*Comprueba que los datos ingresados no esten vacios*/
        if (!txtNombreEmpleado.getText().trim().equals("") && !txtApellidoEmpleado.getText().trim().equals("")
                && !txtEdadEmpleado.getText().trim().equals("") && !txtCedulaEmpleado.getText().trim().equals("")) {
            /*Asigno Valores al Objeto*/
            miEmpleado.setNombre(txtNombreEmpleado.getText());
            datosFila[0] = txtNombreEmpleado.getText();
            miEmpleado.setApellido(txtApellidoEmpleado.getText());
            datosFila[1] = txtApellidoEmpleado.getText();
            miEmpleado.setEdad(Integer.parseInt(txtEdadEmpleado.getText()));
            datosFila[2] = txtEdadEmpleado.getText();
            miEmpleado.setCedula(Integer.parseInt(txtCedulaEmpleado.getText()));
            datosFila[3] = txtCedulaEmpleado.getText();

            //Resetea los campos
            txtNombreEmpleado.setText("");
            txtApellidoEmpleado.setText("");
            txtCedulaEmpleado.setText("");
            txtEdadEmpleado.setText("");

            if (miEmpleadoBD.registrarEmpleado(miEmpleado).equals("ok")) {//Se registra el empleado en la Base de Datos
                //Si se registra correctamente
                mostrarLabelInfo("Empleado Registrado Exitosamente", new Color(0, 150, 62));
                model.addRow(datosFila);
                tableEmpleados.setModel(model);
            } else {//Si ocurre una excepcion
                mostrarLabelInfo("No se pudo registrar el empleado, revise la conexión", new Color(230, 170, 35));
            }
        } else {//Avisa que los datos ingresados son invalidos
            mostrarLabelInfo("Ingrese Campos Válidos", new Color(222, 93, 83));
        }
    }//GEN-LAST:event_btnRegistrarEmpleadoActionPerformed

    private void btnActualizarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEmpleadoActionPerformed
        //Captura de datos de los TextField
        EmpleadoVo miEmpleado = new EmpleadoVo();//Objeto de tipo Valores del empleado
        EmpleadoDao miEmpleadoBD = new EmpleadoDao();//Acceso a para registrar el empleado en la BD
        DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
        String[] datosFila = new String[4];

        int a = tableEmpleados.getSelectedRow();//Obteniene la fila seleccionada
        if (a < 0) {//Si no se ha seleccionado una fila
            mostrarLabelInfo("Debe seleccionar una fila de la tabla", new Color(230, 170, 35));
        } else {//Si se tiene una fila seleccionada
            /*Comprueba que los datos ingresados no esten vacios*/
            if (!txtNombreEmpleado.getText().trim().equals("") && !txtApellidoEmpleado.getText().trim().equals("")
                    && !txtEdadEmpleado.getText().trim().equals("") && !txtCedulaEmpleado.getText().trim().equals("")) {
                /*Asigno Valores al Objeto*/
                miEmpleado.setId(a + 1);
                miEmpleado.setNombre(txtNombreEmpleado.getText());
                datosFila[0] = txtNombreEmpleado.getText();
                miEmpleado.setApellido(txtApellidoEmpleado.getText());
                datosFila[1] = txtApellidoEmpleado.getText();
                miEmpleado.setEdad(Integer.parseInt(txtEdadEmpleado.getText()));
                datosFila[2] = txtEdadEmpleado.getText();
                miEmpleado.setCedula(Integer.parseInt(txtCedulaEmpleado.getText()));
                datosFila[3] = txtCedulaEmpleado.getText();

                //Resetea los campos
                txtNombreEmpleado.setText("");
                txtApellidoEmpleado.setText("");
                txtCedulaEmpleado.setText("");
                txtEdadEmpleado.setText("");

                if (miEmpleadoBD.actualizarEmpleado(miEmpleado).equals("ok")) {//Se registra el empleado en la Base de Datos
                    //Si se registra correctamente
                    mostrarLabelInfo("Empleado Actualizado exitosamente", new Color(0, 150, 62));
                    //model.addRow(datosFila);
                    for (int i = 0; i < datosFila.length; i++) {
                        //Actualiza los datos del registro seleccionado
                        model.setValueAt(datosFila[i], a, i);
                    }
                    tableEmpleados.setModel(model);
                } else {//Si ocurre una excepcion
                    mostrarLabelInfo("No se pudo actualizar el registro, revise la conexión", new Color(230, 170, 35));
                }
            } else {//Avisa que los datos ingresados son invalidos
                mostrarLabelInfo("Ingrese Campos Válidos", new Color(222, 93, 83));
            }
        }
    }//GEN-LAST:event_btnActualizarEmpleadoActionPerformed

    private void btnConsultarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarEmpleadoActionPerformed
        //Obtiene el modelo del JTable para posteriormente modificarlo
        DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
        EmpleadoVo miEmpleado = new EmpleadoVo();
        EmpleadoDao miEmpleadoDao = new EmpleadoDao();
        //int a = tableEmpleados.getSelectedRow();
        //Coloca informacion del empleado seleccionado en los textField
        String doc = txtCedulaEmpleado.getText().trim();
        if (!doc.equals("")) {//Entra solo si se ingreso una cedula
            if (miEmpleadoDao.consultarEmpleado(doc) != null) {//Si la consulta corre sin problemas entra
                miEmpleado = miEmpleadoDao.consultarEmpleado(doc);//Asigno el objeto devuelto al objeto creado
                /*Asigno valores del objeto a los textfields*/
                txtNombreEmpleado.setText(miEmpleado.getNombre());
                txtApellidoEmpleado.setText(miEmpleado.getApellido());
                txtEdadEmpleado.setText(miEmpleado.getEdad() + "");
                txtCedulaEmpleado.setText(miEmpleado.getCedula() + "");
            } else {
                mostrarLabelInfo("No se pudo consultar el empleado, revise la conexión", new Color(222, 93, 83));
            }
        } else {
            mostrarLabelInfo("Ingrese cédula para consultar", new Color(222, 93, 83));
        }
    }//GEN-LAST:event_btnConsultarEmpleadoActionPerformed

    private void btnEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEmpleadoActionPerformed
        //Obtiene el modelo del JTable para posteriormente modificarlo
        DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
        int a = tableEmpleados.getSelectedRow();//Obteniene la fila seleccionada
        if (a < 0) {//Si no se ha seleccionado una fila
            mostrarLabelInfo("Debe seleccionar una fila de la tabla", new Color(230, 170, 35));
        } else {//Si se tiene una fila seleccionada
            int confirmar = JOptionPane.showConfirmDialog(null,
                    "Esta seguro que desea Eliminar el registro? ", null, JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (JOptionPane.YES_OPTION == confirmar) {//Accede a eliminar
                EmpleadoDao empleado = new EmpleadoDao();
                if (empleado.eliminarEmpleado(a + 1).equals("ok")) {//Se elimina de la base de Datos
                    model.removeRow(a);//Se elimina de la lista JTable
                    mostrarLabelInfo("Empleado eliminado exitosamente", new Color(0, 150, 62));
                } else {//Si ocurre una excepcion
                    mostrarLabelInfo("No se pudo eliminar el empleado, revise la conexión", new Color(222, 93, 83));
                }
            }
        }
    }//GEN-LAST:event_btnEliminarEmpleadoActionPerformed

    private void txtNumeroTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTiendaActionPerformed

    private void btnRegistrarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarTiendaActionPerformed

    private void btnActualizarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarTiendaActionPerformed

    private void btnConsultarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarTiendaActionPerformed

    private void btnEliminarTiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTiendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarTiendaActionPerformed

    private void txtNombreProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProveedorActionPerformed

    private void btnRegistrarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarProveedoresActionPerformed

    private void btnActualizarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarProveedoresActionPerformed

    private void btnConsultarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultarProveedoresActionPerformed

    private void btnEliminarProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProveedoresActionPerformed

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void btnRegistrarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarProductoActionPerformed

    private void btnActualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarProductoActionPerformed

    private void btnConsultarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarProductoActionPerformed

    }//GEN-LAST:event_btnConsultarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void tableEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableEmpleadosMouseClicked
        //Si se da click a algun elemento de la fila
        DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
        int a = tableEmpleados.getSelectedRow();
        //Coloca informacion del empleado seleccionado en los textField
        txtNombreEmpleado.setText((String) model.getValueAt(a, 0));
        txtApellidoEmpleado.setText((String) model.getValueAt(a, 1));
        txtEdadEmpleado.setText((String) model.getValueAt(a, 2));
        txtCedulaEmpleado.setText((String) model.getValueAt(a, 3));

    }//GEN-LAST:event_tableEmpleadosMouseClicked
    // ------------cambia el color del boton que es presionado/Color activo
    public void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(0, 150, 62));
    }

    // ------------cambia el color del boton que es presionado/Color inactivo
    public void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(1, 198, 83));
    }

    //----------Obtener matriz de datos de los empleados de la BD
    public String[][] obtenerMatrizEmpleados() {
        String matrizInfo[][] = null;
        try {
            EmpleadoDao empleadoDao = new EmpleadoDao();
            ArrayList<EmpleadoVo> miLista = empleadoDao.buscarUsuariosConMatriz();
            matrizInfo = new String[miLista.size()][5];

            for (int i = 0; i < miLista.size(); i++) {
                matrizInfo[i][0] = miLista.get(i).getNombre() + "";
                matrizInfo[i][1] = miLista.get(i).getApellido() + "";
                matrizInfo[i][2] = miLista.get(i).getEdad() + "";
                matrizInfo[i][3] = miLista.get(i).getCedula() + "";
            }
        } catch (Exception e) {//Si ocurre una excepcion
           // JOptionPane.showMessageDialog(null, "Active la Base de Datos", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
        return matrizInfo;

    }

    public void mostrarLabelInfo(String msg, Color color) {
        lblInfo.setText(msg);
        lblInfo.setForeground(color);
        Thread hiloLabel = new Thread(new Runnable() { //Hilo aviso de valores invalidos
            @Override
            public void run() {
                lblInfo.setVisible(true);
                try {
                    Thread.sleep(3000);//Espera 2 seg para quitar el anuncio
                    lblInfo.setVisible(false);//Desactiva el Label de aviso que sale en caso de tener campos invalidos
                } catch (Exception e) {
                }
            }
        });
        hiloLabel.start();
    }

    //----------Iniciar matriz de datos de los empleados de la BD apertura del programa
    public void iniciarDatosIniciales() {
        //Inicio los labels de informacion ocultos por defecto
        lblInfo.setVisible(false);
        //Carga de datos empleados a la tabla desde BD
        try {
            String datosMatriz[][] = obtenerMatrizEmpleados();
            DefaultTableModel model = (DefaultTableModel) tableEmpleados.getModel();
            for (String[] datosMatriz1 : datosMatriz) {
                model.addRow(datosMatriz1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Active la Base de Datos", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }

    //-----------Fin --------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarEmpleado;
    private javax.swing.JButton btnActualizarProducto;
    private javax.swing.JButton btnActualizarProveedores;
    private javax.swing.JButton btnActualizarTienda;
    private javax.swing.JButton btnConsultarEmpleado;
    private javax.swing.JButton btnConsultarProducto;
    private javax.swing.JButton btnConsultarProveedores;
    private javax.swing.JButton btnConsultarTienda;
    private javax.swing.JButton btnEliminarEmpleado;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnEliminarProveedores;
    private javax.swing.JButton btnEliminarTienda;
    private javax.swing.JLabel btnEmpleados;
    private javax.swing.JButton btnGithub;
    private javax.swing.JButton btnInstagram;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel btnProductos;
    private javax.swing.JLabel btnProveedores;
    private javax.swing.JButton btnRegistrarEmpleado;
    private javax.swing.JButton btnRegistrarProducto;
    private javax.swing.JButton btnRegistrarProveedores;
    private javax.swing.JButton btnRegistrarTienda;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JLabel btnTiendas;
    private javax.swing.JButton btnTwitter;
    private javax.swing.JButton btnYoutube;
    private javax.swing.JPanel header;
    private javax.swing.JPanel home;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblApellidoEmpleado;
    private javax.swing.JLabel lblBorde;
    private javax.swing.JLabel lblCedulaEmpleado;
    private javax.swing.JLabel lblCodigoExternoProducto;
    private javax.swing.JLabel lblCodigoInternoProducto;
    private javax.swing.JLabel lblCodigoProveedor;
    private javax.swing.JLabel lblDisponibleProducto;
    private javax.swing.JLabel lblEdadEmpleado;
    private javax.swing.JLabel lblEspacio;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMercanciaProveedor;
    private javax.swing.JLabel lblNombreEmpleado;
    private javax.swing.JLabel lblNombreProducto;
    private javax.swing.JLabel lblNombreProveedor;
    private javax.swing.JLabel lblNumeroTienda;
    private javax.swing.JLabel lblPag;
    private javax.swing.JLabel lblSubtitulo;
    private javax.swing.JLabel lblTipoTIenda;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacionProveedor;
    private javax.swing.JLabel lblUbicacionTienda;
    private javax.swing.JPanel main;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelDatos1;
    private javax.swing.JPanel panelDatos2;
    private javax.swing.JPanel panelDatos3;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelProductos;
    private javax.swing.JPanel panelProveedores;
    private javax.swing.JPanel panelTiendas;
    private javax.swing.JTable tableEmpleados;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTable tableProveedores;
    private javax.swing.JTable tableTiendas;
    private javax.swing.JTextField txtApellidoEmpleado;
    private javax.swing.JTextField txtCedulaEmpleado;
    private javax.swing.JTextField txtCodigoExternoProducto;
    private javax.swing.JTextField txtCodigoInternoProducto;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextField txtDisponibleProducto;
    private javax.swing.JTextField txtEdadEmpleado;
    private javax.swing.JTextField txtMercanciaProveedor;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtNombreProveedor;
    private javax.swing.JTextField txtNumeroTienda;
    private javax.swing.JTextField txtTipoTienda;
    private javax.swing.JTextField txtUbicacionProveedor;
    private javax.swing.JTextField txtUbicacionTienda;
    // End of variables declaration//GEN-END:variables
}

package com.ar.cp.taller.view;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import com.ar.cp.taller.model.service.*;
import com.ar.cp.taller.model.entity.*;
import java.util.List;
import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

public class Home extends javax.swing.JPanel {

    public Home() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        correctDialog = new javax.swing.JDialog();
        welcomeLbl = new javax.swing.JLabel();
        marcasBtn = new javax.swing.JButton();
        modelosBtn = new javax.swing.JButton();
        vehiculosBtn = new javax.swing.JButton();
        mantenimientoBtn = new javax.swing.JButton();
        salirBtn1 = new javax.swing.JButton();
        marcasDialog = new javax.swing.JDialog();
        nombreMarcaLbl = new javax.swing.JLabel();
        nombreMarcaText = new javax.swing.JTextField();
        nuevaMarcaBtn = new javax.swing.JButton();
        guardarMarcaBtn = new javax.swing.JButton();
        eliminarMarcaBtn = new javax.swing.JButton();
        backBtn1 = new javax.swing.JButton();
        marcasLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        marcasTable = new javax.swing.JTable();
        idMarcaText = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        marcaExisteLbl = new javax.swing.JLabel();
        modelosDialog = new javax.swing.JDialog();
        marcaNameLbl = new javax.swing.JLabel();
        anioLbl = new javax.swing.JLabel();
        combustibleLbl = new javax.swing.JLabel();
        modelLbl = new javax.swing.JLabel();
        backBtn2 = new javax.swing.JButton();
        modelosLbl = new javax.swing.JLabel();
        anioModeloText = new javax.swing.JTextField();
        descripcionModeloText = new javax.swing.JTextField();
        nuevoModeloBtn = new javax.swing.JButton();
        guardarModeloBtn = new javax.swing.JButton();
        eliminarModeloBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        modelosTable = new javax.swing.JTable();
        marcaModeloCBox = new javax.swing.JComboBox<>();
        combustibleModeloCBox = new javax.swing.JComboBox<>();
        idModeloText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        vehiculosDialog = new javax.swing.JDialog();
        backBtn3 = new javax.swing.JButton();
        patenteLbl = new javax.swing.JLabel();
        duenioLbl = new javax.swing.JLabel();
        chasisLbl = new javax.swing.JLabel();
        modeloLbl = new javax.swing.JLabel();
        patenteText = new javax.swing.JTextField();
        duenioText = new javax.swing.JTextField();
        chasisText = new javax.swing.JTextField();
        vehiculosLbl = new javax.swing.JLabel();
        nuevoVehiculoBtn = new javax.swing.JButton();
        guardarVehiculoBtn = new javax.swing.JButton();
        eliminarVehiculoBtn = new javax.swing.JButton();
        modeloCBox = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        vehiculosTable = new javax.swing.JTable();
        motorLbl = new javax.swing.JLabel();
        motorText = new javax.swing.JTextField();
        mantenimientoDialog = new javax.swing.JDialog();
        backBtn4 = new javax.swing.JButton();
        patentesLbl = new javax.swing.JLabel();
        fechaLbl = new javax.swing.JLabel();
        mantenimientosLbl = new javax.swing.JLabel();
        idMantenimientoText = new javax.swing.JTextField();
        fechaText = new javax.swing.JTextField();
        mantenimientoText = new javax.swing.JTextField();
        mantenimientoLbl = new javax.swing.JLabel();
        nuevoMantenimientoBtn = new javax.swing.JButton();
        guardarMantenimientoBtn = new javax.swing.JButton();
        eliminarMantenimientoBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        mantenimientosTable = new javax.swing.JTable();
        modelosCBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        userNameLbl = new javax.swing.JLabel();
        userNameText = new javax.swing.JTextField();
        passWordLbl = new javax.swing.JLabel();
        passWordText = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        cancelarBtn = new javax.swing.JButton();
        accessError = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        correctDialog.setTitle("Home");

        welcomeLbl.setBackground(new java.awt.Color(240, 242, 240));
        welcomeLbl.setText("Bienvenido " /*+ userService.getNombreApellido(this.userNameText.getText())*/);

        marcasBtn.setText("Marcas");
        marcasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcasBtnActionPerformed(evt);
            }
        });

        modelosBtn.setText("Modelos");
        modelosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelosBtnActionPerformed(evt);
            }
        });

        vehiculosBtn.setText("Vehículos");
        vehiculosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculosBtnActionPerformed(evt);
            }
        });

        mantenimientoBtn.setText("Mantenimiento");
        mantenimientoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoBtnActionPerformed(evt);
            }
        });

        salirBtn1.setText("Salir");
        salirBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout correctDialogLayout = new javax.swing.GroupLayout(correctDialog.getContentPane());
        correctDialog.getContentPane().setLayout(correctDialogLayout);
        correctDialogLayout.setHorizontalGroup(
            correctDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correctDialogLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(correctDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(correctDialogLayout.createSequentialGroup()
                        .addComponent(vehiculosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addGap(115, 115, 115)
                        .addComponent(mantenimientoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                    .addGroup(correctDialogLayout.createSequentialGroup()
                        .addComponent(marcasBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(115, 115, 115)
                        .addComponent(modelosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correctDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salirBtn1)
                        .addGap(20, 20, 20)))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, correctDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        correctDialogLayout.setVerticalGroup(
            correctDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(correctDialogLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(welcomeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(correctDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modelosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(correctDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mantenimientoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehiculosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(salirBtn1)
                .addGap(58, 58, 58))
        );

        marcasDialog.setTitle("Marcas");

        nombreMarcaLbl.setText("Nombre de la Marca:");

        nuevaMarcaBtn.setText("Nuevo");
        nuevaMarcaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaMarcaBtnActionPerformed(evt);
            }
        });

        guardarMarcaBtn.setText("Guardar");
        guardarMarcaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarMarcaBtnActionPerformed(evt);
            }
        });

        eliminarMarcaBtn.setText("Eliminar");
        eliminarMarcaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarMarcaBtnActionPerformed(evt);
            }
        });

        backBtn1.setText("Atras");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        marcasLbl.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        marcasLbl.setText("Marcas");

        marcasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificador", "Nombre"
            }
        ));
        jScrollPane1.setViewportView(marcasTable);

        idMarcaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idMarcaTextActionPerformed(evt);
            }
        });

        jLabel1.setText("Identificador de la Marca:");

        marcaExisteLbl.setForeground(new java.awt.Color(236, 16, 19));
        marcaExisteLbl.setText("Marca ya existente");
        marcaExisteLbl.setEnabled(false);

        javax.swing.GroupLayout marcasDialogLayout = new javax.swing.GroupLayout(marcasDialog.getContentPane());
        marcasDialog.getContentPane().setLayout(marcasDialogLayout);
        marcasDialogLayout.setHorizontalGroup(
            marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marcasDialogLayout.createSequentialGroup()
                .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, marcasDialogLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn1))
                    .addGroup(marcasDialogLayout.createSequentialGroup()
                        .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(marcasDialogLayout.createSequentialGroup()
                                .addGap(212, 212, 212)
                                .addComponent(marcasLbl))
                            .addGroup(marcasDialogLayout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(marcasDialogLayout.createSequentialGroup()
                                        .addComponent(nuevaMarcaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(guardarMarcaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(eliminarMarcaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(marcasDialogLayout.createSequentialGroup()
                                        .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(nombreMarcaLbl)
                                            .addComponent(jLabel1))
                                        .addGap(27, 27, 27)
                                        .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(idMarcaText)
                                            .addComponent(nombreMarcaText, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)))))
                            .addGroup(marcasDialogLayout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(marcasDialogLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(marcaExisteLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        marcasDialogLayout.setVerticalGroup(
            marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(marcasDialogLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(marcasLbl)
                .addGap(18, 18, 18)
                .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombreMarcaText)
                    .addComponent(nombreMarcaLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idMarcaText, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevaMarcaBtn)
                    .addGroup(marcasDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(marcasDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(guardarMarcaBtn)
                            .addComponent(eliminarMarcaBtn))))
                .addGap(28, 28, 28)
                .addComponent(marcaExisteLbl)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(backBtn1)
                .addContainerGap())
        );

        modelosDialog.setTitle("Modelos");

        marcaNameLbl.setText("Nombre de la Marca:");

        anioLbl.setText("Año:");

        combustibleLbl.setText("Combustible:");

        modelLbl.setText("Modelo:");

        backBtn2.setText("Atras");
        backBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn2ActionPerformed(evt);
            }
        });

        modelosLbl.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        modelosLbl.setText("Modelos");

        anioModeloText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioModeloTextActionPerformed(evt);
            }
        });

        nuevoModeloBtn.setText("Nuevo");
        nuevoModeloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoModeloBtnActionPerformed(evt);
            }
        });

        guardarModeloBtn.setText("Guardar");
        guardarModeloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarModeloBtnActionPerformed(evt);
            }
        });

        eliminarModeloBtn.setText("Eliminar");
        eliminarModeloBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarModeloBtnActionPerformed(evt);
            }
        });

        modelosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descripción", "Año", "Marca", "Combustible"
            }
        ));
        jScrollPane2.setViewportView(modelosTable);

        marcaModeloCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaModeloCBoxActionPerformed(evt);
            }
        });

        combustibleModeloCBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nafta", "GNC", "Diesel" }));
        combustibleModeloCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combustibleModeloCBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Id de Modelo:");

        javax.swing.GroupLayout modelosDialogLayout = new javax.swing.GroupLayout(modelosDialog.getContentPane());
        modelosDialog.getContentPane().setLayout(modelosDialogLayout);
        modelosDialogLayout.setHorizontalGroup(
            modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, modelosDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modelosDialogLayout.createSequentialGroup()
                        .addGap(0, 464, Short.MAX_VALUE)
                        .addComponent(backBtn2)))
                .addGap(76, 76, 76))
            .addGroup(modelosDialogLayout.createSequentialGroup()
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modelosDialogLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(modelosLbl))
                    .addGroup(modelosDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nuevoModeloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guardarModeloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(eliminarModeloBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(modelosDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anioLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(modelLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(marcaNameLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(combustibleLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(48, 48, 48)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(idModeloText)
                        .addComponent(anioModeloText)
                        .addComponent(descripcionModeloText)
                        .addComponent(marcaModeloCBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(combustibleModeloCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146))
        );
        modelosDialogLayout.setVerticalGroup(
            modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(modelosDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(modelosLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descripcionModeloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anioModeloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marcaModeloCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marcaNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combustibleModeloCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combustibleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idModeloText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(modelosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarModeloBtn)
                    .addComponent(guardarModeloBtn)
                    .addComponent(nuevoModeloBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backBtn2))
        );

        vehiculosDialog.setTitle("Vehículos");

        backBtn3.setText("Atras");
        backBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn3ActionPerformed(evt);
            }
        });

        patenteLbl.setText("Patente:");

        duenioLbl.setText("Nombre del dueño:");

        chasisLbl.setText("Número de chasis:");

        modeloLbl.setText("Modelo:");

        vehiculosLbl.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        vehiculosLbl.setText("Vehículos");

        nuevoVehiculoBtn.setText("Nuevo");
        nuevoVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoVehiculoBtnActionPerformed(evt);
            }
        });

        guardarVehiculoBtn.setText("Guardar");
        guardarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarVehiculoBtnActionPerformed(evt);
            }
        });

        eliminarVehiculoBtn.setText("Eliminar");
        eliminarVehiculoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVehiculoBtnActionPerformed(evt);
            }
        });

        modeloCBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloCBoxActionPerformed(evt);
            }
        });

        vehiculosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patente", "Dueño", "Modelo", "Num. chasis", "Num. motor"
            }
        ));
        jScrollPane3.setViewportView(vehiculosTable);

        motorLbl.setText("Número de motor:");

        javax.swing.GroupLayout vehiculosDialogLayout = new javax.swing.GroupLayout(vehiculosDialog.getContentPane());
        vehiculosDialog.getContentPane().setLayout(vehiculosDialogLayout);
        vehiculosDialogLayout.setHorizontalGroup(
            vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiculosDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn3)
                .addGap(24, 24, 24))
            .addGroup(vehiculosDialogLayout.createSequentialGroup()
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(vehiculosDialogLayout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addComponent(vehiculosLbl))
                    .addGroup(vehiculosDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(vehiculosDialogLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(vehiculosDialogLayout.createSequentialGroup()
                                    .addComponent(patenteLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(patenteText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(vehiculosDialogLayout.createSequentialGroup()
                                    .addComponent(duenioLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(duenioText, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(vehiculosDialogLayout.createSequentialGroup()
                                    .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(modeloLbl)
                                        .addComponent(chasisLbl)
                                        .addComponent(motorLbl))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(chasisText, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                        .addComponent(modeloCBox, 0, 138, Short.MAX_VALUE)
                                        .addComponent(motorText))))
                            .addGroup(vehiculosDialogLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(nuevoVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(guardarVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(eliminarVehiculoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        vehiculosDialogLayout.setVerticalGroup(
            vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, vehiculosDialogLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(vehiculosLbl)
                .addGap(18, 18, 18)
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(patenteText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(vehiculosDialogLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(patenteLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(duenioText)
                    .addComponent(duenioLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modeloCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modeloLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chasisText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chasisLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motorLbl)
                    .addComponent(motorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(vehiculosDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoVehiculoBtn)
                    .addComponent(guardarVehiculoBtn)
                    .addComponent(eliminarVehiculoBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(backBtn3)
                .addGap(48, 48, 48))
        );

        mantenimientoDialog.setTitle("Mantenimiento");

        backBtn4.setText("Atras");
        backBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn4ActionPerformed(evt);
            }
        });

        patentesLbl.setText("ID:");

        fechaLbl.setText("Fecha:");

        mantenimientosLbl.setText("Mantenimiento:");

        mantenimientoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoTextActionPerformed(evt);
            }
        });

        mantenimientoLbl.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        mantenimientoLbl.setText("Mantenimiento");

        nuevoMantenimientoBtn.setText("Nuevo");
        nuevoMantenimientoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoMantenimientoBtnActionPerformed(evt);
            }
        });

        guardarMantenimientoBtn.setText("Guardar");
        guardarMantenimientoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarMantenimientoBtnActionPerformed(evt);
            }
        });

        eliminarMantenimientoBtn.setText("Eliminar");

        mantenimientosTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(mantenimientosTable);

        jLabel3.setText("Modelo:");

        javax.swing.GroupLayout mantenimientoDialogLayout = new javax.swing.GroupLayout(mantenimientoDialog.getContentPane());
        mantenimientoDialog.getContentPane().setLayout(mantenimientoDialogLayout);
        mantenimientoDialogLayout.setHorizontalGroup(
            mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modelosCBox, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaLbl)
                                    .addGroup(mantenimientoDialogLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(patentesLbl)))
                                .addGap(18, 18, 18)
                                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idMantenimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                                .addComponent(mantenimientosLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mantenimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(mantenimientoLbl)
                                .addGap(113, 113, 113))
                            .addGroup(mantenimientoDialogLayout.createSequentialGroup()
                                .addComponent(nuevoMantenimientoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(guardarMantenimientoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eliminarMantenimientoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addGap(10, 10, 10)))))
                .addGap(73, 73, 73))
            .addGroup(mantenimientoDialogLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backBtn4)
                .addContainerGap())
        );
        mantenimientoDialogLayout.setVerticalGroup(
            mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mantenimientoDialogLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(mantenimientoLbl)
                .addGap(4, 4, 4)
                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mantenimientosLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mantenimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fechaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fechaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mantenimientoDialogLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(patentesLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mantenimientoDialogLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(idMantenimientoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelosCBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(mantenimientoDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(guardarMantenimientoBtn)
                    .addComponent(eliminarMantenimientoBtn)
                    .addComponent(nuevoMantenimientoBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(backBtn4)
                .addContainerGap())
        );

        setToolTipText("");
        setPreferredSize(new java.awt.Dimension(100, 100));

        userNameLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        userNameLbl.setText("Usuario");

        passWordLbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        passWordLbl.setText("Password");

        passWordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passWordTextActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        loginBtn.setText("Ingresar");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        cancelarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelarBtn.setText("Salir");
        cancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarBtnActionPerformed(evt);
            }
        });

        accessError.setForeground(new java.awt.Color(228, 60, 40));
        accessError.setText("Usuario o password incorrecto. Intente de nuevo");
        accessError.setEnabled(false);

        titleLbl.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        titleLbl.setText("Bienvenido al taller \"El Chumi\"");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ar/cp/taller/img/car.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(titleLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(accessError)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passWordLbl)
                            .addComponent(userNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userNameText)
                            .addComponent(passWordText))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userNameLbl)
                    .addComponent(userNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passWordLbl)
                    .addComponent(passWordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(accessError)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        UsuarioService userService = new UsuarioService();
        if(userService.validarUsuario(this.userNameText.getText(),this.passWordText.getText())){
            correctDialog.setSize(500,300);
            correctDialog.setVisible(true);
            correctDialog.setEnabled(true);
            
            this.welcomeLbl.setText("Bienvenido " + userService.getNombreApellido(this.userNameText.getText()));
            mantenimientoBtn.setVisible(true);
            
            if(userService.isAdmin(this.userNameText.getText())){
                marcasBtn.setVisible(true);    
                modelosBtn.setVisible(true);
                vehiculosBtn.setVisible(true);
            }
            else{
                marcasBtn.setVisible(false);    
                modelosBtn.setVisible(false);
                vehiculosBtn.setVisible(false);
            }
        }
        else{
            this.accessError.setEnabled(true);
            this.welcomeLbl.setText("");
        }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void passWordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passWordTextActionPerformed
        //
    }//GEN-LAST:event_passWordTextActionPerformed

    private void marcasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcasBtnActionPerformed
        correctDialog.setVisible(false);
        marcasDialog.setSize(500,600);
        marcasDialog.setVisible(true);
        marcasDialog.setEnabled(true);
                
        MarcaService marcaService = new MarcaService();
        marcaExisteLbl.setEnabled(false);
        nombreMarcaText.setText("");
        idMarcaText.setEnabled(false);
        marcasTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                try {
                    idMarcaText.setText(marcasTable.getValueAt(marcasTable.getSelectedRow(), 0).toString());
                    nombreMarcaText.setText(marcasTable.getValueAt(marcasTable.getSelectedRow(), 1).toString());
                } catch (Exception e) {}
            }
        });
        marcasTable.setModel(buildTableModelMarca(marcaService.getAll()));
        
    }//GEN-LAST:event_marcasBtnActionPerformed

    private void cancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarBtnActionPerformed
        cancelarBtn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
        	System.exit(0);
            }   
	});
    }//GEN-LAST:event_cancelarBtnActionPerformed

    private void modelosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelosBtnActionPerformed
        correctDialog.setVisible(false);
        modelosDialog.setSize(500,600);
        modelosDialog.setVisible(true);
        modelosDialog.setEnabled(true);
        
        anioModeloText.setText("");
        descripcionModeloText.setText("");
        idModeloText.setText("");
        
        MarcaService marcaService = new MarcaService();
        List<Marca> listaMarca = marcaService.getAll();
        marcaModeloCBox.removeAllItems();
        for(Marca marca : listaMarca)
            marcaModeloCBox.addItem(marca.getNombre());
        
        ModeloService modeloService = new ModeloService();
        modelosTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                try {
                    idModeloText.setText(modelosTable.getValueAt(modelosTable.getSelectedRow(), 0).toString());
                    descripcionModeloText.setText(modelosTable.getValueAt(modelosTable.getSelectedRow(), 1).toString());
                    anioModeloText.setText(modelosTable.getValueAt(modelosTable.getSelectedRow(), 2).toString());
                } catch (Exception e) {}
            }
        });
        modelosTable.setModel(buildTableModelModelo(modeloService.getAll()));
    }//GEN-LAST:event_modelosBtnActionPerformed

    private void vehiculosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculosBtnActionPerformed
        correctDialog.setVisible(false);
        vehiculosDialog.setSize(500,600);
        vehiculosDialog.setVisible(true);
        vehiculosDialog.setEnabled(true);
        
        ModeloService modeloService = new ModeloService();
        List<Modelo> listaModelo = modeloService.getAll();
        modeloCBox.removeAllItems();
        for(Modelo modelo : listaModelo)
            modeloCBox.addItem(modelo.getDescripcion());
        
        VehiculoService vehiculoService = new VehiculoService();
        vehiculosTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                try {
                    patenteText.setText(vehiculosTable.getValueAt(vehiculosTable.getSelectedRow(), 0).toString());
                    duenioText.setText(vehiculosTable.getValueAt(vehiculosTable.getSelectedRow(), 1).toString());
                    chasisText.setText(vehiculosTable.getValueAt(vehiculosTable.getSelectedRow(), 3).toString());
                    motorText.setText(vehiculosTable.getValueAt(vehiculosTable.getSelectedRow(), 4).toString());
                } catch (Exception e) {}
            }
        });
        vehiculosTable.setModel(buildTableModelVehiculo(vehiculoService.getAll()));
    }//GEN-LAST:event_vehiculosBtnActionPerformed

    private void mantenimientoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoBtnActionPerformed
        correctDialog.setVisible(false);
        mantenimientoDialog.setSize(500,600);
        mantenimientoDialog.setVisible(true);
        mantenimientoDialog.setEnabled(true);
        
        fechaText.setText("");
        mantenimientoText.setText("");
        
        ModeloService modeloService = new ModeloService();
        List<Modelo> listaModelo = modeloService.getAll();
        modelosCBox.removeAllItems();
        for(Modelo modelo : listaModelo)
            modelosCBox.addItem(modelo.getDescripcion());
        
        MantenimientoService mantenimientoService = new MantenimientoService();
        mantenimientosTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent event) {
                try {
                    fechaText.setText(modelosTable.getValueAt(modelosTable.getSelectedRow(), 0).toString());
                    mantenimientoText.setText(modelosTable.getValueAt(modelosTable.getSelectedRow(), 1).toString());
                } catch (Exception e) {}
            }
        });
        mantenimientosTable.setModel(buildTableModelMantenimiento(mantenimientoService.getAll()));
    }//GEN-LAST:event_mantenimientoBtnActionPerformed

    private void eliminarMarcaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarMarcaBtnActionPerformed
        marcasTable.clearSelection();
        MarcaService marcaService = new MarcaService();
        String id = idMarcaText.getText();
        String nombre = nombreMarcaText.getText();
        
        if (id != null && !id.isEmpty())
            marcaService.eliminarMarca(Integer.parseInt(id));
        else{
            if (nombre != null && !nombre.isEmpty())
                marcaService.eliminarMarca(nombre);
        }

        idMarcaText.setText("");
        nombreMarcaText.setText("");
        
        marcasTable.setModel(buildTableModelMarca(marcaService.getAll()));
        marcasTable.revalidate();
    }//GEN-LAST:event_eliminarMarcaBtnActionPerformed

    private void salirBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtn1ActionPerformed
        salirBtn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
        	System.exit(0);
            }   
	});
    }//GEN-LAST:event_salirBtn1ActionPerformed

    private void anioModeloTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioModeloTextActionPerformed
        // 
    }//GEN-LAST:event_anioModeloTextActionPerformed

    private void backBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn2ActionPerformed
        modelosDialog.setVisible(false);
        correctDialog.setVisible(true);
    }//GEN-LAST:event_backBtn2ActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        marcasDialog.setVisible(false);
        correctDialog.setVisible(true);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void backBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn3ActionPerformed
        vehiculosDialog.setVisible(false);
        correctDialog.setVisible(true);
    }//GEN-LAST:event_backBtn3ActionPerformed

    private void backBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn4ActionPerformed
        mantenimientoDialog.setVisible(false);
        correctDialog.setVisible(true);
    }//GEN-LAST:event_backBtn4ActionPerformed

    private void mantenimientoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoTextActionPerformed
        // 
    }//GEN-LAST:event_mantenimientoTextActionPerformed

    public DefaultTableModel buildTableModelMarca(List<Marca> rs) {

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("ID");
        columnNames.add("Nombre");
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        for (Marca marca : rs) {
            Vector<Object> vector = new Vector<Object>();
            vector.add(marca.getId());
            vector.add(marca.getNombre());
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);

    }
    
    public DefaultTableModel buildTableModelModelo(List<Modelo> rs) {

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("ID");
        columnNames.add("Descripción");
        columnNames.add("Año");
        columnNames.add("Combustible");
        columnNames.add("Marca");
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        for (Modelo modelo : rs) {
            Vector<Object> vector = new Vector<Object>();
            vector.add(modelo.getId());
            vector.add(modelo.getDescripcion());
            vector.add(modelo.getAnio());
            vector.add(modelo.getMarca().getNombre());
            vector.add(modelo.getTipocombustible());
            vector.add(modelo.getDescripcion());
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);

    }
    
    public DefaultTableModel buildTableModelVehiculo(List<Vehiculo> rs) {

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("Patente");
        columnNames.add("Dueño");
        columnNames.add("Modelo");
        columnNames.add("Num. chasis");
        columnNames.add("Num. motor");
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        for (Vehiculo vehiculo : rs) {
            Vector<Object> vector = new Vector<Object>();
            vector.add(vehiculo.getPatente());
            vector.add(vehiculo.getDescripcion());
            vector.add(vehiculo.getModelo().getDescripcion());
            vector.add(vehiculo.getNumerochasis());
            vector.add(vehiculo.getNumeromotor());
            vector.add(vehiculo.getDescripcion());
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);

    }
    
    public DefaultTableModel buildTableModelMantenimiento(List<Mantenimiento> rs) {

        // names of columns
        Vector<String> columnNames = new Vector<String>();
        columnNames.add("Marca");
        columnNames.add("Modelo");
        columnNames.add("Fecha");
        columnNames.add("Patente");
        columnNames.add("Mantenimiento");
        // data of the table
        Vector<Vector<Object>> data = new Vector<Vector<Object>>();
        for (Mantenimiento mantenimiento : rs) {
            Vector<Object> vector = new Vector<Object>();
            vector.add(mantenimiento.getVehiculo().getModelo().getMarca().getNombre());
            vector.add(mantenimiento.getVehiculo().getModelo().getDescripcion());
            vector.add(mantenimiento.getFecha());
            vector.add(mantenimiento.getVehiculo().getPatente());
            vector.add(mantenimiento.getDescripcion());
            vector.add(mantenimiento.getDescripcion());
            data.add(vector);
        }
        return new DefaultTableModel(data, columnNames);

    }
    
    private void nuevaMarcaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaMarcaBtnActionPerformed
        marcasTable.clearSelection();
        MarcaService marcaService = new MarcaService();
        idMarcaText.setText("");
        nombreMarcaText.setText("");
        marcasTable.setModel(buildTableModelMarca(marcaService.getAll()));
        marcasTable.revalidate();
        nombreMarcaText.requestFocus();
    }//GEN-LAST:event_nuevaMarcaBtnActionPerformed

    private void guardarMarcaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarMarcaBtnActionPerformed
        marcasTable.clearSelection();
        MarcaService marcaService = new MarcaService();
        String nombreMarca = nombreMarcaText.getText();
        marcaExisteLbl.setEnabled(false);
        
        if(idMarcaText.getText().isEmpty()) {    
            if(nombreMarca != null && !nombreMarca.isEmpty() && !marcaService.existeMarca(nombreMarca)){
                marcaService.nuevaMarca(nombreMarca);
                idMarcaText.setText("");
                nombreMarcaText.setText("");
            }
            else
                marcaExisteLbl.setEnabled(true);
        }
        else {
            Integer idMarca = Integer.parseInt(idMarcaText.getText());
            if(nombreMarca != null && !nombreMarca.isEmpty() && !marcaService.existeMarca(nombreMarca)){
                marcaService.modificarMarca(idMarca, nombreMarca);
                idMarcaText.setText("");
                nombreMarcaText.setText("");
            }
        }
        marcasTable.setModel(buildTableModelMarca(marcaService.getAll()));
        marcasTable.revalidate();
    }//GEN-LAST:event_guardarMarcaBtnActionPerformed

    private void marcaModeloCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaModeloCBoxActionPerformed
        
    }//GEN-LAST:event_marcaModeloCBoxActionPerformed

    private void modeloCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloCBoxActionPerformed
        
    }//GEN-LAST:event_modeloCBoxActionPerformed

    private void guardarModeloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarModeloBtnActionPerformed
        modelosTable.clearSelection();
        ModeloService modeloService = new ModeloService();
        int anioModelo = Integer.parseInt(anioModeloText.getText());
        String descripcionModelo = descripcionModeloText.getText();
        String combustibleModelo = combustibleModeloCBox.getItemAt(combustibleModeloCBox.getSelectedIndex());
        String marcaModelo = marcaModeloCBox.getItemAt(marcaModeloCBox.getSelectedIndex());
        
        Marca marcaM = new Marca();
        marcaM = null;
        MarcaService marcaService = new MarcaService();
        List<Marca> listaMarca = marcaService.getAll();
        for(Marca marca : listaMarca){
            if(marca.getNombre().equals(marcaModelo)){        
                marcaM = marca;
            }
        }
        
        if(!modeloService.existeModelo(descripcionModelo)) {
            if(descripcionModelo != null && !descripcionModelo.isEmpty()) {
                modeloService.nuevoModelo(descripcionModelo,anioModelo,combustibleModelo,marcaM);
                anioModeloText.setText("");
                descripcionModeloText.setText("");
            }
        }
        else {
            modeloService.modificarModelo(descripcionModelo,anioModelo,combustibleModelo,marcaM);
            anioModeloText.setText("");
            descripcionModeloText.setText("");
        }
        modelosTable.setModel(buildTableModelModelo(modeloService.getAll()));
        modelosTable.revalidate();
    }//GEN-LAST:event_guardarModeloBtnActionPerformed

    private void idMarcaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idMarcaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idMarcaTextActionPerformed

    private void nuevoModeloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoModeloBtnActionPerformed
        modelosTable.clearSelection();
        ModeloService modeloService = new ModeloService();
        anioModeloText.setText("");
        descripcionModeloText.setText("");
        idModeloText.setText("");
        modelosTable.setModel(buildTableModelModelo(modeloService.getAll()));
        modelosTable.revalidate();
        descripcionModeloText.requestFocus();
    }//GEN-LAST:event_nuevoModeloBtnActionPerformed

    private void combustibleModeloCBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combustibleModeloCBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combustibleModeloCBoxActionPerformed

    private void eliminarModeloBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarModeloBtnActionPerformed
        modelosTable.clearSelection();
        ModeloService modeloService = new ModeloService();
        String id = idModeloText.getText();
        String descripcion = descripcionModeloText.getText();
        
        if (id != null && !id.isEmpty())
            modeloService.eliminarModelo(Integer.parseInt(id));
        else{
            if (descripcion != null && !descripcion.isEmpty())
                modeloService.eliminarModelo(descripcion);
        }
        
        idModeloText.setText("");
        descripcionModeloText.setText("");
        
        modelosTable.setModel(buildTableModelModelo(modeloService.getAll()));
        modelosTable.revalidate();
    }//GEN-LAST:event_eliminarModeloBtnActionPerformed

    private void nuevoVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoVehiculoBtnActionPerformed
        vehiculosTable.clearSelection();
        VehiculoService vehiculoService = new VehiculoService();
        patenteText.setText("");
        duenioText.setText("");
        chasisText.setText("");
        motorText.setText("");
        vehiculosTable.setModel(buildTableModelVehiculo(vehiculoService.getAll()));
        vehiculosTable.revalidate();
        descripcionModeloText.requestFocus();
    }//GEN-LAST:event_nuevoVehiculoBtnActionPerformed

    private void guardarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarVehiculoBtnActionPerformed
        vehiculosTable.clearSelection();
        VehiculoService vehiculoService = new VehiculoService();
        String patenteVehiculo = patenteText.getText();
        String duenioVehiculo  = duenioText.getText();
        String chasisVehiculo  = chasisText.getText();
        String motorVehiculo  = motorText.getText();
        String marcaModelo = modeloCBox.getItemAt(modeloCBox.getSelectedIndex());
        
        Modelo modeloV = new Modelo();
        modeloV = null;
        ModeloService modeloService = new ModeloService();
        List<Modelo> listaModelo = modeloService.getAll();
        for(Modelo modelo : listaModelo){
            if(modelo.getDescripcion().equals(marcaModelo)){        
                modeloV = modelo;
            }
        }
        
        if(!vehiculoService.existeVehiculo(patenteVehiculo)) {
            if(duenioVehiculo != null && !duenioVehiculo.isEmpty()) {
                vehiculoService.nuevoVehiculo(patenteVehiculo,duenioVehiculo,modeloV,chasisVehiculo,motorVehiculo);
                patenteText.setText("");
                duenioText.setText("");
                chasisText.setText("");
                motorText.setText("");
            }
        }
        else {
            vehiculoService.modificarVehiculo(patenteVehiculo,duenioVehiculo,modeloV,chasisVehiculo,motorVehiculo);
            patenteText.setText("");
            duenioText.setText("");
            chasisText.setText("");
            motorText.setText("");
        }
        vehiculosTable.setModel(buildTableModelVehiculo(vehiculoService.getAll()));
        vehiculosTable.revalidate();
    }//GEN-LAST:event_guardarVehiculoBtnActionPerformed

    private void eliminarVehiculoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVehiculoBtnActionPerformed
        vehiculosTable.clearSelection();
        VehiculoService vehiculoService = new VehiculoService();
        String patente = patenteText.getText();
        
        if (patente != null && !patente.isEmpty())
            vehiculoService.eliminarVehiculo(patente);
        
        patenteText.setText("");
        duenioText.setText("");
        chasisText.setText("");
        motorText.setText("");
        
        vehiculosTable.setModel(buildTableModelVehiculo(vehiculoService.getAll()));
        vehiculosTable.revalidate();
    }//GEN-LAST:event_eliminarVehiculoBtnActionPerformed

    private void nuevoMantenimientoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoMantenimientoBtnActionPerformed
        mantenimientosTable.clearSelection();
        MantenimientoService mantenimientoService = new MantenimientoService();
        fechaText.setText("");
        mantenimientoText.setText("");
        mantenimientosTable.setModel(buildTableModelMantenimiento(mantenimientoService.getAll()));
        mantenimientosTable.revalidate();
        //nombreMarcaText.requestFocus();
    }//GEN-LAST:event_nuevoMantenimientoBtnActionPerformed

    private void guardarMantenimientoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarMantenimientoBtnActionPerformed
        mantenimientosTable.clearSelection();
        MantenimientoService mantenimientoService = new MantenimientoService();
        String fechaMantenimiento = fechaText.getText();
        String mantenimiento = mantenimientoText.getText();
        String modeloMantenimiento = modelosCBox.getItemAt(modeloCBox.getSelectedIndex());
        
        Vehiculo vehiculoM = new Vehiculo();
        vehiculoM = null;
        VehiculoService vehiculoService = new VehiculoService();
        List<Vehiculo> listaVehiculo = vehiculoService.getAll();
        for(Vehiculo vehiculo : listaVehiculo){
            if(vehiculo.getModelo().getDescripcion().equals(modeloMantenimiento)){        
                vehiculoM = vehiculo;
            }
        }
        
        if(idMantenimientoText.getText().isEmpty()) {
            if(mantenimiento != null && !mantenimiento.isEmpty()) {
                mantenimientoService.nuevoMantenimiento(mantenimiento,fechaMantenimiento,vehiculoM);
                //idMantenimientoText.setText("");
                //fechaText.setText("");
                //mantenimientoText.setText("");
            }
            else{
                Integer idMantenimiento = Integer.parseInt(idMantenimientoText.getText());
                if(mantenimientoService.existeMantenimiento(idMantenimiento)){
                    mantenimientoService.modificarMantenimiento(idMantenimiento,mantenimiento,fechaMantenimiento,vehiculoM);
                    idMantenimientoText.setText("");
                    fechaText.setText("");
                    mantenimientoText.setText("");
                }
            }
            mantenimientosTable.setModel(buildTableModelMantenimiento(mantenimientoService.getAll()));
            mantenimientosTable.revalidate();
        }
    }//GEN-LAST:event_guardarMantenimientoBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accessError;
    private javax.swing.JLabel anioLbl;
    private javax.swing.JTextField anioModeloText;
    private javax.swing.JButton backBtn1;
    private javax.swing.JButton backBtn2;
    private javax.swing.JButton backBtn3;
    private javax.swing.JButton backBtn4;
    private javax.swing.JButton cancelarBtn;
    private javax.swing.JLabel chasisLbl;
    private javax.swing.JTextField chasisText;
    private javax.swing.JLabel combustibleLbl;
    private javax.swing.JComboBox<String> combustibleModeloCBox;
    private javax.swing.JDialog correctDialog;
    private javax.swing.JTextField descripcionModeloText;
    private javax.swing.JLabel duenioLbl;
    private javax.swing.JTextField duenioText;
    private javax.swing.JButton eliminarMantenimientoBtn;
    private javax.swing.JButton eliminarMarcaBtn;
    private javax.swing.JButton eliminarModeloBtn;
    private javax.swing.JButton eliminarVehiculoBtn;
    private javax.swing.JLabel fechaLbl;
    private javax.swing.JTextField fechaText;
    private javax.swing.JButton guardarMantenimientoBtn;
    private javax.swing.JButton guardarMarcaBtn;
    private javax.swing.JButton guardarModeloBtn;
    private javax.swing.JButton guardarVehiculoBtn;
    private javax.swing.JTextField idMantenimientoText;
    private javax.swing.JTextField idMarcaText;
    private javax.swing.JTextField idModeloText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton mantenimientoBtn;
    private javax.swing.JDialog mantenimientoDialog;
    private javax.swing.JLabel mantenimientoLbl;
    private javax.swing.JTextField mantenimientoText;
    private javax.swing.JLabel mantenimientosLbl;
    private javax.swing.JTable mantenimientosTable;
    private javax.swing.JLabel marcaExisteLbl;
    private javax.swing.JComboBox<String> marcaModeloCBox;
    private javax.swing.JLabel marcaNameLbl;
    private javax.swing.JButton marcasBtn;
    private javax.swing.JDialog marcasDialog;
    private javax.swing.JLabel marcasLbl;
    private javax.swing.JTable marcasTable;
    private javax.swing.JLabel modelLbl;
    private javax.swing.JComboBox<String> modeloCBox;
    private javax.swing.JLabel modeloLbl;
    private javax.swing.JButton modelosBtn;
    private javax.swing.JComboBox<String> modelosCBox;
    private javax.swing.JDialog modelosDialog;
    private javax.swing.JLabel modelosLbl;
    private javax.swing.JTable modelosTable;
    private javax.swing.JLabel motorLbl;
    private javax.swing.JTextField motorText;
    private javax.swing.JLabel nombreMarcaLbl;
    private javax.swing.JTextField nombreMarcaText;
    private javax.swing.JButton nuevaMarcaBtn;
    private javax.swing.JButton nuevoMantenimientoBtn;
    private javax.swing.JButton nuevoModeloBtn;
    private javax.swing.JButton nuevoVehiculoBtn;
    private javax.swing.JLabel passWordLbl;
    private javax.swing.JTextField passWordText;
    private javax.swing.JLabel patenteLbl;
    private javax.swing.JTextField patenteText;
    private javax.swing.JLabel patentesLbl;
    private javax.swing.JButton salirBtn1;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JLabel userNameLbl;
    private javax.swing.JTextField userNameText;
    private javax.swing.JButton vehiculosBtn;
    private javax.swing.JDialog vehiculosDialog;
    private javax.swing.JLabel vehiculosLbl;
    private javax.swing.JTable vehiculosTable;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}

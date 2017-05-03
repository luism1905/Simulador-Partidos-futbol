/*
 
 */
package com.simulador.View;

import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class Main extends javax.swing.JDialog {

    public JComboBox getCmbAlineacion() {
        return cmbAlineacion;
    }

    public void setCmbAlineacion(JComboBox cmbAlineacion) {
        this.cmbAlineacion = cmbAlineacion;
    }

    public JLabel getLblAlineacion() {
        return lblAlineacion;
    }

    public JLabel getLblContGoles1() {
        return lblContGoles1;
    }

    public void setLblContGoles1(JLabel lblContGoles1) {
        this.lblContGoles1 = lblContGoles1;
    }

    public JLabel getLblContGoles2() {
        return lblContGoles2;
    }

    public void setLblContGoles2(JLabel lblContGoles2) {
        this.lblContGoles2 = lblContGoles2;
    }

    public JLabel getLblContPases1() {
        return lblContPases1;
    }

    public JLabel getLblRkg2() {
        return lblRkg2;
    }

    public void setLblRkg2(JLabel lblRkg2) {
        this.lblRkg2 = lblRkg2;
    }

    public JLabel getLblrkg1() {
        return lblrkg1;
    }

    public void setLblrkg1(JLabel lblrkg1) {
        this.lblrkg1 = lblrkg1;
    }

    public void setLblContPases1(JLabel lblContPases1) {
        this.lblContPases1 = lblContPases1;
    }

    public JLabel getLblContPases2() {
        return lblContPases2;
    }

    public void setLblContPases2(JLabel lblContPases2) {
        this.lblContPases2 = lblContPases2;
    }

    public void setLblAlineacion(JLabel lblAlineacion) {
        this.lblAlineacion = lblAlineacion;
    }

    public JLabel getLblAlineacion2() {
        return lblAlineacion2;
    }

    public void setLblAlineacion2(JLabel lblAlineacion2) {
        this.lblAlineacion2 = lblAlineacion2;
    }

    public JComboBox getCmbAlineacion2() {
        return cmbAlineacion2;
    }

    public void setCmbAlineacion2(JComboBox cmbAlineacion2) {
        this.cmbAlineacion2 = cmbAlineacion2;
    }

    public JLabel getLblCnChutes1() {
        return lblCnChutes1;
    }

    public void setLblCnChutes1(JLabel lblCnChutes1) {
        this.lblCnChutes1 = lblCnChutes1;
    }

    public JLabel getLblCnChutes2() {
        return lblCnChutes2;
    }

    public void setLblCnChutes2(JLabel lblCnChutes2) {
        this.lblCnChutes2 = lblCnChutes2;
    }

    public JLabel getLblBalon2() {
        return lblBalon2;
    }

    public void setLblBalon2(JLabel lblBalon2) {
        this.lblBalon2 = lblBalon2;
    }

    public Main(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        lbl3.setVisible(false);
        lbl8.setVisible(false);
        lbl1.setVisible(false);
        lbl13.setVisible(false);
        lbl5.setVisible(false);
        lbl19.setVisible(false);
        lbl25.setVisible(false);
        lbl28.setVisible(false);
        lbl30.setVisible(false);
        lbl32.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lbllogo = new javax.swing.JLabel();
        lblNarracionEq1 = new javax.swing.JLabel();
        jPanelEquipo2 = new javax.swing.JPanel();
        cmbAlineacion2 = new javax.swing.JComboBox();
        cmbEquipo2 = new javax.swing.JComboBox();
        lblAlineacion2 = new javax.swing.JLabel();
        lblNombreEquipo2 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lblFondo3 = new javax.swing.JLabel();
        lblGoles2 = new javax.swing.JLabel();
        lblContGoles2 = new javax.swing.JLabel();
        lblPases = new javax.swing.JLabel();
        lblContPases2 = new javax.swing.JLabel();
        lblBalon2 = new javax.swing.JLabel();
        lblChutes2 = new javax.swing.JLabel();
        lblCnChutes2 = new javax.swing.JLabel();
        lblRanking2 = new javax.swing.JLabel();
        lblRkg2 = new javax.swing.JLabel();
        jPanelEquipo1 = new javax.swing.JPanel();
        cmbEquipo1 = new javax.swing.JComboBox();
        lblNombreEquipo1 = new javax.swing.JLabel();
        lblAlineacion = new javax.swing.JLabel();
        cmbAlineacion = new javax.swing.JComboBox();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lblFondo2 = new javax.swing.JLabel();
        lblGol = new javax.swing.JLabel();
        lblPases1 = new javax.swing.JLabel();
        lblContGoles1 = new javax.swing.JLabel();
        lblContPases1 = new javax.swing.JLabel();
        lblBalon1 = new javax.swing.JLabel();
        lblChutes1 = new javax.swing.JLabel();
        lblCnChutes1 = new javax.swing.JLabel();
        lblRanking1 = new javax.swing.JLabel();
        lblrkg1 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTiempo = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblPartido = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jcmbPartido = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("Consolas", 1, 48)); // NOI18N
        lblTitle.setText("Simulador de Partidos");

        lbllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/simulador/resources/img/UEFA_Champions_League_logo_2.svg.png"))); // NOI18N

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbllogo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addComponent(lblNarracionEq1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGroup(jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTitleLayout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNarracionEq1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addComponent(lbllogo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 760, 130));

        jPanelEquipo2.setBackground(new java.awt.Color(255, 153, 153));
        jPanelEquipo2.setForeground(new java.awt.Color(255, 51, 51));
        jPanelEquipo2.setLayout(null);

        cmbAlineacion2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4-4-2", "5-4-1", "3-5-2", "4-3-3" }));
        cmbAlineacion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlineacion2ActionPerformed(evt);
            }
        });
        jPanelEquipo2.add(cmbAlineacion2);
        cmbAlineacion2.setBounds(80, 40, 154, 20);

        jPanelEquipo2.add(cmbEquipo2);
        cmbEquipo2.setBounds(80, 10, 208, 20);

        lblAlineacion2.setText("Alineación:");
        jPanelEquipo2.add(lblAlineacion2);
        lblAlineacion2.setBounds(10, 40, 70, 14);

        lblNombreEquipo2.setText("Equipo 2:");
        jPanelEquipo2.add(lblNombreEquipo2);
        lblNombreEquipo2.setBounds(10, 14, 60, 14);

        lbl23.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl23.setForeground(new java.awt.Color(255, 51, 51));
        lbl23.setText(".");
        jPanelEquipo2.add(lbl23);
        lbl23.setBounds(140, 220, 15, 20);

        lbl16.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl16.setForeground(new java.awt.Color(255, 51, 51));
        lbl16.setText(".");
        jPanelEquipo2.add(lbl16);
        lbl16.setBounds(200, 110, 15, 20);

        lbl17.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl17.setForeground(new java.awt.Color(255, 51, 51));
        lbl17.setText(".");
        jPanelEquipo2.add(lbl17);
        lbl17.setBounds(130, 150, 15, 20);

        lbl18.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl18.setForeground(new java.awt.Color(255, 51, 51));
        lbl18.setText(".");
        jPanelEquipo2.add(lbl18);
        lbl18.setBounds(170, 150, 15, 20);

        lbl19.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl19.setForeground(new java.awt.Color(255, 51, 51));
        lbl19.setText(".");
        jPanelEquipo2.add(lbl19);
        lbl19.setBounds(200, 150, 15, 20);

        lbl20.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl20.setForeground(new java.awt.Color(255, 51, 51));
        lbl20.setText(".");
        jPanelEquipo2.add(lbl20);
        lbl20.setBounds(230, 150, 15, 20);

        lbl21.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl21.setForeground(new java.awt.Color(255, 51, 51));
        lbl21.setText(".");
        jPanelEquipo2.add(lbl21);
        lbl21.setBounds(260, 150, 15, 20);

        lbl24.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl24.setForeground(new java.awt.Color(255, 51, 51));
        lbl24.setText(".");
        jPanelEquipo2.add(lbl24);
        lbl24.setBounds(170, 220, 15, 20);

        lbl25.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl25.setForeground(new java.awt.Color(255, 51, 51));
        lbl25.setText(".");
        jPanelEquipo2.add(lbl25);
        lbl25.setBounds(200, 220, 15, 20);

        lbl26.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl26.setForeground(new java.awt.Color(255, 51, 51));
        lbl26.setText(".");
        jPanelEquipo2.add(lbl26);
        lbl26.setBounds(230, 220, 15, 20);

        lbl27.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl27.setForeground(new java.awt.Color(255, 51, 51));
        lbl27.setText(".");
        jPanelEquipo2.add(lbl27);
        lbl27.setBounds(260, 220, 15, 20);

        lbl28.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl28.setForeground(new java.awt.Color(255, 51, 51));
        lbl28.setText(".");
        jPanelEquipo2.add(lbl28);
        lbl28.setBounds(140, 270, 15, 20);

        lbl29.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl29.setForeground(new java.awt.Color(255, 51, 51));
        lbl29.setText(".");
        jPanelEquipo2.add(lbl29);
        lbl29.setBounds(170, 270, 15, 20);

        lbl30.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl30.setForeground(new java.awt.Color(255, 51, 51));
        lbl30.setText(".");
        jPanelEquipo2.add(lbl30);
        lbl30.setBounds(200, 270, 15, 20);

        lbl31.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl31.setForeground(new java.awt.Color(255, 51, 51));
        lbl31.setText(".");
        jPanelEquipo2.add(lbl31);
        lbl31.setBounds(230, 270, 15, 20);

        lbl32.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl32.setForeground(new java.awt.Color(255, 51, 51));
        lbl32.setText(".");
        jPanelEquipo2.add(lbl32);
        lbl32.setBounds(260, 270, 15, 20);

        lblFondo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/simulador/resources/img/campo2.png"))); // NOI18N
        jPanelEquipo2.add(lblFondo3);
        lblFondo3.setBounds(110, 90, 200, 280);

        lblGoles2.setText("Goles:");
        jPanelEquipo2.add(lblGoles2);
        lblGoles2.setBounds(20, 70, 60, 14);

        lblContGoles2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContGoles2.setText("0");
        jPanelEquipo2.add(lblContGoles2);
        lblContGoles2.setBounds(30, 90, 40, 40);

        lblPases.setText("Pases:");
        jPanelEquipo2.add(lblPases);
        lblPases.setBounds(20, 220, 60, 14);

        lblContPases2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContPases2.setText("0");
        jPanelEquipo2.add(lblContPases2);
        lblContPases2.setBounds(30, 250, 30, 40);

        lblBalon2.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlos\\Desktop\\balon.png")); // NOI18N
        lblBalon2.setText("lblBalon2");
        jPanelEquipo2.add(lblBalon2);
        lblBalon2.setBounds(0, 300, 90, 80);

        lblChutes2.setText("Chutes:");
        jPanelEquipo2.add(lblChutes2);
        lblChutes2.setBounds(20, 140, 60, 14);

        lblCnChutes2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCnChutes2.setText("0");
        jPanelEquipo2.add(lblCnChutes2);
        lblCnChutes2.setBounds(30, 160, 50, 50);

        lblRanking2.setText("Ranking:");
        jPanelEquipo2.add(lblRanking2);
        lblRanking2.setBounds(124, 70, 50, 14);
        jPanelEquipo2.add(lblRkg2);
        lblRkg2.setBounds(194, 70, 60, 20);

        getContentPane().add(jPanelEquipo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 310, 380));

        jPanelEquipo1.setBackground(new java.awt.Color(204, 204, 255));
        jPanelEquipo1.setLayout(null);

        jPanelEquipo1.add(cmbEquipo1);
        cmbEquipo1.setBounds(60, 10, 208, 20);

        lblNombreEquipo1.setText("Equipo 1:");
        jPanelEquipo1.add(lblNombreEquipo1);
        lblNombreEquipo1.setBounds(10, 14, 60, 14);

        lblAlineacion.setText("Alineación:");
        jPanelEquipo1.add(lblAlineacion);
        lblAlineacion.setBounds(10, 40, 70, 14);

        cmbAlineacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "4-4-2", "5-4-1", "3-5-2", "4-3-3" }));
        cmbAlineacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAlineacionActionPerformed(evt);
            }
        });
        jPanelEquipo1.add(cmbAlineacion);
        cmbAlineacion.setBounds(80, 40, 154, 20);

        lbl1.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 0, 255));
        lbl1.setText(".");
        jPanelEquipo1.add(lbl1);
        lbl1.setBounds(40, 150, 15, 20);

        lbl2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl2.setForeground(new java.awt.Color(0, 0, 255));
        lbl2.setText(".");
        jPanelEquipo1.add(lbl2);
        lbl2.setBounds(70, 150, 15, 20);

        lbl3.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl3.setForeground(new java.awt.Color(0, 0, 255));
        lbl3.setText(".");
        jPanelEquipo1.add(lbl3);
        lbl3.setBounds(100, 140, 15, 20);

        lbl4.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl4.setForeground(new java.awt.Color(0, 0, 255));
        lbl4.setText(".");
        jPanelEquipo1.add(lbl4);
        lbl4.setBounds(130, 150, 15, 20);

        lbl5.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl5.setForeground(new java.awt.Color(0, 0, 255));
        lbl5.setText(".");
        jPanelEquipo1.add(lbl5);
        lbl5.setBounds(160, 150, 15, 20);

        lbl6.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl6.setForeground(new java.awt.Color(0, 0, 255));
        lbl6.setText(".");
        jPanelEquipo1.add(lbl6);
        lbl6.setBounds(40, 200, 15, 20);

        lbl7.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl7.setForeground(new java.awt.Color(0, 0, 255));
        lbl7.setText(".");
        jPanelEquipo1.add(lbl7);
        lbl7.setBounds(70, 200, 15, 20);

        lbl8.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl8.setForeground(new java.awt.Color(0, 0, 255));
        lbl8.setText(".");
        jPanelEquipo1.add(lbl8);
        lbl8.setBounds(100, 200, 15, 20);

        lbl9.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl9.setForeground(new java.awt.Color(0, 0, 255));
        lbl9.setText(".");
        jPanelEquipo1.add(lbl9);
        lbl9.setBounds(130, 200, 15, 20);

        lbl10.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl10.setForeground(new java.awt.Color(0, 0, 255));
        lbl10.setText(".");
        jPanelEquipo1.add(lbl10);
        lbl10.setBounds(160, 200, 15, 20);

        lbl11.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl11.setForeground(new java.awt.Color(0, 0, 255));
        lbl11.setText(".");
        jPanelEquipo1.add(lbl11);
        lbl11.setBounds(40, 270, 15, 20);

        lbl12.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl12.setForeground(new java.awt.Color(0, 0, 255));
        lbl12.setText(".");
        jPanelEquipo1.add(lbl12);
        lbl12.setBounds(70, 260, 15, 20);

        lbl13.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl13.setForeground(new java.awt.Color(0, 0, 255));
        lbl13.setText(".");
        jPanelEquipo1.add(lbl13);
        lbl13.setBounds(100, 250, 15, 20);

        lbl14.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl14.setForeground(new java.awt.Color(0, 0, 255));
        lbl14.setText(".");
        jPanelEquipo1.add(lbl14);
        lbl14.setBounds(130, 260, 15, 20);

        lbl15.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl15.setForeground(new java.awt.Color(0, 0, 255));
        lbl15.setText(".");
        jPanelEquipo1.add(lbl15);
        lbl15.setBounds(160, 270, 15, 20);

        lbl22.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        lbl22.setForeground(new java.awt.Color(0, 0, 255));
        lbl22.setText(".");
        jPanelEquipo1.add(lbl22);
        lbl22.setBounds(100, 310, 15, 20);

        lblFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/simulador/resources/img/campo2.png"))); // NOI18N
        jPanelEquipo1.add(lblFondo2);
        lblFondo2.setBounds(10, 90, 200, 280);

        lblGol.setText("Goles:");
        jPanelEquipo1.add(lblGol);
        lblGol.setBounds(220, 70, 50, 14);

        lblPases1.setText("Pases:");
        jPanelEquipo1.add(lblPases1);
        lblPases1.setBounds(220, 220, 60, 14);

        lblContGoles1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContGoles1.setText("0");
        jPanelEquipo1.add(lblContGoles1);
        lblContGoles1.setBounds(230, 90, 30, 50);

        lblContPases1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblContPases1.setText("0");
        jPanelEquipo1.add(lblContPases1);
        lblContPases1.setBounds(230, 240, 30, 60);

        lblBalon1.setIcon(new javax.swing.ImageIcon("C:\\Users\\carlos\\Desktop\\balon.png")); // NOI18N
        lblBalon1.setText("jLabel2");
        jPanelEquipo1.add(lblBalon1);
        lblBalon1.setBounds(200, 300, 90, 80);

        lblChutes1.setText("Chutes:");
        jPanelEquipo1.add(lblChutes1);
        lblChutes1.setBounds(220, 140, 70, 14);

        lblCnChutes1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCnChutes1.setText("0");
        jPanelEquipo1.add(lblCnChutes1);
        lblCnChutes1.setBounds(230, 160, 50, 50);

        lblRanking1.setText("Raking:");
        jPanelEquipo1.add(lblRanking1);
        lblRanking1.setBounds(10, 70, 50, 14);
        jPanelEquipo1.add(lblrkg1);
        lblrkg1.setBounds(60, 70, 70, 20);

        getContentPane().add(jPanelEquipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 290, 380));

        btnJugar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnJugar.setText("Jugar");
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 90, 50));

        btnSalir.setFont(new java.awt.Font("Consolas", 1, 11)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 90, 40));

        lblTiempo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTiempo.setText("Tiempo:");
        getContentPane().add(lblTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 90, 30));

        lblTime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 180, 30));

        lblPartido.setText("Partido a Que");
        getContentPane().add(lblPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 80, 20));

        jLabel2.setText("Corresponde");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel1.setText("Hora");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 30, 20));

        jcmbPartido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Ida", "Vuelta" }));
        getContentPane().add(jcmbPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 90, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "seleccione", "5:00pm", "7:00pm" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 90, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public JComboBox getCmbEquipo1() {
        return cmbEquipo1;
    }

    public JLabel getLblBalon1() {
        return lblBalon1;
    }

    public void setLblBalon1(JLabel lblBalon1) {
        this.lblBalon1 = lblBalon1;
    }

    public JComboBox getCmbEquipo2() {
        return cmbEquipo2;
    }

    public JLabel getLblNarracionEq1() {
        return lblNarracionEq1;
    }

    public void setLblNarracionEq1(JLabel lblNarracionEq1) {
        this.lblNarracionEq1 = lblNarracionEq1;
    }

    public JLabel getLblTime() {
        return lblTime;
    }

    public void setLblTime(JLabel lblTime) {
        this.lblTime = lblTime;
    }

    public void AggListener(ActionListener act) {
        btnJugar.addActionListener(act);
    }

    private void cmbAlineacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlineacionActionPerformed
        if (cmbAlineacion.getSelectedItem() == "5-4-1") {
            ActivateLabelEquipo1();
            lbl1.setVisible(false);
            lbl2.setVisible(false);
            lbl4.setVisible(false);
            lbl5.setVisible(false);
            lbl8.setVisible(false);
        } else if (cmbAlineacion.getSelectedItem() == "4-4-2") {
            ActivateLabelEquipo1();
            lbl13.setVisible(false);
            lbl8.setVisible(false);
            lbl1.setVisible(false);
            lbl3.setVisible(false);
            lbl5.setVisible(false);
        } else if (cmbAlineacion.getSelectedItem() == "3-5-2") {
            ActivateLabelEquipo1();
            lbl11.setVisible(false);
            lbl15.setVisible(false);
            lbl1.setVisible(false);
            lbl3.setVisible(false);
            lbl5.setVisible(false);

        } else if (cmbAlineacion.getSelectedItem() == "4-3-3") {
            ActivateLabelEquipo1();
            lbl13.setVisible(false);
            lbl7.setVisible(false);
            lbl9.setVisible(false);
            lbl1.setVisible(false);
            lbl5.setVisible(false);
        }
    }//GEN-LAST:event_cmbAlineacionActionPerformed
    public void ActivateLabelEquipo1() {
        lbl1.setVisible(true);
        lbl2.setVisible(true);
        lbl3.setVisible(true);
        lbl4.setVisible(true);
        lbl5.setVisible(true);
        lbl6.setVisible(true);
        lbl7.setVisible(true);
        lbl8.setVisible(true);
        lbl9.setVisible(true);
        lbl10.setVisible(true);
        lbl11.setVisible(true);
        lbl12.setVisible(true);
        lbl13.setVisible(true);
        lbl14.setVisible(true);
        lbl15.setVisible(true);
        lbl22.setVisible(true);
    }
    private void cmbAlineacion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAlineacion2ActionPerformed
        if (cmbAlineacion2.getSelectedItem() == "5-4-1") {
            ActivateLabelsEquipo2();
            lbl25.setVisible(false);
            lbl28.setVisible(false);
            lbl29.setVisible(false);
            lbl31.setVisible(false);
            lbl32.setVisible(false);
        } else if (cmbAlineacion2.getSelectedItem() == "4-4-2") {
            ActivateLabelsEquipo2();
            lbl19.setVisible(false);
            lbl25.setVisible(false);
            lbl28.setVisible(false);
            lbl30.setVisible(false);
            lbl32.setVisible(false);
        } else if (cmbAlineacion2.getSelectedItem() == "3-5-2") {
            ActivateLabelsEquipo2();
            lbl17.setVisible(false);
            lbl21.setVisible(false);
            lbl28.setVisible(false);
            lbl30.setVisible(false);
            lbl32.setVisible(false);

        } else if (cmbAlineacion2.getSelectedItem() == "4-3-3") {
            ActivateLabelsEquipo2();
            lbl19.setVisible(false);
            lbl23.setVisible(false);
            lbl27.setVisible(false);
            lbl28.setVisible(false);
            lbl32.setVisible(false);
        }
    }//GEN-LAST:event_cmbAlineacion2ActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed
    public void ActivateLabelsEquipo2() {
        lbl16.setVisible(true);
        lbl17.setVisible(true);
        lbl18.setVisible(true);
        lbl18.setVisible(true);
        lbl19.setVisible(true);
        lbl20.setVisible(true);
        lbl21.setVisible(true);
        lbl23.setVisible(true);
        lbl24.setVisible(true);
        lbl25.setVisible(true);
        lbl26.setVisible(true);
        lbl27.setVisible(true);
        lbl28.setVisible(true);
        lbl29.setVisible(true);
        lbl30.setVisible(true);
        lbl31.setVisible(true);
        lbl32.setVisible(true);

    }

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main dialog = new Main(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cmbAlineacion;
    private javax.swing.JComboBox cmbAlineacion2;
    private javax.swing.JComboBox cmbEquipo1;
    private javax.swing.JComboBox cmbEquipo2;
    private javax.swing.JComboBox jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanelEquipo1;
    private javax.swing.JPanel jPanelEquipo2;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JComboBox jcmbPartido;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblAlineacion;
    private javax.swing.JLabel lblAlineacion2;
    private javax.swing.JLabel lblBalon1;
    private javax.swing.JLabel lblBalon2;
    private javax.swing.JLabel lblChutes1;
    private javax.swing.JLabel lblChutes2;
    private javax.swing.JLabel lblCnChutes1;
    private javax.swing.JLabel lblCnChutes2;
    private javax.swing.JLabel lblContGoles1;
    private javax.swing.JLabel lblContGoles2;
    private javax.swing.JLabel lblContPases1;
    private javax.swing.JLabel lblContPases2;
    private javax.swing.JLabel lblFondo2;
    private javax.swing.JLabel lblFondo3;
    private javax.swing.JLabel lblGol;
    private javax.swing.JLabel lblGoles2;
    private javax.swing.JLabel lblNarracionEq1;
    private javax.swing.JLabel lblNombreEquipo1;
    private javax.swing.JLabel lblNombreEquipo2;
    private javax.swing.JLabel lblPartido;
    private javax.swing.JLabel lblPases;
    private javax.swing.JLabel lblPases1;
    private javax.swing.JLabel lblRanking1;
    private javax.swing.JLabel lblRanking2;
    private javax.swing.JLabel lblRkg2;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lbllogo;
    private javax.swing.JLabel lblrkg1;
    // End of variables declaration//GEN-END:variables
}

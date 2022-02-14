package Principal;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextArea;

/**
 *
 * @author douglas2021
 */
public class Inicio extends javax.swing.JFrame {
    
    
    private controladorInicio control;
    
    public Inicio() {
        initComponents();
        control = new controladorInicio(this);
    }

    public JTextArea getAreaEntrada() {
        return areaEntrada;
    }

    public void setAreaEntrada(JTextArea areaEntrada) {
        this.areaEntrada = areaEntrada;
    }

    public JButton getEvaluar() {
        return evaluar;
    }

    public void setEvaluar(JButton evaluar) {
        this.evaluar = evaluar;
    }

    public JPanel getPanelEntrada() {
        return panelEntrada;
    }

    public void setPanelEntrada(JPanel panelEntrada) {
        this.panelEntrada = panelEntrada;
    }

    public JPanel getPanelResultado() {
        return panelResultado;
    }

    public void setPanelResultado(JPanel panelResultado) {
        this.panelResultado = panelResultado;
    }

    public JTable getTablaResultados() {
        return tablaResultados;
    }

    public void setTablaResultados(JTable tablaResultados) {
        this.tablaResultados = tablaResultados;
    }

    public JLabel getCincoV() {
        return cincoV;
    }

    public JLabel getCuatroV() {
        return cuatroV;
    }

    public JLabel getDosV() {
        return dosV;
    }

    public JLabel getTresV() {
        return tresV;
    }

    public JLabel getUnaV() {
        return unaV;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        implementacion = new javax.swing.JTabbedPane();
        panelEntrada = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaEntrada = new javax.swing.JTextArea();
        evaluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        panelResultado = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaResultados = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        unaV = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dosV = new javax.swing.JLabel();
        tresV = new javax.swing.JLabel();
        cuatroV = new javax.swing.JLabel();
        cincoV = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ejercicio 2 Analisis");

        areaEntrada.setColumns(20);
        areaEntrada.setRows(5);
        jScrollPane1.setViewportView(areaEntrada);

        evaluar.setText("Evaluar");
        evaluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                evaluarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese el texto");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout panelEntradaLayout = new javax.swing.GroupLayout(panelEntrada);
        panelEntrada.setLayout(panelEntradaLayout);
        panelEntradaLayout.setHorizontalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEntradaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(evaluar)
                .addGap(17, 17, 17))
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        panelEntradaLayout.setVerticalGroup(
            panelEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEntradaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(evaluar)
                .addGap(14, 14, 14))
        );

        implementacion.addTab("Entrada", panelEntrada);

        tablaResultados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablaResultados);

        jLabel3.setText("Una");

        jLabel5.setText("Dos");

        jLabel6.setText("Tres");

        jLabel7.setText("Cuatro");

        jLabel8.setText("Cinco");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel5)
                                .addGap(81, 81, 81)
                                .addComponent(jLabel6)
                                .addGap(105, 105, 105))
                            .addGroup(panelResultadoLayout.createSequentialGroup()
                                .addComponent(unaV, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(dosV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(tresV, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)))
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cuatroV, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cincoV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(unaV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tresV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cuatroV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cincoV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dosV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        implementacion.addTab("Resultado", panelResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(implementacion, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(implementacion, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void evaluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_evaluarActionPerformed
        //accion de evaluar area de texto
        control.evaluar();
        //System.out.println("Ingreso a evaluar");
        this.implementacion.setSelectedIndex(1);
        
    }//GEN-LAST:event_evaluarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:\
        this.implementacion.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaEntrada;
    private javax.swing.JLabel cincoV;
    private javax.swing.JLabel cuatroV;
    private javax.swing.JLabel dosV;
    private javax.swing.JButton evaluar;
    private javax.swing.JTabbedPane implementacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelEntrada;
    private javax.swing.JPanel panelResultado;
    private javax.swing.JTable tablaResultados;
    private javax.swing.JLabel tresV;
    private javax.swing.JLabel unaV;
    // End of variables declaration//GEN-END:variables
}

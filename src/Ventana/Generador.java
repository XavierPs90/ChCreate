package Ventana;

import Clase.Personaje;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Xavi
 */
public class Generador extends javax.swing.JFrame 
{
    public Generador() {
        
        initComponents();
        setLocationRelativeTo(null);
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Cultura");
        model.addColumn("Elemento");
        model.addColumn("Estilo");
        model.addColumn("Profesión");
        model.addColumn("Raza");
        
        Personaje p1 = new Personaje();
        model.addRow(p1.matriz());
        t_datos.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_muestra_personajes = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        btn_generar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_titulo.setText("Generador de personajes ");

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_datos);

        btn_generar.setText("Generar");
        btn_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_generarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.setMaximumSize(new java.awt.Dimension(71, 23));
        btn_salir.setMinimumSize(new java.awt.Dimension(71, 23));
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jp_muestra_personajesLayout = new javax.swing.GroupLayout(jp_muestra_personajes);
        jp_muestra_personajes.setLayout(jp_muestra_personajesLayout);
        jp_muestra_personajesLayout.setHorizontalGroup(
            jp_muestra_personajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_muestra_personajesLayout.createSequentialGroup()
                .addGroup(jp_muestra_personajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_muestra_personajesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_muestra_personajesLayout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(btn_generar)
                        .addGap(43, 43, 43)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_muestra_personajesLayout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(lbl_titulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jp_muestra_personajesLayout.setVerticalGroup(
            jp_muestra_personajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_muestra_personajesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_titulo)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jp_muestra_personajesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_generar)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_muestra_personajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 3, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_muestra_personajes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_generarActionPerformed
        System.out.println("paso 0 ir a los metodos");
        Personaje p1 = new Personaje();
        p1.modificar_datos();
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cultura");
        model.addColumn("Elemento");
        model.addColumn("Estilo");
        model.addColumn("Profesión");
        model.addColumn("Raza");
        model.addRow(p1.matriz());
        t_datos.setModel(model);
        
        System.out.println("paso 6 ");
    }//GEN-LAST:event_btn_generarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Generador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_generar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jp_muestra_personajes;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JTable t_datos;
    // End of variables declaration//GEN-END:variables
}

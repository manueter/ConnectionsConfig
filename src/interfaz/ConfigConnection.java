package interfaz;

import control.ControlConfigConnection;
import control.VistaConfigConnection;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mneter
 */
public class ConfigConnection extends javax.swing.JFrame implements VistaConfigConnection
{
    ControlConfigConnection controlador;
    
    public ConfigConnection() 
    {
        initComponents();
        controlador = new ControlConfigConnection(this);
        controlador.cargarMotoresDisponibles();
        this.setTitle("Configurar conexion");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_server = new javax.swing.JTextField();
        txt_database = new javax.swing.JTextField();
        txt_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_set = new javax.swing.JButton();
        sp_port = new javax.swing.JSpinner();
        btn_try_connection = new javax.swing.JButton();
        txt_pwd = new javax.swing.JPasswordField();
        cb_motores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txt_server.setText("localhost");

        txt_database.setText("prueba");

        txt_user.setText("sa");

        jLabel1.setText("Motor");

        jLabel2.setText("Server");

        jLabel3.setText("Port");

        jLabel4.setText("Database");

        jLabel5.setText("User");

        jLabel6.setText("Password");

        btn_set.setText("SET");
        btn_set.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setActionPerformed(evt);
            }
        });

        btn_try_connection.setText("TRY");
        btn_try_connection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_try_connectionActionPerformed(evt);
            }
        });

        cb_motores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_motores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_motoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_try_connection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_set))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_server, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_user)
                            .addComponent(txt_database, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sp_port)
                            .addComponent(txt_pwd, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(cb_motores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_motores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_server, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sp_port, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_database, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txt_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_set)
                    .addComponent(btn_try_connection))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_setActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setActionPerformed

        Object m = this.cb_motores.getSelectedItem();
        String motor_txt = "";
        if(m!=null) motor_txt = m.toString();
        
        String server_txt = this.txt_server.getText();
        String database_txt=this.txt_database.getText();
        int port = (Integer)this.sp_port.getValue();
        String user_txt = this.txt_user.getText();
        char[] pss = this.txt_pwd.getPassword();
        
        controlador.setConnection(motor_txt, server_txt, port, database_txt, user_txt, pss);
    }//GEN-LAST:event_btn_setActionPerformed

    private void btn_try_connectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_try_connectionActionPerformed
        controlador.setTrying(true);
        btn_setActionPerformed(evt);
        controlador.tryConnection();
    }//GEN-LAST:event_btn_try_connectionActionPerformed

    private void obtainParameters()
    {}
    
    private void cb_motoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_motoresActionPerformed
        // TODO add your handling code here:
        if(this.cb_motores.getSelectedItem()!=null)
        {
           String motor = this.cb_motores.getSelectedItem().toString();
           controlador.setMotor(motor);
        }
    }//GEN-LAST:event_cb_motoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_set;
    private javax.swing.JButton btn_try_connection;
    private javax.swing.JComboBox<String> cb_motores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSpinner sp_port;
    private javax.swing.JTextField txt_database;
    private javax.swing.JPasswordField txt_pwd;
    private javax.swing.JTextField txt_server;
    private javax.swing.JTextField txt_user;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mostrarMotoresDisponibles(ArrayList<String> motores)
    {
        DefaultComboBoxModel<String> model =(DefaultComboBoxModel)this.cb_motores.getModel();
        model.removeAllElements();
        model.addAll(motores);    
    }
    @Override
    public void clearOptions() 
    {
        //this.
    }

    @Override
    public void error(String msg) 
    {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void showMessage(String msg)
    {
        JOptionPane.showMessageDialog(this, msg);
    }

    @Override
    public void cargarPuertoXDefecto(int puerto) 
    {
        this.sp_port.setValue(puerto);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import Datos.Empleado;
import Datos.Empresa;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author dani
 */
public class PanelModificaciones extends javax.swing.JPanel {

    Empresa email;//nos definimos el atributo para recibir la empresa
    private DefaultListModel modelo;

    /**
     * Creates new form PanelModificaciones
     */
    public PanelModificaciones(Empresa email) {//el constructor recibe los datos de la empresa(para poder acceder a los empleados)
        //instanciamos el modelo
        modelo = new DefaultListModel();
        this.email = email;
        initComponents();//declaracion e instancia de los elementos que forman el panel(jList, jText, etc...)
        cargarEmpleados();

    }

    /**
     * Metodo para cargar los empleados y visualizarlos en el jList
     */
    private void cargarEmpleados() {
        ArrayList<Empleado> misempleados = email.getMisEmpleados();
        for (int e = 0; e < misempleados.size(); e++) {
            modelo.addElement(misempleados.get(e));//si no añadimos el metodo toString en el empleado, para que nos devuelva el nombre, nos saldria la posicion en la que se guarda la informacion del empleado
            //si le añadimos .getNombre  a modelo.addElement(misempleados.get(e)); nos mostraria el nombre, pero a la hora de trabajar con ese empleado, solo tendria mos el nombre, no toda su informacion 
        }
        lstEmpleados.setModel(modelo);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmpleados = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtIdentificador = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pwdContra = new javax.swing.JPasswordField();
        cmbTipoUsuario = new javax.swing.JComboBox();
        btnGrabar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        lstEmpleados.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEmpleadosValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEmpleados);

        jLabel1.setText("Identificador");

        jLabel2.setText("Login");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Nombre");

        txtIdentificador.setEnabled(false);

        txtLogin.setEnabled(false);

        jLabel5.setText("Tipo de Usuario");

        cmbTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario", "Administrador" }));

        btnGrabar.setText("GRABAR");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        btnBorrar.setText("ELIMINAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("MODIFICACION DE USUARIOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(txtIdentificador)
                            .addComponent(pwdContra)
                            .addComponent(txtNombre))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrar)
                            .addComponent(btnGrabar))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(pwdContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnGrabar)
                                .addGap(57, 57, 57)
                                .addComponent(btnBorrar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    
    /**
     * el jList actua cuando se seleccione un dato en el jList
     * boton secundario en el jList --> Events--> ListSelection--> ValueChanged
     *
     * @param evt
     */
    private void lstEmpleadosValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEmpleadosValueChanged
        // TODO add your handling code here:

        int posicion = lstEmpleados.getSelectedIndex();
        Empleado e = (Empleado) modelo.get(posicion);//Estamos trabajando con un objeto(Empleado)
        
        txtIdentificador.setText(String.valueOf(e.getIdentificador()));//el identificador es un numero, por lo que hay qeu convertirlo a string
        txtLogin.setText(e.getLogin());
        pwdContra.setText(e.getPass());
        txtNombre.setText(e.getNombre());
        cmbTipoUsuario.setSelectedIndex(e.getTipoUsuario());
        
        //en tiempo de diseño desseleccionar la propiedad enabled de identificador y login, porque son los unicos valores que no se van a editar nunca
    }//GEN-LAST:event_lstEmpleadosValueChanged

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:
        
        int indice = lstEmpleados.getSelectedIndex();
        Empleado e = (Empleado) modelo.get(indice);//Estamos trabajando con un objeto(Empleado)
        
        boolean resultado=email.eliminarEmpleado(e);
        if(resultado){
            JOptionPane.showMessageDialog(this,"EMPLEADO ELIMINADO");
            lstEmpleados.setSelectedIndex(0);
        }else{
            JOptionPane.showMessageDialog(this,"EL EMPLEADO NO SE HA PODIDO ELIMINAR");
        }
        modelo.remove(indice);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        // TODO add your handling code here:
        int indice =lstEmpleados.getSelectedIndex();
        int pos=email.buscarEmpleadoLogin(txtLogin.getText());
        if (pos==1){
            JOptionPane.showMessageDialog(this," EMPLEADO INEXSISTENTE");
        }else{
            email.getMisEmpleados().get(pos);
        }
    }//GEN-LAST:event_btnGrabarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox cmbTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstEmpleados;
    private javax.swing.JPasswordField pwdContra;
    private javax.swing.JTextField txtIdentificador;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
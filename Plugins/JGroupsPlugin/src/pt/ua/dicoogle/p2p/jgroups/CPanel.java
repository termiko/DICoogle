/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CPanel.java
 *
 * Created on 6/Jul/2011, 23:58:52
 */
package pt.ua.dicoogle.p2p.jgroups;

import java.util.ArrayList;
import javax.swing.JPanel;
import net.xeoh.plugins.base.annotations.PluginImplementation;
import pt.ua.dicoogle.p2p.jgroups.Utils.NetworkInterfacesManager;
import pt.ua.dicoogle.sdk.Utils.PluginPanel;



/**
 *
 * @author Carlos Ferreira
 */
@PluginImplementation
public class CPanel extends JPanel implements PluginPanel
{
    private NetworkInterfacesManager NIM = new NetworkInterfacesManager();
    
    /** Creates new form CPanel */
    public CPanel()
    {
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(300, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Multicast Interface");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Group Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, 0, 151, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jComboBox1ActionPerformed
    {//GEN-HEADEREND:event_jComboBox1ActionPerformed

        /* try         {         networkInterfaces.setNetworkInterface((String) this.jComboBox1.getSelectedItem());         } catch (RemoteException ex)         {         Logger.getLogger(Services.class.getName()).log(Level.SEVERE, null, ex);         }*/     }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables


    public ArrayList<Object> getProperties()
    {
        ArrayList<Object> props = new ArrayList<Object>();
        props.add(this.NIM.getInterfaceAddress((String) this.jComboBox1.getSelectedItem()));
        props.add(this.jTextField1.getText());
        //props.add(this.jSlider1.getValue());
        //props.add(this.jComboBoxMatrixThumbnails.getSelectedItem());
        //props.add(this.jCheckBox1.isSelected());
        //props.add(this.jCheckBox2.isSelected());
        return props;
    }

    public void initialize(ArrayList<Object> al)
    {
        initComponents();
        this.jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(this.NIM.getNetworkInterfaces().toArray()));
        this.jTextField1.setText((String) al.get(1));
        /*this.jSlider1.setValue((Integer) al.get(0));
        this.jComboBoxMatrixThumbnails.setSelectedItem(al.get(1));
        this.jCheckBox1.setSelected((Boolean) al.get(2));
        this.jCheckBox2.setSelected((Boolean) al.get(3));*/
    }

    public String getPluginName()
    {
        return MulticastPlugin.PluginName;
    }
    
}

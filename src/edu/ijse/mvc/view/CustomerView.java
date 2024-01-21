package edu.ijse.mvc.view;

import edu.ijse.mvc.controler.CustomerControler;
import edu.ijse.mvc.dto.CustomerDto;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomerView extends javax.swing.JFrame {

    private CustomerControler customerControler;

    public CustomerView() throws Exception {
        this.customerControler = new CustomerControler();
        initComponents();
        showCustomers();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLable = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        custId = new javax.swing.JLabel();
        custText = new javax.swing.JTextField();
        custId1 = new javax.swing.JLabel();
        custDobText = new javax.swing.JTextField();
        custTitle = new javax.swing.JLabel();
        custTitleText = new javax.swing.JTextField();
        custId3 = new javax.swing.JLabel();
        custNameText = new javax.swing.JTextField();
        custId4 = new javax.swing.JLabel();
        custCityText = new javax.swing.JTextField();
        custId2 = new javax.swing.JLabel();
        custSalaryText = new javax.swing.JTextField();
        custId5 = new javax.swing.JLabel();
        custProvinceText = new javax.swing.JTextField();
        custTitle1 = new javax.swing.JLabel();
        custAddressText = new javax.swing.JTextField();
        custId6 = new javax.swing.JLabel();
        custZipText = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        showData = new javax.swing.JTable();
        custSave1 = new javax.swing.JButton();
        btnUpdate1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLable.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLable.setText("Manage Customers");

        custId.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId.setText("Cust ID :");

        custText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custTextActionPerformed(evt);
            }
        });

        custId1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId1.setText("Cust DOB :");

        custDobText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custDobTextActionPerformed(evt);
            }
        });

        custTitle.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custTitle.setText("Cust Title :");

        custTitleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custTitleTextActionPerformed(evt);
            }
        });

        custId3.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId3.setText("Cust Name :");

        custNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custNameTextActionPerformed(evt);
            }
        });

        custId4.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId4.setText("Cust City :");

        custCityText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custCityTextActionPerformed(evt);
            }
        });

        custId2.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId2.setText("Cust Salary :");

        custSalaryText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSalaryTextActionPerformed(evt);
            }
        });

        custId5.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId5.setText("Cust Province :");

        custProvinceText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProvinceTextActionPerformed(evt);
            }
        });

        custTitle1.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custTitle1.setText("Cust Address :");

        custAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custAddressTextActionPerformed(evt);
            }
        });

        custId6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        custId6.setText("Cust Zip :");

        custZipText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custZipTextActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        showData.setModel(new javax.swing.table.DefaultTableModel(
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
        showData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        showData.setEditingColumn(0);
        showData.setEditingRow(0);
        showData.setShowGrid(false);
        showData.setUpdateSelectionOnSort(false);
        showData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showData);

        custSave1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        custSave1.setText("Save");
        custSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custSave1ActionPerformed(evt);
            }
        });

        btnUpdate1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(custId3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(custId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(custTitle)
                                    .addComponent(custId, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custDobText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(103, 103, 103)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(custId4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(custId5)
                                            .addComponent(custTitle1))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(custZipText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(custId6)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(custId2)
                                .addGap(37, 37, 37)
                                .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custSave1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(titleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId)
                            .addComponent(custText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custTitle)
                            .addComponent(custTitleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId3)
                            .addComponent(custNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId1)
                            .addComponent(custDobText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custTitle1)
                            .addComponent(custAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId4)
                            .addComponent(custCityText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId5)
                            .addComponent(custProvinceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId6)
                            .addComponent(custZipText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(custId2)
                            .addComponent(custSalaryText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdate1)
                                .addComponent(custSave1)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custTextActionPerformed

    private void custDobTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custDobTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custDobTextActionPerformed

    private void custTitleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custTitleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custTitleTextActionPerformed

    private void custNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custNameTextActionPerformed

    private void custCityTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custCityTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custCityTextActionPerformed

    private void custSalaryTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSalaryTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custSalaryTextActionPerformed

    private void custProvinceTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProvinceTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custProvinceTextActionPerformed

    private void custAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custAddressTextActionPerformed

    private void custZipTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custZipTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custZipTextActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void showDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDataMouseClicked
        // TODO add your handling code here:
        searchCustomer();
    }//GEN-LAST:event_showDataMouseClicked

    private void custSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custSave1ActionPerformed
        saveCustomer();
    }//GEN-LAST:event_custSave1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed
        updateCustomer();
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CustomerView().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate1;
    private javax.swing.JTextField custAddressText;
    private javax.swing.JTextField custCityText;
    private javax.swing.JTextField custDobText;
    private javax.swing.JLabel custId;
    private javax.swing.JLabel custId1;
    private javax.swing.JLabel custId2;
    private javax.swing.JLabel custId3;
    private javax.swing.JLabel custId4;
    private javax.swing.JLabel custId5;
    private javax.swing.JLabel custId6;
    private javax.swing.JTextField custNameText;
    private javax.swing.JTextField custProvinceText;
    private javax.swing.JTextField custSalaryText;
    private javax.swing.JButton custSave1;
    private javax.swing.JTextField custText;
    private javax.swing.JLabel custTitle;
    private javax.swing.JLabel custTitle1;
    private javax.swing.JTextField custTitleText;
    private javax.swing.JTextField custZipText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable showData;
    private javax.swing.JLabel titleLable;
    // End of variables declaration//GEN-END:variables

    private void saveCustomer() {
        CustomerDto dto = new CustomerDto();
        dto.setCustId(custText.getText());
        dto.setTitle(custTitleText.getText());
        dto.setName(custNameText.getText());
        dto.setDob(custDobText.getText());
        dto.setSalary(Double.parseDouble(custSalaryText.getText()));
        dto.setAddress(custAddressText.getText());
        dto.setCity(custCityText.getText());
        dto.setProvince(custProvinceText.getText());
        dto.setZip(custZipText.getText());

        try {
            String result = customerControler.saveCustomer(dto);
            System.out.println(result);
            JOptionPane.showMessageDialog(this, result);
            showCustomers();
            clear();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void clear() {
        custText.setText("");
        custNameText.setText("");
        custTitleText.setText("");
        custAddressText.setText("");
        custDobText.setText("");
        custSalaryText.setText("");
        custProvinceText.setText("");
        custCityText.setText("");
        custZipText.setText("");
    }

    private void showCustomers() throws Exception {
        try {
                
                String[] column = {"CustID", "CustName", "DOB", "salary", "City", "Province", "PostalCode"};
                DefaultTableModel model = new DefaultTableModel(column, 0) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        return false;
                    }
                    
                };
                
                showData.setModel(model);
                
                ArrayList<CustomerDto> customerDtos = customerControler.getAllCustomers();

            for (CustomerDto customerDto : customerDtos) {
                Object[] rowData = {customerDto.getCustId(), customerDto.getTitle() + " " + customerDto.getName(),
                    customerDto.getAddress() + ", " + customerDto.getCity(), customerDto.getSalary(), customerDto.getZip()};
                model.addRow(rowData);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void searchCustomer() {
        String id = showData.getValueAt(showData.getSelectedRow(), 0).toString();

        try {
            CustomerDto customerDto = customerControler.searchCustomer(id);

            if (customerDto != null) {
                custText.setText(customerDto.getCustId());
                custNameText.setText(customerDto.getName());
                custTitleText.setText(customerDto.getTitle());
                custAddressText.setText(customerDto.getAddress());
                custDobText.setText(customerDto.getDob());
                custSalaryText.setText(Double.toString(customerDto.getSalary()));
                custProvinceText.setText(customerDto.getProvince());
                custCityText.setText(customerDto.getCity());
                custZipText.setText(customerDto.getZip());
            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updateCustomer() {
         
            CustomerDto customerDto = new CustomerDto();
            customerDto.setCustId(custText.getText());
            customerDto.setTitle(custTitleText.getText());
            customerDto.setName(custNameText.getText());
            customerDto.setDob(custDobText.getText());
            customerDto.setSalary(Double.parseDouble(custSalaryText.getText()));
            customerDto.setAddress(custAddressText.getText());
            customerDto.setCity(custCityText.getText());
            customerDto.setProvince(custProvinceText.getText());
            customerDto.setZip(custZipText.getText());
        try{
            String resp = customerControler.updateCustomer(customerDto);
            JOptionPane.showMessageDialog(this, resp);
            showCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }

    private void deleteCustomer() {
        try {
            String custId = custText.getText();
            String resp = customerControler.deleteCustomer(custId);
            JOptionPane.showMessageDialog(this, resp);
            showCustomers();
            clear();
        } catch (Exception ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}

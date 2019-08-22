/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.pnl;

import lk.ijse.carRental.controller.BookingController;
import lk.ijse.carRental.controller.CustomerController;
import lk.ijse.carRental.controller.DriverController;
import lk.ijse.carRental.controller.VehicleController;
import lk.ijse.carRental.dto.BookingDTO;
import lk.ijse.carRental.dto.CustomerDTO;
import lk.ijse.carRental.dto.DriverDTO;
import lk.ijse.carRental.dto.MakePaymentDTO;
import lk.ijse.carRental.dto.VehicleDTO;
import lk.ijse.carRental.generater.IDGenerater;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.carRental.model.MakePayment;

/**
 *
 * @author Nethadun PC
 */
public class Bookingpnl extends javax.swing.JPanel {

    /**
     * Creates new form Booking
     */
    public Bookingpnl() {
        initComponents();
        combodriver.setVisible(false);
        labelDriver.setVisible(false);
        lableDriverName.setVisible(false);
        driverbame.setVisible(false);
        setBookingDate();
        loadAllCustomer();
        loadAllVehicle();
        loadAllDriver();
        bookId();
        paymentId();
        clearAll();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelDriver = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        custname = new javax.swing.JTextField();
        txtbookid = new javax.swing.JTextField();
        combocust = new javax.swing.JComboBox<>();
        combovehi = new javax.swing.JComboBox<>();
        checkWith = new javax.swing.JCheckBox();
        checkWithout = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        lableDriverName = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        driverbame = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtdiscount = new javax.swing.JTextField();
        txtpid = new javax.swing.JTextField();
        txtpaid = new javax.swing.JTextField();
        txtamount = new javax.swing.JTextField();
        combodriver = new javax.swing.JComboBox<>();
        calender1 = new com.toedter.calendar.JDateChooser();
        calender2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        txtrent = new javax.swing.JTextField();
        btnProcced = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtmilage = new javax.swing.JTextField();
        txtbalance1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labletotal = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon("D:\\jave nethadun\\carRentManagement\\src\\lk\\ijse\\carRental\\img\\Booking_48px.png")); // NOI18N
        jLabel17.setText("BOOKING & PAYMENT FROM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(349, 349, 349)
                .addComponent(jLabel17)
                .addContainerGap(402, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 77));

        jLabel1.setText("CUSTOMER ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 110, 20));

        jLabel2.setText("BOOK START DATE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, 30));

        jLabel3.setText("BOOK END DATE");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 160, 30));

        jLabel4.setText("BOOK TYPE ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 100, 20));

        jLabel5.setText("BOOK ID");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 160, 20));

        labelDriver.setText("DRIVER ID");
        add(labelDriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 160, 20));

        jLabel8.setText("RENT FOR DATE");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 160, 20));

        jLabel9.setText("VEHICLE ID");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 160, 20));

        custname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        custname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custnameActionPerformed(evt);
            }
        });
        add(custname, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 180, -1));

        txtbookid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtbookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookidActionPerformed(evt);
            }
        });
        add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 140, -1));

        combocust.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combocustItemStateChanged(evt);
            }
        });
        combocust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocustActionPerformed(evt);
            }
        });
        add(combocust, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 140, -1));

        combovehi.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combovehiItemStateChanged(evt);
            }
        });
        add(combovehi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 180, -1));

        checkWith.setText("WITH DRIVER");
        checkWith.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                checkWithStateChanged(evt);
            }
        });
        checkWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWithActionPerformed(evt);
            }
        });
        add(checkWith, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 120, -1));

        checkWithout.setText("WITH OUT DRIVER");
        checkWithout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWithoutActionPerformed(evt);
            }
        });
        add(checkWithout, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 51));
        jLabel11.setText("+");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 20, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOK ID", "CUSTOMER ID", "VEHICLE ID", "RENT FOR DATE", "BALANCE"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 640, 340));

        jLabel10.setText("PAID RS");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 90, 20));

        lableDriverName.setText("DRIVER NAME");
        add(lableDriverName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 160, 20));

        jLabel13.setText("AMOUNT");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 530, 90, 20));

        jLabel14.setText("BALANCE");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, 90, 20));

        driverbame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        driverbame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                driverbameActionPerformed(evt);
            }
        });
        add(driverbame, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 180, -1));

        jLabel15.setText("PAYMET ID");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 490, 80, 20));

        txtdiscount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtdiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiscountActionPerformed(evt);
            }
        });
        add(txtdiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 210, -1));

        txtpid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpidActionPerformed(evt);
            }
        });
        add(txtpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 490, 210, -1));

        txtpaid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpaidActionPerformed(evt);
            }
        });
        add(txtpaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 210, -1));

        txtamount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtamount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamountActionPerformed(evt);
            }
        });
        add(txtamount, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, 210, -1));

        combodriver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodriverActionPerformed(evt);
            }
        });
        add(combodriver, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 180, -1));

        calender1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calender1MouseClicked(evt);
            }
        });
        add(calender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));

        calender2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                calender2MouseEntered(evt);
            }
        });
        add(calender2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, 30));

        jLabel6.setText("CUSTOMER NAME");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 20));

        txtrent.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtrent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtrentActionPerformed(evt);
            }
        });
        add(txtrent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 180, -1));

        btnProcced.setBackground(new java.awt.Color(255, 204, 51));
        btnProcced.setText("PROCEED");
        btnProcced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProccedActionPerformed(evt);
            }
        });
        add(btnProcced, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 570, 90, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setText("CLEAR");
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 610, 90, -1));

        jLabel16.setText("START MILEGE");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 160, 20));

        txtmilage.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtmilage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmilageActionPerformed(evt);
            }
        });
        add(txtmilage, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 520, 180, -1));

        txtbalance1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(153, 153, 153), new java.awt.Color(153, 153, 153)));
        txtbalance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalance1ActionPerformed(evt);
            }
        });
        add(txtbalance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 650, 210, -1));

        jLabel12.setText("DISCOUNT %");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 570, 90, 20));

        jLabel7.setFont(new java.awt.Font("Thibus29STru", 1, 14)); // NOI18N
        jLabel7.setText("SUB  TOTAL");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, 110, 30));

        labletotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labletotal.setText("0000.00");
        add(labletotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 520, 90, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void custnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custnameActionPerformed

    private void txtbookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookidActionPerformed
        combocust.requestFocus();
    }//GEN-LAST:event_txtbookidActionPerformed

    private void checkWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWithActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWithActionPerformed

    private void checkWithoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWithoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkWithoutActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked

    }//GEN-LAST:event_jLabel11MouseClicked

    private void driverbameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_driverbameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_driverbameActionPerformed

    private void txtdiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiscountActionPerformed
        double subamount = Double.parseDouble(txtamount.getText());
        int discount = Integer.parseInt(txtdiscount.getText());

        double subTotal = (100 - discount) * subamount / 100;
        labletotal.setText(subTotal + "");
        txtpaid.requestFocus();
    }//GEN-LAST:event_txtdiscountActionPerformed

    private void txtpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpidActionPerformed
        Date startDate = calender1.getDate();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        String startDateString = dateFormat1.format(startDate);
        Date endDate = calender2.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String endDateString = dateFormat.format(endDate);
        double rentForDate=Double.parseDouble(txtrent.getText());

        LocalDate fromDate = startDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate toDate = endDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int days = Period.between(fromDate, toDate).getDays()+1;
        double amount=rentForDate* days;
        double driver=1500*days;
        if (checkWith.isSelected()) {
                txtamount.setText((amount+driver)+"");
                txtamount.requestFocus();
            } else {
                txtamount.setText(amount+"");
                txtamount.requestFocus();
            }
        
        
    }//GEN-LAST:event_txtpidActionPerformed

    private void txtpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpaidActionPerformed
        double paid = Double.parseDouble(txtpaid.getText());
        double payable = Double.parseDouble(labletotal.getText());

        if (paid >= payable) {
            double balance = paid - payable;
            txtbalance1.setText(balance + "");
            btnProcced.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Enough Credit..!");
        }
    }//GEN-LAST:event_txtpaidActionPerformed

    private void txtamountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamountActionPerformed
        txtdiscount.requestFocus();
    }//GEN-LAST:event_txtamountActionPerformed

    private void checkWithStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_checkWithStateChanged
        if (checkWith.isSelected()) {
            combodriver.setVisible(true);
            labelDriver.setVisible(true);
            lableDriverName.setVisible(true);
            driverbame.setVisible(true);
        } else {
            combodriver.setVisible(false);
            labelDriver.setVisible(false);
            lableDriverName.setVisible(false);
            driverbame.setVisible(false);
        }

    }//GEN-LAST:event_checkWithStateChanged

    private void txtrentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtrentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtrentActionPerformed

    private void btnProccedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProccedActionPerformed
        try {
            String bookId = txtbookid.getText();
            String custId = combocust.getSelectedItem().toString();
            Date startDate = calender1.getDate();
            SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
            String startDateString = dateFormat1.format(startDate);
            Date endDate = calender2.getDate();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String endDateString = dateFormat.format(endDate);
            String vehicleId = combovehi.getSelectedItem().toString();
            double rentForDate = Double.parseDouble(txtrent.getText());
            String bookType = null;
            if (checkWith.isSelected()) {
                bookType = "with driver";
            } else {
                bookType = "without driver";
            }
            String driverId = combodriver.getSelectedItem().toString();
            int milege = Integer.parseInt(txtmilage.getText());
            String paymentId = txtpid.getText();
            double amount = Double.parseDouble(txtamount.getText());
            int discount = Integer.parseInt(txtdiscount.getText());
            double balance = Double.parseDouble(labletotal.getText());
            MakePayment makePayment = new MakePayment(paymentId, bookId, amount, discount, balance);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            Object[] rowData = {bookId, custId, vehicleId, rentForDate, balance};
            model.addRow(rowData);

            BookingDTO book = new BookingDTO(bookId, custId, startDateString, endDateString, vehicleId, bookType, driverId, milege, makePayment);

            BookingController.booking(book);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnProccedActionPerformed

    private void combocustItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combocustItemStateChanged
        try {
            String custId = combocust.getSelectedItem().toString();
            CustomerDTO searchCustomer = CustomerController.searchCustomer(custId);
            custname.setText(searchCustomer.getCust_Name());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combocustItemStateChanged

    private void txtmilageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmilageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmilageActionPerformed

    private void combodriverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodriverActionPerformed
        try {
            String driverId = combodriver.getSelectedItem().toString();
            DriverDTO searchDriver = DriverController.searchDriver(driverId);
            driverbame.setText(searchDriver.getDriver_Name());
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combodriverActionPerformed

    private void combovehiItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combovehiItemStateChanged
        try {
            String vehicleId = combovehi.getSelectedItem().toString();
            VehicleDTO searchVehicle = VehicleController.searchVehicle(vehicleId);
            txtrent.setText(searchVehicle.getRent() + "");
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combovehiItemStateChanged

    private void txtbalance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalance1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalance1ActionPerformed

    private void combocustActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocustActionPerformed
        calender1.requestFocus();
    }//GEN-LAST:event_combocustActionPerformed

    private void calender1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calender1MouseClicked
        calender2.requestFocus();
    }//GEN-LAST:event_calender1MouseClicked

    private void calender2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calender2MouseEntered
        combovehi.requestFocus();
    }//GEN-LAST:event_calender2MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcced;
    private com.toedter.calendar.JDateChooser calender1;
    private com.toedter.calendar.JDateChooser calender2;
    private javax.swing.JCheckBox checkWith;
    private javax.swing.JCheckBox checkWithout;
    private javax.swing.JComboBox<String> combocust;
    private javax.swing.JComboBox<String> combodriver;
    private javax.swing.JComboBox<String> combovehi;
    private javax.swing.JTextField custname;
    private javax.swing.JTextField driverbame;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelDriver;
    private javax.swing.JLabel lableDriverName;
    private javax.swing.JLabel labletotal;
    private javax.swing.JTextField txtamount;
    private javax.swing.JTextField txtbalance1;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtdiscount;
    private javax.swing.JTextField txtmilage;
    private javax.swing.JTextField txtpaid;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtrent;
    // End of variables declaration//GEN-END:variables

    private void setBookingDate() {

    }

    private void loadAllCustomer() {
        try {
            combocust.removeAll();
            ArrayList<CustomerDTO> allCustomer = CustomerController.getAllCustomer();
            for (CustomerDTO customerDTO : allCustomer) {
                combocust.addItem(customerDTO.getCust_Id());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllVehicle() {
        try {
            combovehi.removeAll();
            ArrayList<VehicleDTO> allVehicle = VehicleController.getAllVehicle();
            for (VehicleDTO vehicleDTO : allVehicle) {
                combovehi.addItem(vehicleDTO.getVehicle_Id());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void loadAllDriver() {
        try {
            combodriver.removeAll();
            ArrayList<DriverDTO> allDriver = DriverController.getAllDriver();
            for (DriverDTO driverDTO : allDriver) {
                combodriver.addItem(driverDTO.getDriver_Id());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void bookId() {
        try {
            String bookId;
            bookId = IDGenerater.getNewID("booking", "book_Id", "B");
            txtbookid.setText(bookId);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void paymentId() {
        try {
            String paymentId;
            paymentId = IDGenerater.getNewID("makepayment", "payment_Id", "P");
            txtpid.setText(paymentId);
        } catch (SQLException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Bookingpnl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void clearAll() {
        
    }
}

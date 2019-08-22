/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom.impl;

import lk.ijse.carRental.dao.CrudUtill;
import lk.ijse.carRental.dao.custom.MakePaymentDAO;
import lk.ijse.carRental.dto.MakePaymentDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.MakePayment;

/**
 *
 * @author Nethadun PC
 */
public class MakePayemntDAOImpl implements MakePaymentDAO{

    @Override
    public boolean add(MakePaymentDTO a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void curdTest() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(MakePayment t) throws ClassNotFoundException, SQLException {
         return CrudUtill.executeUpdate("insert into makepayment values(?,?,?,?,?)", t.getPayment_Id(),t.getBook_Id(),t.getAmount(),t.getDiscount(),t.getBalance());
    }

    @Override
    public boolean update(MakePayment t) throws ClassNotFoundException, SQLException {
         return CrudUtill.executeUpdate("update makepayment set book_Id=?,amount=?,discount=?,balance=? where payment_Id=?", t.getBook_Id(),t.getAmount(),t.getDiscount(),t.getBalance(),t.getPayment_Id());
    }

    @Override
    public boolean delete(String paymentId) throws ClassNotFoundException, SQLException {
        return CrudUtill.executeUpdate("delete from makepayment where payment_Id=?", paymentId);
    }

    @Override
    public ArrayList<MakePayment> getAll() throws ClassNotFoundException, SQLException {
        ResultSet rst=CrudUtill.executeQuery("select * from makepayment");
        ArrayList<MakePayment>allMakePayments=new ArrayList<>();
        while(rst.next()){
            allMakePayments.add(new MakePayment(rst.getString(1),rst.getString(2),rst.getDouble(3),rst.getInt(4),rst.getDouble(5)));
        }
        return allMakePayments;
    }

    @Override
    public MakePayment search(String t) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void test() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.dao.custom;

import lk.ijse.carRental.dao.CrudDAO;
import lk.ijse.carRental.model.MakePayment;

/**
 *
 * @author Nethadun PC
 */
public interface MakePaymentDAO extends CrudDAO<MakePayment, String>{
    public boolean add(lk.ijse.carRental.dto.MakePaymentDTO a);
}

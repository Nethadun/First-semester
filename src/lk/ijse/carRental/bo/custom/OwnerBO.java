/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom;

import lk.ijse.carRental.bo.SuperBO;
import lk.ijse.carRental.dto.OwnerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public interface OwnerBO extends SuperBO{
    public boolean addOwner(OwnerDTO owne)throws ClassNotFoundException, SQLException;
    public boolean updateOwner(OwnerDTO owne)throws SQLException,ClassNotFoundException;
    public boolean deleteOwner(String ownerId)throws SQLException,ClassNotFoundException;
    public ArrayList<OwnerDTO> getAllOwnner()throws ClassNotFoundException,SQLException;
    public OwnerDTO searchOwner(String ownerId)throws SQLException,ClassNotFoundException;
}

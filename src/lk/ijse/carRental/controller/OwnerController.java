/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.controller;

import lk.ijse.carRental.bo.BOFactory;
import lk.ijse.carRental.bo.custom.OwnerBO;
import lk.ijse.carRental.dto.OwnerDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nethadun PC
 */
public class OwnerController {
    static OwnerBO bo=(OwnerBO) BOFactory.getInstance().getBO(BOFactory.BOTypes.OWNER);
    
    public static boolean addOwner(OwnerDTO owne) throws ClassNotFoundException, SQLException{
        return bo.addOwner(owne);
    }
    public static boolean updateOwner(OwnerDTO owne) throws SQLException, ClassNotFoundException{
        return bo.updateOwner(owne);
    }
    public static boolean deleteOwner(String ownerID) throws SQLException, ClassNotFoundException{
        return bo.deleteOwner(ownerID);
    }
    public static ArrayList<OwnerDTO> getAllOwner() throws ClassNotFoundException, SQLException{
        return bo.getAllOwnner();
    }
    public static OwnerDTO searchOwner(String ownerID)throws SQLException,ClassNotFoundException{
        return bo.searchOwner(ownerID);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.carRental.bo.custom.impl;

import lk.ijse.carRental.bo.custom.OwnerBO;
import lk.ijse.carRental.dao.DAOFactory;
import lk.ijse.carRental.dao.custom.OwnerDAO;
import lk.ijse.carRental.dto.OwnerDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.carRental.model.Owner;

/**
 *
 * @author Nethadun PC
 */
public class OwnerBOImpl implements OwnerBO{
    
    OwnerDAO dao=(OwnerDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOType.OWNER);

    @Override
    public boolean addOwner(OwnerDTO owne) throws ClassNotFoundException, SQLException {
        return dao.add(new Owner(owne.getOwner_Id(),owne.getOwner_Name(),owne.getOwner_Address(),owne.getOwner_NIC(),owne.getOwner_Mob()));
    }

    @Override
    public boolean updateOwner(OwnerDTO owne) throws SQLException, ClassNotFoundException {
        return dao.update(new Owner(owne.getOwner_Id(),owne.getOwner_Name(),owne.getOwner_Address(),owne.getOwner_NIC(),owne.getOwner_Mob()));
    }

    @Override
    public boolean deleteOwner(String ownerId) throws SQLException, ClassNotFoundException {
         return dao.delete(ownerId);
    }

    @Override
    public ArrayList<OwnerDTO> getAllOwnner() throws ClassNotFoundException, SQLException {
        ArrayList<Owner> all=dao.getAll();
        ArrayList<OwnerDTO> allOwner=new ArrayList<>();
        for (Owner owner : all) {
            allOwner.add(new OwnerDTO(owner.getOwner_Id(),owner.getOwner_Name(),owner.getOwner_Address(),owner.getOwner_NIC(),owner.getOwner_Mob()));
        }
        return allOwner;
    }

    @Override
    public OwnerDTO searchOwner(String ownerId) throws SQLException, ClassNotFoundException {
        Owner search=dao.search(ownerId);
        return new OwnerDTO(search.getOwner_Id(),search.getOwner_Name(),search.getOwner_Address(),search.getOwner_NIC(),search.getOwner_Mob());
    }
    
}

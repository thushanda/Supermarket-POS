/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.dto.ItemDto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author thush
 */
public class ItemModel {
    
    Connection conn;
    PreparedStatement statement;

    public ItemDto searchItem(String itemId) throws Exception{
        
        conn = DBConnection.getInstance().getConnection();

        String sql = "SELECT * FROM Item WHERE ItemCode = ?";
        statement = conn.prepareStatement(sql);
        statement.setString(1, itemId);

        ResultSet rst = statement.executeQuery();

        ItemDto dto = null;
        while (rst.next()) {
            dto = new ItemDto();

            dto.setItemCode(rst.getString("ItemCode"));
            dto.setDescription(rst.getString("Description"));
            dto.setPackSize(rst.getString("PackSize"));
            dto.setUnitPrice(rst.getDouble("UnitPrice"));
            dto.setQtyOnHand(rst.getInt("QtyOnHand"));
        }
        return dto;
        
    }
    
}

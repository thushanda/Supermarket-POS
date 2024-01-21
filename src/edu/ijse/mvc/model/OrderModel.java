/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.OrderDetailDto;
import edu.ijse.mvc.dto.OrderDto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thush
 */
public class OrderModel {

    Connection conn;

    public String placeOrder(OrderDto orderDto, ArrayList<OrderDetailDto> orderDetailDtos) throws Exception {
        conn = DBConnection.getInstance().getConnection();

        try {
            //order save
            conn.setAutoCommit(false);
            String orderSql = "INSERT INTO Orders VALUE(?,?,?)";
            PreparedStatement orderStatement = conn.prepareStatement(orderSql);
            orderStatement.setString(1, orderDto.getOrderID());
            orderStatement.setString(2, orderDto.getOrderDate());
            orderStatement.setString(3, orderDto.getCustID());

            boolean isSaveOrder = orderStatement.executeUpdate() > 0;

            if (isSaveOrder) {
               boolean isSaveOrderDetail = true;
               String orderDetailSql = "INSERT INTO OrderDetail VALUE(?,?,?,?)";
                for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                    PreparedStatement orderDetailStatement = conn.prepareStatement(orderDetailSql);
                    orderDetailStatement.setString(1, orderDto.getOrderID());
                    orderDetailStatement.setString(2, orderDetailDto.getItemCode());
                    orderDetailStatement.setInt(3, orderDetailDto.getOrderQTY());
                    orderDetailStatement.setInt(4, orderDetailDto.getDiscount());
                    
                    if (!(orderDetailStatement.executeUpdate() > 0 )) {
                        isSaveOrderDetail = false;
                    }  
                }
                if (isSaveOrderDetail) {
                    boolean isUpdateItem = true;
                    String itemUpdateSql = "UPDATE Item SET QtyOnHand = QtyOnHand - ? WHERE ItemCode = ?";
                    for (OrderDetailDto orderDetailDto : orderDetailDtos) {
                        PreparedStatement itemStatement = conn.prepareStatement(itemUpdateSql);
                        itemStatement.setInt(1, orderDetailDto.getOrderQTY());
                        itemStatement.setString(2, orderDetailDto.getItemCode());
                        
                        if (!(itemStatement.executeUpdate() > 0)) {
                            isUpdateItem = false;
                        }
                    }
                    if (isUpdateItem) {
                        conn.commit();
                        return "Success";
                    }else{
                        conn.rollback();
                        return "Item Update Error";
                    }
                    
                }else{
                    conn.rollback();
                    return "Order Detail Save Error";
                }
               
            } else {
                conn.rollback();
                return "Order Save Error";
            }

        } catch (Exception ex) {
            conn.rollback();
            ex.printStackTrace();
            return ex.getMessage();
        } finally {
            conn.setAutoCommit(true);
        }

    }

}

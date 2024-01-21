/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.model;

import java.sql.PreparedStatement;
import java.sql.Connection;
import edu.ijse.mvc.db.DBConnection;
import edu.ijse.mvc.dto.CustomerDto;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author thush
 */
public class CustomerModel {

    Connection conn;
    PreparedStatement statement;

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        conn = DBConnection.getInstance().getConnection();

        String sql = "INSERT INTO Customer VALUE (?,?,?,?,?,?,?,?,?)";

        statement = conn.prepareStatement(sql);
        statement.setString(1, customerDto.getCustId());
        statement.setString(2, customerDto.getTitle());
        statement.setString(3, customerDto.getName());
        statement.setString(4, customerDto.getDob());
        statement.setDouble(5, customerDto.getSalary());
        statement.setString(6, customerDto.getAddress());
        statement.setString(7, customerDto.getCity());
        statement.setString(8, customerDto.getProvince());
        statement.setString(9, customerDto.getZip());

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        conn = DBConnection.getInstance().getConnection();
        String get = "SELECT * FROM customer";
        statement = conn.prepareStatement(get);
        ResultSet res = statement.executeQuery();

        ArrayList<CustomerDto> customerDtos = new ArrayList<>();
        
        while (res.next()) {
            CustomerDto dto = new CustomerDto();
            dto.setCustId(res.getString("CustID"));
            dto.setTitle(res.getString("CustTitle"));
            dto.setName(res.getString("CustName"));
            dto.setDob(res.getString("DOB"));
            dto.setSalary(res.getDouble("salary"));
            dto.setAddress(res.getString("CustAddress"));
            dto.setCity(res.getString("City"));
            dto.setProvince(res.getString("Province"));
            dto.setZip(res.getString("PostalCode"));

            customerDtos.add(dto);
        }

        return customerDtos;

    }

    public CustomerDto searchCustomer(String id) throws Exception {
        conn = DBConnection.getInstance().getConnection();

        String sql = "SELECT * FROM Customer WHERE CustID = ?";
        statement = conn.prepareStatement(sql);
        statement.setString(1, id);

        ResultSet rst = statement.executeQuery();

        CustomerDto dto = null;
        while (rst.next()) {
            dto = new CustomerDto();

            dto.setCustId(rst.getString("CustID"));
            dto.setTitle(rst.getString("CustTitle"));
            dto.setName(rst.getString("CustName"));
            dto.setDob(rst.getString("DOB"));
            dto.setSalary(rst.getDouble("salary"));
            dto.setAddress(rst.getString("CustAddress"));
            dto.setCity(rst.getString("City"));
            dto.setProvince(rst.getString("Province"));
            dto.setZip(rst.getString("PostalCode"));
        }
        return dto;
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        conn = DBConnection.getInstance().getConnection();

        String sql = "UPDATE Customer SET CustTitle=?, CustName=?, DOB=?, salary=?,"
                + " CustAddress=?, City=? , Province=?, PostalCode=? WHERE CustID=?";

        statement = conn.prepareStatement(sql);
        statement.setString(1, customerDto.getTitle());
        statement.setString(2, customerDto.getName());
        statement.setString(3, customerDto.getDob());
        statement.setDouble(4, customerDto.getSalary());
        statement.setString(5, customerDto.getAddress());
        statement.setString(6, customerDto.getCity());
        statement.setString(7, customerDto.getProvince());
        statement.setString(8, customerDto.getZip());
        statement.setString(9, customerDto.getCustId());

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }

    }

    public String deleteCustomer(String id) throws Exception {
        conn = DBConnection.getInstance().getConnection();

        String sql = "DELETE FROM Customer WHERE CustID=?";

        statement = conn.prepareStatement(sql);
        statement.setString(1, id);

        if (statement.executeUpdate() > 0) {
            return "Success";
        } else {
            return "Fail";
        }
    }

}

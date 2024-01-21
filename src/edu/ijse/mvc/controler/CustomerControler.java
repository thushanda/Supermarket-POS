/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controler;

import edu.ijse.mvc.dto.CustomerDto;
import edu.ijse.mvc.model.CustomerModel;
import java.util.ArrayList;

/**
 *
 * @author thush
 */
public class CustomerControler {

    private CustomerModel customerModel;

    public CustomerControler() {
        customerModel = new CustomerModel();
    }

    public String saveCustomer(CustomerDto customerDto) throws Exception {
        return customerModel.saveCustomer(customerDto);
    }

    public ArrayList<CustomerDto> getAllCustomers() throws Exception {
        return (ArrayList<CustomerDto>) customerModel.getAllCustomers();
    }

    public CustomerDto searchCustomer(String id) throws Exception {
        return customerModel.searchCustomer(id);
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
        return customerModel.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception {
        return customerModel.deleteCustomer(id);
    }
}

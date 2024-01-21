
package edu.ijse.mvc.dto;


public class OrderDetailDto {
    private String OrderID;
    private String ItemCode;
    private Integer OrderQTY;
    private Integer Discount;

    /**
     * @return the OrderID
     */
    public String getOrderID() {
        return OrderID;
    }

    /**
     * @param OrderID the OrderID to set
     */
    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the OrderQTY
     */
    public Integer getOrderQTY() {
        return OrderQTY;
    }

    /**
     * @param OrderQTY the OrderQTY to set
     */
    public void setOrderQTY(Integer OrderQTY) {
        this.OrderQTY = OrderQTY;
    }

    /**
     * @return the Discount
     */
    public Integer getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(Integer Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        return "OrderDetailDto{" + "OrderID=" + OrderID + ", ItemCode=" + ItemCode + ", OrderQTY=" + OrderQTY + ", Discount=" + Discount + '}';
    }
    
    
}

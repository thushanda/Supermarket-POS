package edu.ijse.mvc.dto;

public class ItemDto {

    private String ItemCode;
    private String Description;
    private String PackSize;
    private Double UnitPrice;
    private Integer QtyOnHand;

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
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * @return the PackSize
     */
    public String getPackSize() {
        return PackSize;
    }

    /**
     * @param PackSize the PackSize to set
     */
    public void setPackSize(String PackSize) {
        this.PackSize = PackSize;
    }

    /**
     * @return the UnitPrice
     */
    public Double getUnitPrice() {
        return UnitPrice;
    }

    /**
     * @param UnitPrice the UnitPrice to set
     */
    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * @return the QtyOnHand
     */
    public Integer getQtyOnHand() {
        return QtyOnHand;
    }

    /**
     * @param QtyOnHand the QtyOnHand to set
     */
    public void setQtyOnHand(Integer QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "ItemCode=" + ItemCode + ", Description=" + Description + ", PackSize=" + PackSize + ", UnitPrice=" + UnitPrice + ", QtyOnHand=" + QtyOnHand + '}';
    }
    
}

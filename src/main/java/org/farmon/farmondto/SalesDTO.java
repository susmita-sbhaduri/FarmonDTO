/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.farmon.farmondto;

import java.io.Serializable;

/**
 *
 * @author sb
 */
public class SalesDTO implements Serializable {
    private String salesId;    
    private String cropId;   
    private String cropName; 
    private String prodId;
    private String productname;
    private String produnit;
    private String harvestId;
    private String siteid;
    private String siteName;
    private String harvestName;
    private String buyerId;
    private String buyerName;
    private String quantitySold;
    private String priceperUnit;
    private String salesDate;
    private String currentInventoryQty;
    private String totalSales;
    private String expenseComments;
    
    public String getSalesId() {
        return salesId;
    }

    public void setSalesId(String salesId) {
        this.salesId = salesId;
    }

    public String getCropId() {
        return cropId;
    }

    public void setCropId(String cropId) {
        this.cropId = cropId;
    }

    public String getHarvestId() {
        return harvestId;
    }

    public void setHarvestId(String harvestId) {
        this.harvestId = harvestId;
    }

    public String getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(String quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getPriceperUnit() {
        return priceperUnit;
    }

    public void setPriceperUnit(String priceperUnit) {
        this.priceperUnit = priceperUnit;
    }

    public String getSalesDate() {
        return salesDate;
    }

    public void setSalesDate(String salesDate) {
        this.salesDate = salesDate;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProdunit() {
        return produnit;
    }

    public void setProdunit(String produnit) {
        this.produnit = produnit;
    }

    public String getCurrentInventoryQty() {
        return currentInventoryQty;
    }

    public void setCurrentInventoryQty(String currentInventoryQty) {
        this.currentInventoryQty = currentInventoryQty;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getSiteid() {
        return siteid;
    }

    public void setSiteid(String siteid) {
        this.siteid = siteid;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getHarvestName() {
        return harvestName;
    }

    public void setHarvestName(String harvestName) {
        this.harvestName = harvestName;
    }

    public String getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(String totalSales) {
        this.totalSales = totalSales;
    }

    public String getExpenseComments() {
        return expenseComments;
    }

    public void setExpenseComments(String expenseComments) {
        this.expenseComments = expenseComments;
    }
    
}

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
public class ProductStageDTO implements Serializable {
    private String id;    
    private String cropId;
    private String cropName;
    private String productId;
    private String productName;
    private String prodStageId;
    private String prodStageName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCropId() {
        return cropId;
    }

    public void setCropId(String cropId) {
        this.cropId = cropId;
    }

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdStageId() {
        return prodStageId;
    }

    public void setProdStageId(String prodStageId) {
        this.prodStageId = prodStageId;
    }

    public String getProdStageName() {
        return prodStageName;
    }

    public void setProdStageName(String prodStageName) {
        this.prodStageName = prodStageName;
    }
    
}
